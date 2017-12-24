package com.ct.stepDefinitions;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.ct.utilities.CTContstants;
import com.ct.utilities.Driver;
import com.ct.utilities.ExcelUtils;
import com.ct.utilities.GmailUtility;
import com.google.api.services.gmail.Gmail;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import com.ct.utilities.DBUtility;
import com.ct.utilities.DBUtility.DBType;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Sprint3Steps {
	
	@Given("^I am on the CT Loan application$")
	public void i_am_on_the_CT_Loan_application() throws Throwable {
		Driver.getInstance().get(CTContstants.QA_URL);
		Driver.getInstance().switchTo().frame(1);
	}

	@Given("^enter valid personal, contact, employment and financial information by sending \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void enter_valid_personal_contact_employment_and_financial_information_by_sending(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6) throws Throwable {
	    CreateRecord.SubmitNewApplication(arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@When("^I submit the form$")
	public void i_submit_the_form() throws Throwable {
		//Thread.sleep(3000);
	     //Driver.getInstance().findElement(By.xpath("//*[@id='richTxtMsgSpan']/label/span")).click();
	}

	@Then("^the personal information should be saved in person table \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void the_personal_information_should_be_saved_in_person_table(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6) throws Throwable {
		DBUtility.establishConnection(DBType.ORACLE);
		List<String[]> queryResult = DBUtility
				.runSQLQuery("SELECT FIRST_NAME, MIDDLE_INIT, LAST_NAME, DATE_OF_BIRTH, GENDER, SSN_NR "
						+ "FROM CTLDEV.PERSON where FIRST_NAME='"+arg1+"' and LAST_NAME='"+arg3+"'");

				
		DBUtility.closeConnections();
		String[] record =queryResult.get(0);
		
		System.out.println(record);
		
		Assert.assertEquals(record[0], arg1);
		Assert.assertEquals(record[1], arg2);
		Assert.assertEquals(record[2], arg3);
		Assert.assertEquals(record[3].toString().substring(0, 10), "1980-01-01");
		Assert.assertEquals(record[4].toUpperCase(), arg5.toUpperCase());
		Assert.assertEquals(record[5], arg6);

		
		if(arg2.equals("")) {
			Assert.assertEquals(record[1], "");
		}
		
//		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
//		LocalDate date = LocalDate.parse("01-Jan-1980", dateFormat);
//		Assert.assertTrue(record[3].equals(date.toString().substring(0, 10)));
		
		if(arg5.toUpperCase().equals("M"))
			Assert.assertTrue(record[4].equals("M"));
		else 
			Assert.assertTrue(record[4].equals("F"));
	}
	
	
	@Given("^enter valid personal, contact, employment and financial information from Excel$")
	public void enter_valid_personal_contact_employment_and_financial_information_from_Excel() throws Throwable {
	
	}

	@Then("^the personal information should be saved in person table$")
	public void the_personal_information_should_be_saved_in_person_table() throws Throwable {
		DBUtility.establishConnection(DBType.ORACLE);
		ExcelUtils.openExcelFile("./src/test/resources/TestData/CT Loan Test Data.xlsx", "Person Data");
		int maxRow=47; //ExcelUtils.getUsedRowsCount();
		for(int i=46;i<=maxRow;i++) {
			String firstName=ExcelUtils.getCellData(i, 0);	
			String middleName="";
			middleName=ExcelUtils.getCellData(i, 1);	
			String lastName=ExcelUtils.getCellData(i, 2);	
			String gender=ExcelUtils.getCellData(i, 3);	
			String dob=ExcelUtils.getCellData(i, 4);	
			String personId=ExcelUtils.getCellData(i, 5);	
		
			CreateRecord.SubmitNewApplication(firstName, middleName, lastName, dob, gender, personId);
			
			List<String[]> queryResult = DBUtility
					.runSQLQuery("SELECT FIRST_NAME, MIDDLE_INIT, LAST_NAME, DATE_OF_BIRTH, GENDER, SSN_NR "
							+ "FROM CTLDEV.PERSON where FIRST_NAME='"+firstName+"' and LAST_NAME='"+lastName+"'");
					
			DBUtility.closeConnections();
			String[] record =queryResult.get(0);
						
			Assert.assertEquals(record[0], firstName);
			Assert.assertEquals(record[1], middleName);
			Assert.assertEquals(record[2], lastName);
			Assert.assertEquals(record[3].toString().substring(0, 10), "1980-01-01");
			Assert.assertEquals(record[4].toUpperCase(), gender.toUpperCase());
			personId=personId.replaceAll("-", "");
			Assert.assertEquals(record[5], personId);

			if(middleName.equals("")) {
				Assert.assertEquals(record[1], "");
			}
			
//			DateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
//			String input = dateFormat.format(LocalDate.parse(personId));
//			Assert.assertTrue(record[3].equals(input));
			
			if(gender.equals("M"))
				Assert.assertTrue(record[4].equals("M"));
			else 
				Assert.assertTrue(record[4].equals("F"));
		}
	
	
	}
	
		@Then("^Then I should get an email confirming my application$")
		public void then_I_should_get_an_email_confirming_my_application() throws Throwable {
			Thread.sleep(3000);
			WebElement result = Driver.getInstance().findElement(By.xpath("//*[@id=\"richTxtMsgSpan\"]/label/div[4]"));
			String resultS = result.getText();
			String applicationId = resultS.split("ID is ")[1].substring(0, 5);
			
			Thread.sleep(10000);
			Gmail service = GmailUtility.getGmailService();
			List<com.google.api.services.gmail.model.Message> messages = GmailUtility.listMessagesMatchingQuery(service,"me","from:training@cybertekschool.com");
			String messageId=messages.get(0).getId();
			String eMailBody=GmailUtility.getMessage(service, "me", messageId);
			
			String eMailAppId = eMailBody.split("application number is ")[1].substring(0, 5);

			Assert.assertTrue(applicationId.equals(eMailAppId));
		}
		
		
		@Then("^Then I should get an email with an attachment$")
		public void then_I_should_get_an_email_with_an_attachment() throws Throwable {			
			Thread.sleep(10000);
			Gmail service = GmailUtility.getGmailService();
			List<com.google.api.services.gmail.model.Message> messages = GmailUtility.listMessagesMatchingQuery(service,"me","from:training@cybertekschool.com");
			String messageId=messages.get(0).getId();
			String attachementName=GmailUtility.getAttachmentName(service,"me",messageId);
			Assert.assertTrue(attachementName.equals("CTLoanDev.pdf"));
		}

}
