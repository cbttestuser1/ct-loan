package com.ct.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.ct.utilities.Driver;

public class FinancialInfoPage {

      public FinancialInfoPage() {
            PageFactory.initElements(Driver.getInstance(), this);
       }
        
        @FindBy(id="Radio1_1")
        public WebElement radioButtonYes;
        
        @FindBy(xpath="//input[@id='Radio1_2']")
        public WebElement radioButtonNo;
        
        @FindBy(xpath="//input[@name='SingleLine3']")
        public WebElement annualIncome;
        
        @FindBy(xpath="//select[@name='Dropdown5']")
        public WebElement incomeType;
        
        @FindBy(xpath=" //input[@id='Radio2_2']")
        public WebElement houseRent;
        
        @FindBy(xpath="//input[@id='Radio2_1']")
        public WebElement houseOwn;
        
        @FindBy(xpath="//input[@name='Number3']")
        public WebElement spentOneMonth;
        
        @FindBy(xpath="//input[@name='Number4']")
        public WebElement dependent;
        
        @FindBy(xpath="//input[@name='Number5']")
        public WebElement savings;
        
        @FindBy(xpath="//select[@name='Dropdown6']")
        public WebElement loanTerm;
        
        @FindBy(xpath="//input[@id='DecisionBox']")
        public WebElement checkBox;
        
        @FindBy(xpath="//input[@name='SingleLine5']")
        public WebElement singleLine;
        
        
        @FindBy(xpath="//input[@id='Date1-date']")
        public WebElement date;
        
        
        @FindBy(xpath="//button[@class='fmSmtButton submitColor fmSmtButtom']")
        public WebElement submit;
        
}