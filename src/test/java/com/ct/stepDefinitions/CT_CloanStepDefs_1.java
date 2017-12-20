package com.ct.stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.ct.pages.CT_CloanHomePage_1;
import com.ct.utilities.CTContstants;
import com.ct.utilities.Driver;

import cucumber.api.java.en.Given;

public class CT_CloanStepDefs_1 {

	CT_CloanHomePage_1 cLoanPersonalInfoPage = new CT_CloanHomePage_1();
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

		
//		boolean isChecked = false;
//		int size = cLoanPersonalInfoPage.maleBtn.size();
//		System.out.println("Size of the list: " + size);
//
//		for (int i = 0; i < size; i++) {
//
//			isChecked = cLoanPersonalInfoPage.maleBtn.get(i).isSelected();
//
//			if (!isChecked) {
//
//				cLoanPersonalInfoPage.maleBtn.get(i).click();
//				Thread.sleep(2000);
//
//			}
//		}
		
		
		
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

		cLoanPersonalInfoPage.errorMessage();

	}

}
