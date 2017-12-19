package com.ct.stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.ct.pages.CT_HomePage_1;
import com.ct.utilities.CTContstants;
import com.ct.utilities.Driver;

import cucumber.api.java.en.Given;

public class CT_CLoan_PersonalInfo_LengthStepDef {
			CT_HomePage_1 homePage1=new CT_HomePage_1();
			WebDriver driver=Driver.getInstance();
			JavascriptExecutor js=(JavascriptExecutor) driver;
;		
	@Given("^the customer is on the personal information form$")
	public void the_customer_is_on_the_personal_information_form() throws Throwable {
	    
		 driver.get(CTContstants.QA_URL); // https://forms.zohopublic.com/murodil/form/CTLoanDev/formperma/A15bE69hh9AF89HBgK050159C

         int size = driver.findElements(By.tagName("iframe")).size();
         System.out.println(size);

         driver.switchTo().frame(1);

         js.executeScript("window.scrollBy(0, 700);");

	}

	@Given("^the customer enters \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void the_customer_enters(String firstName, String middleName , String lastName, String dateOfBirth , String idNum) throws Throwable {
	    homePage1.fillOutTheForm(firstName, middleName, lastName, dateOfBirth, idNum);
	}

	
}
