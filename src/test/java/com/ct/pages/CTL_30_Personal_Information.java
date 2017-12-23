package com.ct.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ct.utilities.Driver;

public class CTL_30_Personal_Information {
	
private WebDriver driver;  
	
	public CTL_30_Personal_Information() {
		
		this.driver = Driver.getInstance();
		PageFactory.initElements(driver, this);
	
	} 
	
	// locators: FindBy css, id, name, tagName, className, linktext, partialLinkTest, xpath
	
	@FindBy(xpath = "//input[@name='SingleLine']") 
	//@FindBy(xpath = "//button[@type='button']") 
	public WebElement firstName;
	
	
	
	@FindBy(xpath="//p[@id='error-SingleLine']")
	public WebElement errorFirstName;
	
	@FindBy(xpath = "//input[@name='SingleLine1']")
	public WebElement middleName;
	
	@FindBy(xpath = "//input[@name='SingleLine2']")
	public WebElement lastName;
	
	@FindBy(xpath="//p[@id='error-SingleLine2']")
	public WebElement errorLastName;
	
//	@FindBy(xpath = "//input[@id='Radio_1']")
//	@FindBy(css = "//input[value='M']")
	@FindBy(id="Radio_1")
	public WebElement male;
	
	@FindBy(xpath = "//input[@id='Radio_2']")
	public WebElement female;
	
	
//	@FindBy(xpath = "//p[@id='error-Radio']")
	@FindBy(css="p[id=error-Radio]")
	public WebElement errorGender;
	
	
	@FindBy(xpath = "//input[@id='Date-date']")
	public WebElement dateOfBirth;
	
	@FindBy(xpath = "//p[@id='error-Date']")
	public WebElement errorDateOfBirth;
	
	
	@FindBy(xpath = "//input[@name='Number']")
	public WebElement sSN;
	
	@FindBy(xpath = "//p[@id='error-Number']")
	public WebElement errorSSN_1;
		
	@FindBy(xpath = "//p[@id='hint-Number']")
	public WebElement errorSSN_2;
	
	
	
	//*[@id='Section-li']/h2
	@FindBy(xpath ="//*[@id='Section-li']/h2")
	public WebElement pInfo;
	
	
	
	
	
	@FindBy(xpath ="//button[@type='button']")
	public WebElement next;

	
	
	
}
	
	// xpath for 2 contact information --> "//tbody/tr/td[4]"


