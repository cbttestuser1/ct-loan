package com.ct.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ct.utilities.Driver;

public class CTL_Employment_Infor_Mandatory_Fields {

	public CTL_Employment_Infor_Mandatory_Fields() {
		PageFactory.initElements(Driver.getInstance(), this);
	}

	@FindBy(id = "error-Dropdown")
	public WebElement errorTitle;

	@FindBy(id = "error-Dropdown1")
	public WebElement errorDepartment;

	@FindBy(id = "error-Dropdown2")
	public WebElement errorDurationOfEmp;

	@FindBy(id = "error-Dropdown3")
	public WebElement errorPurposeOfLoan;

	@FindBy(id = "error-Dropdown4")
	public WebElement errorSupervisor;
	
	@FindBy(xpath = "/descendant::button[@class='fmSmtButton next_previous'][5]")
	public WebElement nextBtn;
	
	

}
