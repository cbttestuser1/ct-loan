package com.ct.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.ct.pages.CT_HomePage;
import com.ct.utilities.CTContstants;
import com.ct.utilities.Driver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


public class CTL78_PersonalInfo {
	CT_HomePage cthome=new CT_HomePage();
	//you can use this codes for the first part..
	@Given("^User navigates to the following url: http://cybertekschool\\.com/ctl\\.qa$")
	public void user_navigates_to_the_following_url_http_cybertekschool_com_ctl_qa() throws Throwable {
		Driver.getInstance().get(CTContstants.QA_URL);
		Driver.getInstance().manage().window().maximize();
		JavascriptExecutor jse=	(JavascriptExecutor) Driver.getInstance();
		jse.executeScript("window.scrollBy(0,300)"," ");
		WebElement iframeReal=Driver.getInstance().findElement(By.cssSelector("iframe[src='https://forms.zohopublic.com/murodil/form/CTLoanDev/formperma/A15bE69hh9AF89HBgK050159C']"));
		Driver.getInstance().switchTo().frame(iframeReal);
		System.out.println("git");
	}

	@And("^Enters First Name null and Last Name Smith$")
	public void enters_First_Name_null_and_Last_Name_Smith() throws Throwable {
		//WebDriverWait wait=new WebDriverWait(Driver.getInstance(),2000);
		//wait.until(ExpectedConditions.elementToBeClickable(Driver.getInstance().findElement(By.cssSelector("input[name='SingleLine2']"))));
		
		
		cthome.lastName.sendKeys("smith");
	
	 
	}

	@And("^User selects the gender as Female$")
	public void user_selects_the_gender_as_Female() throws Throwable {
	cthome.GenderFemale.click();
	}

	@And("^User enters Date of Birth$")
	public void user_enters_Date_of_Birth() throws Throwable {
	  cthome.DateOfBirth.sendKeys("12/02/1990");
	    
	}

	@And("^User enters SSN as (\\d+)$")
	public void user_enters_SSN_as(int arg1) throws Throwable {
	   cthome.PersonalFileID.sendKeys("123456789");
	  
	}

	@And("^Click to next button$")
	public void click_to_next_button() throws Throwable {
		cthome.NextButton.click();
		
	}

	@Then("^Verify that \"([^\"]*)\" shoul be displayed$")
	public void verify_that_shoul_be_displayed(String arg1) throws Throwable {
		WebElement text=Driver.getInstance().findElement(By.cssSelector("p#error-SingleLine.errorMessage"));
		System.out.println(text.getText());
		String ErrorMessage=text.getText();
		
		Assert.assertTrue(ErrorMessage.equals("Enter a value for this field."));
	}


}



