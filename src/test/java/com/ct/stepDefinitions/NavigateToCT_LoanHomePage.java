package com.ct.stepDefinitions;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import com.ct.utilities.CTContstants;
import com.ct.utilities.Driver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NavigateToCT_LoanHomePage {

	@Given("^I am on the home page of CT-Loan home page$")
	public void i_am_on_the_home_page_of_CT_Loan_home_page() throws Throwable {
		Driver.getInstance().get(CTContstants.QA_URL);
	}

	@When("^I scroll down the page$")
	public void i_scroll_down_the_page() throws Throwable {
		JavascriptExecutor jse= (JavascriptExecutor)Driver.getInstance();
		   jse.executeScript("window.scrollBy(0, 400)");
		   Thread.sleep(2000);
		   jse.executeScript("window.scrollBy(0, 0)");
		   
	}

	@Then("^I should be able to see text CT-Loan and user information boxes$")
	public void i_should_be_able_to_see_text_CT_Loan_and_user_information_boxes() throws Throwable {
		 WebElement ctLoanText = Driver.getInstance().findElement(By.xpath("//span[contains(text(),'CT Loan')]"));
		   ctLoanText.isDisplayed();
	}
	

	
}
