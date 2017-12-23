package com.ct.pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.ct.utilities.Driver;

public class CTL55_HomePage {
	public CTL55_HomePage() {

		PageFactory.initElements(Driver.getInstance(), this);
	}

	@FindBy(xpath = "//input[@name='Address_AddressLine1']")
	public WebElement address;

	@FindBy(xpath = "//input[@name='Address_AddressLine2']")
	public WebElement addressLineTwo;

	@FindBy(xpath = "//div[@class='qodef-content']//iframe")
	public WebElement frame;

	@FindBy(xpath = "//input[@name='Address_City']")
	public WebElement city;

	@FindBy(xpath = "//input[@name='Address_Region']")
	public WebElement state;

	@FindBy(xpath = "//input[@name='Address_ZipCode']")
	public WebElement zipCode;

	@FindBy(id = "Address_Country")
	public WebElement selectCountry;

	@FindBy(xpath = "//input[@name='countrycode']")
	public WebElement personalPhoneCountryCode;

	@FindBy(xpath = "//input[@name='first']")
	public WebElement personalPhonePartOne;

	@FindBy(xpath = "//input[@name='second']")
	public WebElement personalPhonePartTwo;

	@FindBy(xpath = "(//input[@name='countrycode'])[2]")
	public WebElement workingPhoneCountryCode;

	@FindBy(xpath = "(//input[@name='first'])[2]")
	public WebElement workingPhonePartOne;

	@FindBy(xpath = "(//input[@name='second'])[2]")
	public WebElement workingPhonePartTwo;

	@FindBy(xpath = "//input[@name='Number1']")
	public WebElement extension;

	@FindBy(xpath = "//input[@name='Email']")
	public WebElement personalEmail;

	@FindBy(xpath = "//input[@name='Email1']")
	public WebElement workingEmail;

	@FindBy(xpath = "(//div/button[@elname='next'])[1]")
	public WebElement nextButton1;

	@FindBy(xpath = "(//div/button[@elname='next'])[2]")
	public WebElement nextButton2;

	@FindBy(id = "Section2-li")
	public WebElement employmentInfo;

	@FindBy(xpath = "//div[@elname='phoneFormatElem']//input")
	public List<WebElement> contactPhones;

	@FindBy(id = "error-Address")
	public WebElement errorPartOne;

	public void switchToIframe(WebElement frame) {
		Driver.getInstance().switchTo().frame(frame);

	}

	public void selectFromDropDown(WebElement country, String value) {
		Select dropdown = new Select(country);
		dropdown.selectByVisibleText(value);

	}

	public static boolean textIsPresent(WebElement element, String expected) {
		Assert.assertEquals(expected, element.getText());
		return true;
	}

	public static void moveToElement(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) Driver.getInstance();
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}

	public static void moveToElementAction(WebElement element) throws InterruptedException {
		Actions action = new Actions(Driver.getInstance());

		Thread.sleep(5000);
		action.moveToElement(element).build().perform();
	}

}
