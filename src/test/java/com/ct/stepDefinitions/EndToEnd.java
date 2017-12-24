package com.ct.stepDefinitions;

import com.ct.pages.CT_HomePage;
import com.ct.pages.ContactInfoHomePage;
import com.ct.pages.empInfoPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EndToEnd {
	CT_HomePage personhome=new CT_HomePage();
	ContactInfoHomePage contactInfo= new ContactInfoHomePage();
	empInfoPage emp=new empInfoPage();
	@When("^User enters firstName as pos \"([^\"]*)\" and lastName \"([^\"]*)\"$")
	public void user_enters_firstName_as_pos_and_lastName(String firstName, String lastName) throws Throwable {
		personhome.firstName.sendKeys(firstName);
		personhome.lastName.sendKeys(lastName);
		   Thread.sleep(1000);
	}

	@When("^User selects gender pos \"([^\"]*)\"$")
	public void user_selects_gender_pos(String gender) throws Throwable {
		 if(gender.equals("F")){
			 personhome.GenderFemale.click();
		    }else if(gender.equals("M")){
		    	personhome.GenderMale.click();
		    }else{
		    	System.out.println("no gender");
		    }
	}

	@When("^User enters date pos \"([^\"]*)\"$")
	public void user_enters_date_pos(String date) throws Throwable {
		personhome.DateOfBirth.sendKeys(date);
	}

	@When("^Userenters ssn pos \"([^\"]*)\"$")
	public void userenters_ssn_pos(String ssn) throws Throwable {
		personhome.PersonalFileID.sendKeys(ssn);
	}


	@Given("^I am on the contactPage$")
	public void i_am_on_the_contactPage() throws Throwable {
		System.out.println("you need codes also");
	}

	@When("^I fill addressline(\\d+) <Address>$")
	public void i_fill_addressline_Address(String adddress) throws Throwable {
		contactInfo.streetAddress.sendKeys(adddress);
		contactInfo.addressLine2.sendKeys("agtfrh");
	}

	@When("^I fill city \"([^\"]*)\"$")
	public void i_fill_city(String city) throws Throwable {
	   contactInfo.City.sendKeys(city);
	}

	@When("^I fill State \"([^\"]*)\"$")
	public void i_fill_State(String state) throws Throwable {
	  contactInfo.State.sendKeys("VA");
	}

	@When("^I fill ZipCode \"([^\"]*)\"$")
	public void i_fill_ZipCode(String zipcode) throws Throwable {
	   contactInfo.postalZip.sendKeys(zipcode); 
	}

	@When("^I select country \"([^\"]*)\"$")
	public void i_select_country(String country) throws Throwable {
	
		contactInfo.Country2.sendKeys("United States");
	}

	@When("^I enter personal phone number\"([^\"]*)\"$")
	public void i_enter_personal_phone_number(String phonenumber) throws Throwable {
	    contactInfo.personalPh1.sendKeys("2536598652");
	    contactInfo.personalPh2.sendKeys("5265326321");
	    contactInfo.number.sendKeys(phonenumber);
	    
	}

	@When("^I enter personal email <persEmail >$")
	public void i_enter_personal_email_persEmail() throws Throwable {
	  contactInfo.PersonalEmail.sendKeys("abd@gmail.com");
	}

	@When("^I enter work email \"([^\"]*)\"$")
	public void i_enter_work_email(String workEmail) throws Throwable {
	   contactInfo.workEmail.sendKeys(workEmail);
	}

	@Then("^I click next button in contactpage$")
	public void i_click_next_button_in_contactpage() throws Throwable {
	   contactInfo.nextButton.click();
	}


	@When("^I enter personal email \"([^\"]*)\"$")
public void i_enter_personal_email(String arg1) throws Throwable {
		 contactInfo.PersonalEmail.sendKeys("abd@gmail.com");
}
	@Given("^I am on employment page$")
	public void i_am_on_employment_page() throws Throwable {
	    System.out.println("emloyment");
	}

	@When("^I fill title \"([^\"]*)\"$")
	public void i_fill_title(String title) throws Throwable {
	    emp.Title.sendKeys(title);
	}

	@When("^I fill department \"([^\"]*)\"$")
	public void i_fill_department(String department) throws Throwable {
	   emp.Department.sendKeys(department);
	}

	@When("^I fill duration \"([^\"]*)\"$")
	public void i_fill_duration(String duration) throws Throwable {
	   emp.durationOfEmp.sendKeys(duration);
	}

	@When("^I fill purposeLoan \"([^\"]*)\"$")
	public void i_fill_purposeLoan(String purposeLoan) throws Throwable {
	    emp.purposeOfLoan.sendKeys(purposeLoan);
	}

	@When("^I select supervisor \"([^\"]*)\"$")
	public void i_select_supervisor(String supervisor) throws Throwable {
	   emp.supervisor.sendKeys(supervisor);
	}

	@Then("^I click next button in employmentpage$")
	public void i_click_next_button_in_employmentpage() throws Throwable {
	    emp.nextButton.click();
	    Thread.sleep(2000);
	   
	}

}
