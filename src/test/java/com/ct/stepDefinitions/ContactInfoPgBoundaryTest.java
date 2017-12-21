package com.ct.stepDefinitions;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.ct.pages.ContactInfoPage;
import com.ct.utilities.Driver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ContactInfoPgBoundaryTest {

	WebDriver driver;
	ContactInfoPage infoPage;
	Select dropdown;
	
	@Given("^currently on CTLoan contacts page$")
	public void currently_on_CTLoan_contacts_page() throws Throwable {
//		driver = Driver.getInstance();
//		String parent2=driver.getWindowHandle();
//		driver.switchTo().defaultContent();
//		driver.switchTo().window(parent2);
//		driver.switchTo().frame(1);
		
	}

	@Given("^user enters the contact information:$")
	public void user_enters_the_contact_information(Map<String, String> tableData) throws Throwable {
		//driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		infoPage = new ContactInfoPage();
	//	Thread.sleep(2000);
		dropdown = new Select(infoPage.Country);
		//Thread.sleep(2000);
		infoPage.Address1.sendKeys(tableData.get("Address1"));
		//Thread.sleep(2000);
		infoPage.Address2.sendKeys(tableData.get("Address2"));
		//Thread.sleep(2000);
		infoPage.City.sendKeys(tableData.get("City"));
		//Thread.sleep(2000);
		infoPage.Region.sendKeys(tableData.get("Region"));
		//Thread.sleep(2000);
		infoPage.ZipCode.sendKeys(tableData.get("ZipCode"));
		infoPage.Cell1.sendKeys(tableData.get("Cell1"));
		infoPage.Cell2.sendKeys(tableData.get("Cell2"));
		infoPage.Cell3.sendKeys(tableData.get("Cell3"));
		infoPage.WorkNum1.sendKeys(tableData.get("WorkNum1"));
		infoPage.WorkNum2.sendKeys(tableData.get("WorkNum2"));		
		infoPage.WorkNum3.sendKeys(tableData.get("WorkNum3"));
		infoPage.Extension.sendKeys(tableData.get("Extension"));
		infoPage.Email.sendKeys(tableData.get("Email"));
		infoPage.WorkEmail.sendKeys(tableData.get("WorkEmail"));
		dropdown.selectByVisibleText(tableData.get("Country"));
		
	}

	@When("^the user clicks on the next button$")
	public void the_user_clicks_on_the_next_button() throws Throwable {
		//driver.findElement(By.xpath("(//*[contains(@class,'nextAlign')])[2]")).click();
		Driver.getInstance().findElement(By.xpath("(//*[contains(@class,'nextAlign')])[2]")).click();

	}

	@Then("^page should navigate to Employment Info page$")
	public void page_should_navigate_to_Employment_Info_page() throws Throwable {
		//Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(),'Employment Information')]")).isDisplayed());
		Assert.assertTrue(Driver.getInstance().findElement(By.xpath("//*[contains(text(),'Employment Information')]")).isDisplayed());

	//	driver.findElement(By.xpath("((//*[contains(@class,'prevAlign')])[2]")).click();
		
		
	}

	@Then("^error message should be thrown$")
	public void error_message_should_be_thrown() throws Throwable {
	    if(1<2){
	    	
	    }else if(2<3){}else if(2<3){}else if(2<3){}else if(2<3){}
 
	}

	@Then("^contacts page should be open$")
	public void contacts_page_should_be_open() throws Throwable {
	   
		//window handle
	}


	
}