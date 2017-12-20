package com.ct.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ct.utilities.Driver;

public class CT_HomePage {
	
	public CT_HomePage() {
        PageFactory.initElements(Driver.getInstance(), this);
    }
    
	@FindBy(xpath="//*[@id='SingleLine-li']/div[1]/span/input")
    public WebElement FirstName;

    @FindBy(name = "//*[@id='SingleLine1-li']/div[1]/span/input")
    public WebElement MiddleName;


    @FindBy(xpath="//*[@id='SingleLine2-li']/div[1]/span/input")
    public WebElement LasttName;


    @FindBy(css="input#Radio_1.radioBtnType")
    public WebElement GenderMale;

    @FindBy(css="input#Radio_2.radioBtnType")
    public WebElement GenderFemale;

    @FindBy(xpath = "//*[@id='Date-date']")
    public WebElement DateOfBirth;

    @FindBy(xpath = "//*[@id='Number-li']/div[1]/span/input")
    public WebElement PersonalFileID;

    //dilek added this part
    @FindBy(xpath="//*[@id='formAccess']/div[1]/div/div/button/em")
    public WebElement NextButton;
    

}
