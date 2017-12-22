package com.ct.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ct.utilities.Driver;

public class CT_CloanHomePage_1_CTL121 {

	public CT_CloanHomePage_1_CTL121() {

		PageFactory.initElements(Driver.getInstance(), this);

	}

	@FindBy(xpath = "//label[@for='Radio_1']")
	public WebElement maleRadioButton;

	@FindBy(xpath = "//label[@for='Radio_2']")
	public WebElement femaleRadioButton;

}
