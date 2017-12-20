package com.ct.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.ct.pages.CT_HomePage_Personal_Information;
import com.ct.utilities.CTContstants;
import com.ct.utilities.Driver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Ctl58_PersonalInformationFileldsLength {
	CT_HomePage_Personal_Information personalInformationPage = new CT_HomePage_Personal_Information();
	

@Given("^I am on the personal information page of CT-Loan$")
public void i_am_on_the_personal_information_page_of_CT_Loan() throws Throwable {
	Driver.getInstance().get(CTContstants.QA_URL);
	 Driver.getInstance().switchTo().frame(1);
}

@When("^I enter first name \"([^\"]*)\"$")
public void i_enter_first_name(String arg1) throws Throwable {
	personalInformationPage.FirstName.sendKeys(arg1);
}

@When("^I enter middle name \"([^\"]*)\"$")
public void i_enter_middle_name(String arg1) throws Throwable {
	personalInformationPage.MiddleName.sendKeys(arg1);
}

@When("^I enter last name \"([^\"]*)\"$")
public void i_enter_last_name(String arg1) throws Throwable {
	personalInformationPage.LasttName.sendKeys(arg1);
}

@When("^I select male$")
public void i_select_male() throws Throwable {
	((JavascriptExecutor) Driver.getInstance()).executeScript("arguments[0].checked = true;", personalInformationPage.GenderMale);
}

@When("^I enter date of birth \"([^\"]*)\"$")
public void i_enter_date_of_birth(String arg1) throws Throwable {
	personalInformationPage.DateOfBirth.sendKeys(arg1);
}

@When("^I enter personal file id \"([^\"]*)\"$")
public void i_enter_personal_file_id(String arg1) throws Throwable {
	personalInformationPage.PersonalFileID.sendKeys(arg1);
}

@When("^I click the next button$")
public void i_click_the_next_button() throws Throwable {
	Driver.getInstance().findElement(By.cssSelector(".next_previous")).click();
}

@Then("^I should be able to see contact information page$")
public void i_should_be_able_to_see_contact_information_page() throws Throwable {
	Assert.assertTrue(Driver.getInstance().findElement(By.xpath("//*[@id=\"Section1-li\"]/h2")).isDisplayed());
}


}
