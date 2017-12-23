package com.ct.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ct.utilities.Driver;



public class CT_HomePage {

	public CT_HomePage(){
		
		PageFactory.initElements(Driver.getInstance(), this);
	}
	
	
	@FindBy(css=".tempHeadContBdr")
	public WebElement ct_Loan;
	
	@FindBy(xpath="//*[@id='error-SingleLine']")
	public WebElement errorFistName;
	
	@FindBy(xpath="//span/input[@name='SingleLine']")
	public WebElement firstName;
	
	@FindBy(name="SingleLine1")
	public WebElement middleName;
	
	@FindBy(name="SingleLine2")
	public WebElement lastName;
	
	@FindBy(css="input#Radio_1.radioBtnType")
    public WebElement GenderMale;

    @FindBy(css="input#Radio_2.radioBtnType")
    public WebElement GenderFemale;

    @FindBy(xpath = "//*[@id='Date-date']")
    public WebElement DateOfBirth;
    
    @FindBy(xpath="//div[@class='ui-datepicker-title']/select[@class='ui-datepicker-month']")
    public WebElement selectMonth;
    
    @FindBy(xpath="//div[@class='ui-datepicker-title']/select[@class='ui-datepicker-year']")
    public WebElement selectYear;
    
    @FindBy(css= "label.formSubInfoText")
    public WebElement dateFormat;

    @FindBy(xpath = "//*[@id='Number-li']/div[1]/span/input")
    public WebElement PersonalFileID;

    //dilek added this part
    @FindBy(xpath="//*[@id='formAccess']/div[1]/div/div/button/em")
    public WebElement NextButton;
	
	
}
