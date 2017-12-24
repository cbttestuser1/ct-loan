package com.ct.stepDefinitions;



import org.junit.Assert;
import com.ct.pages.CTL_30_Personal_Information;
import com.ct.utilities.CTContstants;
import com.ct.utilities.Driver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CTL_30_Positive {

CTL_30_Personal_Information hp=new CTL_30_Personal_Information();

@Given("^I am on the CT Loan personal information homepage$")
public void i_am_on_the_CT_Loan_personal_information_homepage() throws Throwable {
   
	Thread.sleep(3000);
	Driver.getInstance().get(CTContstants.QA_URL);
	Driver.getInstance().switchTo().defaultContent();
	Driver.getInstance().switchTo().parentFrame();
	Driver.getInstance().switchTo().frame(1);
		//Verify url
	String actualUrl=Driver.getInstance().getCurrentUrl();
	String expectedUrl="http://cybertekschool.com/ctl.qa";
//		    Assert.assertTrue(actualUrl.equals(expectedUrl));  // verify with assertTrue()
	Assert.assertEquals(expectedUrl, actualUrl); // verify with assertEqual()
			
	//verify title
	//System.out.println(Driver.getInstance().getTitle());
	String actualTitle=Driver.getInstance().getTitle();
	String title="CT Loan – Cybertek";
	Assert.assertTrue(title.equals(actualTitle));

}

@When("^I enter the applicant First Name as \"([^\"]*)\"$")
public void i_enter_the_applicant_First_Name_as(String arg1) throws Throwable {
    
hp.firstName.sendKeys(arg1);

}

@When("^I enter the applicant Middle Initial as \"([^\"]*)\"$")
public void i_enter_the_applicant_Middle_Initial_as(String arg1) throws Throwable {
   
	hp.middleName.sendKeys(arg1);
	

}

@When("^I enter the applicant Last Name as \"([^\"]*)\"$")
public void i_enter_the_applicant_Last_Name_as(String arg1) throws Throwable {
   
	hp.lastName.sendKeys(arg1);
	
}

@When("^I select the applicant gender as male$")
public void i_select_the_applicant_gender_as_male() throws Throwable {
   
	Thread.sleep(3000);
	hp.male.click();

}

@When("^I select the applicant gender as female$")
public void i_select_the_applicant_gender_as_female() throws Throwable {
    
	hp.female.click();

}

@When("^I select the applicant DOB as \"([^\"]*)\"$")
public void i_select_the_applicant_DOB_as(String arg1) throws Throwable {
   
	hp.dateOfBirth.sendKeys(arg1);

}

@When("^I enter the applicant SSN/Personal File ID as \"([^\"]*)\"$")
public void i_enter_the_applicant_SSN_Personal_File_ID_as(String arg1) throws Throwable {
	
	hp.sSN.sendKeys(arg1);
  

}

@When("^I click on the Next button$")
public void i_click_on_the_Next_button() throws Throwable {
   
	hp.next.click();

}

@Then("^the contact information page should appear$")
public void the_contact_information_page_should_appear() throws Throwable {
   
	//verify title
	System.out.println(Driver.getInstance().getTitle());
	String contInfoPageActualTitle=Driver.getInstance().getTitle();
	String title="CT Loan – Cybertek";
	Assert.assertTrue(title.equals(contInfoPageActualTitle));


}
}