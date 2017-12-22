package com.ct.stepDefinitions;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ct.pages.CT_CloanHomePage_1;
import com.ct.pages.CT_CloanHomePage_2;
import com.ct.pages.CT_CloanHomePage_3;
import com.ct.pages.CT_CloanJDBCProject;
import com.ct.utilities.CTContstants;
import com.ct.utilities.Driver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Ultimate_Happy_Path_StepDef {
	
	WebDriver driver=Driver.getInstance();
	private JavascriptExecutor js = (JavascriptExecutor) driver;
	
	CT_CloanHomePage_1 page1 = new CT_CloanHomePage_1();
	CT_CloanHomePage_2 page2 = new CT_CloanHomePage_2();
	CT_CloanHomePage_3 page3 = new CT_CloanHomePage_3();
	CT_CloanJDBCProject page4=new CT_CloanJDBCProject();

	@Given("^as User is on CTLoan home page$")
	public void as_User_is_on_CTLoan_home_page() throws Throwable {
		driver.get(CTContstants.QA_URL);
		int size = driver.findElements(By.tagName("iframe")).size();

		driver.switchTo().frame(1);

		js.executeScript("window.scrollBy(0, 700);");
	    
	}

	@Given("^User select gender as gender$")
	public void user_select_gender_as_gender() throws Throwable {
		boolean isChecked = page1.maleBtn.isSelected();

		Thread.sleep(1000);
		if (!isChecked) {
			page1.maleBtn.click();
		} else {
			System.out.println("Gender option is already selected");
		}

	  
	}

	@When("^User enter name as \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void user_enter_name_as(String firstName, String middleName, String lastName, String dateOfBirth, String personalFileID) throws Throwable {
		page1.fillOutTheForm(firstName, middleName, lastName, dateOfBirth, personalFileID);
		Thread.sleep(1000);
	}

	@When("^User click to next$")
	public void user_click_to_next() throws Throwable {
		page1.nextBtnP1.click();
		Thread.sleep(1000);
	}

	@Given("^User enter address \"([^\"]*)\", \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"  \"([^\"]*)\"$")
	public void user_enter_address(String address, String address1, String city, String state, String zipcode, String country, String ppnumber, String wpnumber, String extention, String personal_email, String work_email) throws Throwable {
	   page2.fillOutTheForm1(address, address1, city, state, zipcode, country, ppnumber, wpnumber, extention, personal_email, work_email);
	   	Thread.sleep(1000);
	}
	

	@Given("^User click next$")
	public void user_click_next() throws Throwable {
		 page2.next.click();
	}

	@Given("^as User select title \"([^\"]*)\" \"([^\"]*)\"  \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void as_User_select_title(String title, String department, String doe, String pol, String supervisor) throws Throwable {
	   page3.fillOutTheForm2(title, department, doe, pol, supervisor);
	   Thread.sleep(1000);
	}

	@Given("^User click next button$")
	public void user_click_next_button() throws Throwable {
	    page3.nextButton.click();
	}

	@Given("^as User select option \"([^\"]*)\" \"([^\"]*)\"  \"([^\"]*)\" \"([^\"]*)\"  \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void as_User_select_option(String app_option, String annual_income, String income_type, String house_option,
			String spend_option, String dep_count, String count_of_savings, String term_option) throws Throwable {
		page4.fillOutTheForm3(app_option, annual_income, income_type, house_option, spend_option, dep_count, count_of_savings, term_option);
		Thread.sleep(2000);
	}

	@Given("^User clicks on agreement checkbox$")
	public void user_clicks_on_agreement_checkbox() throws Throwable {
		
		page4.checkBox.click();
		
	}
	
	@Given("^User enters \"([^\"]*)\" \"([^\"]*)\"$")
	public void user_enters(String fullName, String date) throws Throwable {
	    page4.fillOut(fullName,date);
	}

	@Given("^User click submit$")
	public void user_click_submit() throws Throwable {
	    page4.button.click();
	}

	@Then("^CTLoan should contain text loan application ID$")
	public void ctloan_should_contain_text_loan_application_ID() throws Throwable {
	    Thread.sleep(3000);
	    assertTrue(page4.idMessage.isDisplayed());
	}
}