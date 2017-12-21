package com.ct.stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.ct.pages.CT_CloanHomePage_1;
import com.ct.utilities.CTContstants;
import com.ct.utilities.Driver;

import cucumber.api.java.en.Given;

public class CT_CloanStepDefs_1 {

	CT_CloanHomePage_1 page1 = new CT_CloanHomePage_1();
	WebDriver driver = Driver.getInstance();
	private JavascriptExecutor js = (JavascriptExecutor) driver;

	
	@Given("^the customer is on the personal information form$")
	public void the_customer_is_on_the_personal_information_form() throws Throwable {

		driver.get(CTContstants.QA_URL);
		int size = driver.findElements(By.tagName("iframe")).size();
		// System.out.println(size);

		driver.switchTo().frame(1);

		js.executeScript("window.scrollBy(0, 700);");

	}

	@Given("^the customer enters \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void the_customer_enters(String firstName, String middleName, String lastName, String dateOfBirth,
			String personalFileID) throws Throwable {

		page1.fillOutTheForm(firstName, middleName, lastName, dateOfBirth, personalFileID);
		Thread.sleep(1000);

	}

	@Given("^the customer selects the gender$")
	public void the_customer_selects_the_gender() throws Throwable {

		
		
		boolean isChecked = page1.maleBtn.isSelected();

		Thread.sleep(1000);
		if (!isChecked) {
			page1.maleBtn.click();
		} else {
			System.out.println("Gender option is already selected");
		}

	}

	@Given("^the customer clicks on the next button$")
	public void the_customer_clicks_on_the_next_button() throws Throwable {

		page1.errorMessage();

	}

}
