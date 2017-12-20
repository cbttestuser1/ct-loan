package com.ct.stepDefinitions;

import org.openqa.selenium.WebDriver;

import com.ct.pages.CT_HomePage;
import com.ct.utilities.CTContstants;
import com.ct.utilities.Driver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class PersonalInformationCT_LoanPart2 {
	WebDriver driver=Driver.getInstance();
    CT_HomePage homePage=new CT_HomePage();

	@Given("^User navigates to the following url: \"([^\"]*)\"$")
	public void user_navigates_to_the_following_url(String arg1) throws Throwable {
		 driver.get(CTContstants.QA_URL);

	}

	@Given("^user enters Date of Birth$")
	public void user_enters_Date_of_Birth() throws Throwable {
	     
//      JavascriptExecutor js= (JavascriptExecutor) driver;
//      js.executeScript("window.scrollBy(, 700)");
//      boolean isChecked=homePage.genderMale.isSelected();
//
//      if(!isChecked) {
//      driver.switchTo().frame(0);
//      homePage.name.sendKeys("John");
//      homePage.lastName.sendKeys("Smith");
//      homePage.genderMale.click();
//      }else {
//          System.out.println("it already clicked");
//
//      }
            
      
      //homePage.genderFemale.click();
      
      
    
      
      
	
	}

	@Then("^Verify field size for MM max (\\d+) digits, can accept number between (\\d+)-(\\d+); If one digit, add zero to front$")
	public void verify_field_size_for_MM_max_digits_can_accept_number_between_If_one_digit_add_zero_to_front(int arg1,
			int arg2, int arg3) throws Throwable {
//      Verify field size for MM max 2 digits,
      //if()
//      can accept number between 1-12;
          
//      If one digit, add zero to front
//          for(int i=1;i<=9;i++) {
//              mm=0+i;
//          }
		
	}

	@Then("^Field size for DD: max (\\d+) digits; Can accept number between (\\d+)-(\\d+), depends on month; If one digit, add zero to front;$")
	public void field_size_for_DD_max_digits_Can_accept_number_between_depends_on_month_If_one_digit_add_zero_to_front(
			int arg1, int arg2, int arg3) throws Throwable {
		
	}

	@Then("^Field size YYYY: max (\\d+) digits; Can accept number between (\\d+) and \\(current date minus (\\d+) years\\);$")
	public void field_size_YYYY_max_digits_Can_accept_number_between_and_current_date_minus_years(int arg1, int arg2,
			int arg3) throws Throwable {
		
	}

	@Then("^User enters SSN/Personal File ID$")
	public void user_enters_SSN_Personal_File_ID() throws Throwable {
		
	}

	@Then("^Verify do not accept any other characters other than digits (\\d+)-(\\d+); Cannot be null; Cannot contain any spaces\\.$")
	public void verify_do_not_accept_any_other_characters_other_than_digits_Cannot_be_null_Cannot_contain_any_spaces(
			int arg1, int arg2) throws Throwable {
		
		
	}

}
