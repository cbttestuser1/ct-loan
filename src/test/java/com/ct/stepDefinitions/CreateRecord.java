package com.ct.stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;

import com.ct.pages.CT_59_employmentInfo;
import com.ct.pages.CT_HomePage_Personal_Information;
import com.ct.pages.ContactInfoPage;
import com.ct.pages.FinancialInfoPage;
import com.ct.utilities.Driver;


public class CreateRecord {
	
	public static void SubmitNewApplication(String firstName, String middleName, String lastName, String dob, String gender, String personId) {
		CT_HomePage_Personal_Information personInfo = new CT_HomePage_Personal_Information();
		ContactInfoPage infoPage=new ContactInfoPage();
		CT_59_employmentInfo empInfo=new CT_59_employmentInfo();
		FinancialInfoPage  finance=new FinancialInfoPage();
		
		personInfo.FirstName.sendKeys(firstName);
		personInfo.MiddleName.sendKeys(middleName);
		personInfo.LasttName.sendKeys(lastName);
		((JavascriptExecutor) Driver.getInstance()).executeScript("arguments[0].checked = true;", personInfo.GenderMale);
		personInfo.DateOfBirth.sendKeys("01/01/1980");
		personInfo.PersonalFileID.sendKeys(personId);
		Driver.getInstance().findElement(By.cssSelector(".next_previous")).click();
		
		infoPage.Address1.sendKeys("1 aaaa");
		infoPage.Address2.sendKeys("bbb");
		infoPage.City.sendKeys("McLean");
		infoPage.Region.sendKeys("rrr");
		infoPage.ZipCode.sendKeys("22000");
		infoPage.Cell1.sendKeys("2022222222");
		infoPage.Cell2.sendKeys("2022222223");
		infoPage.Cell3.sendKeys("2022222224");
		infoPage.WorkNum1.sendKeys("2022222225");
		infoPage.WorkNum2.sendKeys("2022222226");		
		infoPage.WorkNum3.sendKeys("2022222227");
		infoPage.Extension.sendKeys("11111");
		infoPage.Email.sendKeys("loanct7@gmail.com");
		infoPage.WorkEmail.sendKeys("loanct7@gmail.com");
		Select dropdown = new Select(infoPage.Country);
		dropdown.selectByVisibleText("United States");
		Driver.getInstance().findElement(By.xpath("(//*[contains(@class,'nextAlign')])[2]")).click();

		Select dropdownList = new Select(empInfo.titleSelect);
		dropdownList.selectByValue("QA");
	    dropdownList = new Select(empInfo.departSelect);
		dropdownList.selectByValue("Development");
		dropdownList = new Select(empInfo.durationSelect);
		dropdownList.selectByValue("3-5");
		dropdownList = new Select(empInfo.purposeSelect);
		dropdownList.selectByValue("Mortgage");
		dropdownList = new Select(empInfo.superviseSelect);
		dropdownList.selectByValue("Zachary Taylor");
		empInfo.nextButton.click();
		
		finance.firstAppYes.click();
		finance.applications.sendKeys("0");
		finance.annualIncome.sendKeys("100000");
		Select select = new Select(finance.incomeType);
		select.selectByVisibleText("Yearly");
		finance.rentHouse.click();
		finance.montlyRent.sendKeys("2000");
		finance.dependents.sendKeys("2");
		finance.savingAmount.sendKeys("0");
		select = new Select(finance.loanTerm);
		select.selectByVisibleText("36 months");
		finance.decisionBox.click();
		finance.fullName.sendKeys(firstName+" "+lastName);
		finance.singleLine.sendKeys("");
		finance.calender.sendKeys("12/23/2017");
		finance.submitButton.click();
		
	}

}
