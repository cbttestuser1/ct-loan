package com.ct.stepDefinitions;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.ct.utilities.CTContstants;
import com.ct.utilities.Driver;

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


public class CTL130_SavingPersonalInfotoPersonTable {
	
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
	//	Assert.assertEquals(record[3].toString(), "01/01/1980");
		Assert.assertEquals(record[4].toUpperCase(), arg5.toUpperCase());
		Assert.assertEquals(record[5], arg6);

		if(arg2.equals("")) {
			Assert.assertEquals(record[1], "");
		}
		
//		DateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
//		String input = dateFormat.format(LocalDate.parse(arg4));
//		Assert.assertTrue(record[3].equals(input));
		
		if(arg4.equals("M"))
			Assert.assertTrue(record[4].equals("M"));
		else 
			Assert.assertTrue(record[4].equals("F"));


	}

}
