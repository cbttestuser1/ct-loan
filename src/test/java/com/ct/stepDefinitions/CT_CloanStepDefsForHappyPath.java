package com.ct.stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.ct.pages.CT_CloanHomePage_1;
import com.ct.pages.CT_CloanHomePage_2;
import com.ct.pages.CT_CloanHomePage_3;
import com.ct.pages.CT_CloanHomePage_4;
import com.ct.utilities.CTContstants;
import com.ct.utilities.Driver;

import cucumber.api.java.en.Given;

public class CT_CloanStepDefsForHappyPath {
	
	WebDriver driver = Driver.getInstance();
	private JavascriptExecutor js = (JavascriptExecutor) driver;
	
	CT_CloanHomePage_1 page1 = new CT_CloanHomePage_1();
	CT_CloanHomePage_2 page2 = new CT_CloanHomePage_2();
	CT_CloanHomePage_3 page3 = new CT_CloanHomePage_3();
	
	Select dd;
	
	@Given("^the user is on the homepage$")
	public void the_user_is_on_the_homepage() throws Throwable {
	    
		driver.get(CTContstants.QA_URL);
		int size = driver.findElements(By.tagName("iframe")).size();
		// System.out.println(size);

		driver.switchTo().frame(1);

		js.executeScript("window.scrollBy(0, 700);");
	}

	@Given("^the user enters the first name$")
	public void the_user_enters_the_first_name() throws Throwable {
	    
		page1.firstNameBox.sendKeys("John");
	    
	}

	@Given("^the user enters the last name$")
	public void the_user_enters_the_last_name() throws Throwable {
		
		page1.lastNameBox.sendKeys("Doe");

	    
	}

	@Given("^the user selects the gender$")
	public void the_user_selects_the_gender() throws Throwable {
	    
		boolean isChecked = page1.maleBtn.isSelected();

		Thread.sleep(1000);
		if (!isChecked) {
			page1.maleBtn.click();
		} else {
			System.out.println("Gender option is already selected");
		}
	    
	}

	@Given("^the user enters the date of birth$")
	public void the_user_enters_the_date_of_birth() throws Throwable {
	    
		page1.dateOfBirthBox.sendKeys("12/01/1980");
	    
	}

	@Given("^the user enters Personal File ID$")
	public void the_user_enters_Personal_File_ID() throws Throwable {
	    
	    page1.personalFileIdBox.sendKeys("1233456789");
		
	}

	@Given("^the user cllicks the next button to navigate to the second page$")
	public void the_user_cllicks_the_next_button_to_navigate_to_the_second_page() throws Throwable {
	    
		page1.nextBtnP1.click();
	    
	}

	@Given("^the user enters the addres$")
	public void the_user_enters_the_addres() throws Throwable {
	    
	    page2.streetAddress.sendKeys("12550 Latona ct");
		
	}

	@Given("^the user enters the apartment number$")
	public void the_user_enters_the_apartment_number() throws Throwable {
	    page2.addressLine2.sendKeys("303");
	    
	}

	@Given("^the user enters the city name$")
	public void the_user_enters_the_city_name() throws Throwable {
	    page2.city.sendKeys("Fairfax");
	    
	}

	@Given("^the user enters the state name$")
	public void the_user_enters_the_state_name() throws Throwable {
	    
		page2.state.sendKeys("VA");
		
	}

	@Given("^the user enters the zip code$")
	public void the_user_enters_the_zip_code() throws Throwable {
	    
		page2.zipCode.sendKeys("22030");
	}

	@Given("^the user enters the country name$")
	public void the_user_enters_the_country_name() throws Throwable {
	    
		page2.country.sendKeys("United States");
	}

	
	@Given("^the user enters the personal phone number as \"([^\"]*)\"$")
	public void the_user_enters_the_personal_phone_number_as(String personalPhone) throws Throwable {
	    
//		page2.personalNum1.sendKeys("7033030303");
//		Thread.sleep(5000);
	    
		String[] numbers = personalPhone.split("-");
		page2.personalNum1.sendKeys(numbers[0]);
		page2.personalNum2.sendKeys(numbers[1]);
		page2.personalNum3.sendKeys(numbers[2]);
		
		Thread.sleep(3000);
	}

	@Given("^the user enters the work phone number as \"([^\"]*)\"$")
	public void the_user_enters_the_work_phone_number_as(String workPhone) throws Throwable {
	    
//		page2.personalNum2.sendKeys("7033030304");

		String[] numbers = workPhone.split("-");

		page2.workNum1.sendKeys(numbers[0]);
		page2.workNum2.sendKeys(numbers[1]);
		page2.workNum3.sendKeys(numbers[2]);
	    
	}

	@Given("^the user enters the personal email$")
	public void the_user_enters_the_personal_email() throws Throwable {
	    
		page2.personalEmail.sendKeys("email@mail.com");
	    
	}

	@Given("^the user enters the work email$")
	public void the_user_enters_the_work_email() throws Throwable {
	    
		page2.workEmail.sendKeys("anotheremail@mail.com");

	}

	@Given("^the user cllicks the next button to navigate to the third page$")
	public void the_user_cllicks_the_next_button_to_navigate_to_the_third_page() throws Throwable {
	    
		page2.next.click();
	    
	}

	@Given("^the user selects the title$")
	public void the_user_selects_the_title() throws Throwable {
	    
	    dd = new Select(page3.title);
	    dd.selectByIndex(1);
		
	}

	@Given("^the user selects the department$")
	public void the_user_selects_the_department() throws Throwable {
	    
		dd = new Select(page3.department);
	    dd.selectByIndex(1);
	    
	}

	@Given("^the user selects the duration of employement$")
	public void the_user_selects_the_duration_of_employement() throws Throwable {
	    
		dd = new Select(page3.durationOfElement);
	    dd.selectByIndex(1);
	    
	}

	@Given("^the user selects the purpose of loan$")
	public void the_user_selects_the_purpose_of_loan() throws Throwable {
	    
		dd = new Select(page3.purposeOfLoan);
	    dd.selectByIndex(1);
	    
	}

	@Given("^the user selects the supervisor$")
	public void the_user_selects_the_supervisor() throws Throwable {

		dd = new Select(page3.supervizor);
	    dd.selectByIndex(1);
	    
	}

	@Given("^the user cllicks the next button to navigate to the fourth page$")
	public void the_user_cllicks_the_next_button_to_navigate_to_the_fourth_page() throws Throwable {
	    
	    page3.nextButton.click();
		
	}
	
	

}