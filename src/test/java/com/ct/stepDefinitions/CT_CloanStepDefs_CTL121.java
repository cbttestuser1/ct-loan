package com.ct.stepDefinitions;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.ct.pages.CT_CloanHomePage_1_CTL121;
import com.ct.utilities.Driver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CT_CloanStepDefs_CTL121 {

	WebDriver driver = Driver.getInstance();
	CT_CloanHomePage_1_CTL121 personalPage = new CT_CloanHomePage_1_CTL121();

	// private JavascriptExecutor js = (JavascriptExecutor) driver;

	@Given("^Verify M is in radio button$")
	public void verify_M_is_in_radio_button() throws Throwable {

		String maleWithM = driver.findElement(By.xpath("//label[@for='Radio_1']")).getText();
		System.out.println(maleWithM);
		assertEquals(maleWithM, "M");

		// WebElement maleWithM = personalPage.maleRadioButton;
		// assertTrue(maleWithM.isDisplayed());

	}

	@Then("^Verify F is in radio buton$")
	public void verify_F_is_in_radio_buton() throws Throwable {

		String FemaleWithF = driver.findElement(By.xpath("//label[@for='Radio_2']")).getText();
		System.out.println(FemaleWithF);
		assertEquals(FemaleWithF, "F");

	}
}
