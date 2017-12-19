package com.ct.stepDefinitions;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.ct.pages.CLoanPersonalInfoPage;
import com.ct.utilities.CTContstants;
import com.ct.utilities.Driver;

import cucumber.api.java.en.Given;

public class CLoanPersonalInfo {

	CLoanPersonalInfoPage cLoanPersonalInfoPage = new CLoanPersonalInfoPage();
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

		cLoanPersonalInfoPage.fillOutTheForm(firstName, middleName, lastName, dateOfBirth, personalFileID);
		Thread.sleep(1000);
		
	}

	@Given("^the customer selects the gender$")
	public void the_customer_selects_the_gender() throws Throwable {

		boolean isChecked = cLoanPersonalInfoPage.maleBtn.isSelected();
		
		Thread.sleep(1000);
		if (!isChecked) {
			cLoanPersonalInfoPage.maleBtn.click();
		} else {
			System.out.println("Gender option is already selected");
		}

		

	}

	@Given("^the customer clicks on the next button$")
	public void the_customer_clicks_on_the_next_button() throws Throwable {

		cLoanPersonalInfoPage.nextBtnP1.click();

		String errorForFirstName = cLoanPersonalInfoPage.errorForFirstName.getText();
		// System.out.println(errorForFirstName);
		assertEquals(errorForFirstName, "Enter a value for this field.");

		String errorForLastName = cLoanPersonalInfoPage.errorForLastName.getText();
		// System.out.println(errorForLastName);
		assertEquals(errorForLastName, "Enter a value for this field.");

		String errorForRadioBtn = cLoanPersonalInfoPage.errorForRadioBtn.getText();
		// System.out.println(errorForRadioBtn);
		assertEquals(errorForRadioBtn, "Select any choice for this field.");

		String errorForBirthDate = cLoanPersonalInfoPage.errorForBirthDate.getText();
		// System.out.println(errorForBirthDate);
		assertEquals(errorForBirthDate, "Select a date for this field.");

		String errorForPersonalFileID = cLoanPersonalInfoPage.errorForPersonalFileID.getText();
		// System.out.println(errorForPersonalFileID);
		assertEquals(errorForPersonalFileID, "Enter a value for this field.");

	}

}
