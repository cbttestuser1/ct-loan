package com.ct.stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.ct.pages.FinancialInfoPage;
import com.ct.utilities.Driver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FinancialCTL {
	 FinancialInfoPage financePage=new FinancialInfoPage();
	    
	    @Given("^The user should be in financial information page$")
	    public void the_user_should_be_in_financial_information_page() throws Throwable {
//	        WebElement finaHeader=Driver.getInstance().findElement(By.xpath("//*[@id='Section3-li']/h2"));
//	        String actHeader=finaHeader.getText();
	        //change in
//	    WebElement iframeFinance=Driver.getInstance().findElement(By.xpath("//div[@class='wpb_column vc_column_container vc_col-sm-12']//iframe"));
//	        Driver.getInstance().switchTo().frame(iframeFinance);
	    }

	    @When("^The user should choose Ct Loan \"([^\"]*)\"$")
	    public void the_user_should_choose_Ct_Loan(String arg1) throws Throwable {
	    	Thread.sleep(500);
	        financePage.firstAppNo.click();
	    }

	    @When("^The user should fill annual income$")
	    public void the_user_should_fill_annual_income() throws Throwable {
	    	Thread.sleep(500);
	      financePage.annualIncome.sendKeys("200000");
	    }

	    @When("^The user should choose income type$")
	    public void the_user_should_choose_income_type() throws Throwable {
	    	WebElement sel= financePage.incomeType;
	    	sel.click();
	    	Thread.sleep(500);
	        Select chooseIncomeType=new Select (sel);
	        chooseIncomeType.selectByValue("Yearly");
	    }

	    @When("^The user should choose house own or rent$")
	    public void the_user_should_choose_house_own_or_rent() throws Throwable {
	    	Thread.sleep(500);
	        financePage.houseRent.click();
	    }

	    @When("^The user should fill spent in one month$")
	    public void the_user_should_fill_spent_in_one_month() throws Throwable {
	    	Thread.sleep(500);
	       financePage.spentOneMonth.sendKeys("3000");
	    }

	    @When("^The user should fill number of dependents$")
	    public void the_user_should_fill_number_of_dependents() throws Throwable {
	    	Thread.sleep(500);
	      financePage.dependent.sendKeys("2");
	    }

	    @When("^The user should fill savings$")
	    public void the_user_should_fill_savings() throws Throwable {
	    	Thread.sleep(500);
	        financePage.savings.sendKeys("60000");
	    }

	    @When("^The user choose the desired loan term$")
	    public void the_user_choose_the_desired_loan_term() throws Throwable {
	    	Thread.sleep(500);
	    	WebElement sel=financePage.loanTerm;
	    	sel.click();
	        Select chooseLoanTerm= new Select(sel);
	        chooseLoanTerm.selectByValue("18 months");
	    }

	    @When("^The user should check confirm box$")
	    public void the_user_should_check_confirm_box() throws Throwable {
	    	Thread.sleep(500);
	        financePage.confirmBox.click();
	    }

	    @When("^The user should enter full name to submit application$")
	    public void the_user_should_enter_full_name_to_submit_application() throws Throwable {
	    	Thread.sleep(500);
	        financePage.fullNameSubmit.sendKeys("Adam Smith");
	    }

	    @When("^the user should type date$")
	    public void the_user_should_type_date() throws Throwable {
	    	Thread.sleep(500);
	        financePage.date.sendKeys("01/01/2018");
	    }

	    @Then("^the user should click submit on finanpage$")
	    public void the_user_should_click_submit_on_finanpage() throws Throwable {
	    	Thread.sleep(500);
	        financePage.submit.click();
	    }

	    @Then("^assert thank you message is displayed$")
	    public void assert_thank_you_message_is_displayed() throws Throwable {
	    	Thread.sleep(500);
	        System.out.println("last step");
	        
	    }
}
