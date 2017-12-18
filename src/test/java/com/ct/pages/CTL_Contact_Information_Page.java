package com.ct.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ct.utilities.Driver;

public class CTL_Contact_Information_Page {

	public CTL_Contact_Information_Page() {
		PageFactory.initElements(Driver.getInstance(), this);
	}

	@FindBy(xpath = "(//button[@class='fmSmtButton next_previous'])[3]")
	public WebElement nextContInfo;

	@FindBy(id = "error-Address")
	public WebElement errorAdres;

	@FindBy(id = "error-PhoneNumber")
	public WebElement errorPerPhone;

	@FindBy(id = "error-PhoneNumber1")
	public WebElement errorWorkPhone;

	@FindBy(id = "error-Email")
	public WebElement errorPerEmail;

	@FindBy(id = "error-Email1")
	public WebElement errorWorkEmail;

}