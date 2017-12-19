package com.ct.pages;

import com.ct.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CT_HomePage_Personal_Information {

    public CT_HomePage_Personal_Information() {
        PageFactory.initElements(Driver.getInstance(), this);
    }

    @FindBy(name = "SingleLine")
    public WebElement FirstName;

    @FindBy(name = "SingleLine1")
    public WebElement MiddleName;


    @FindBy(name = "SingleLine2")
    public WebElement LasttName;


    @FindBy(id = "Radio_1")
    public WebElement GenderMale;

    @FindBy(id = "Radio_2")
    public WebElement GenderFemale;

    @FindBy(name = "date")
    public WebElement DateOfBirth;

    @FindBy(name = "Number")
    public WebElement PersonalFileID;


}