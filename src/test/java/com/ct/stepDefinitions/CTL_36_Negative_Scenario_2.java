package com.ct.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ct.pages.CTL_Contact_Information_Page;
import com.ct.pages.CTL_Employment_Infor_Mandatory_Fields;
import com.ct.pages.CTL_Personal_Information_Page;
import com.ct.utilities.Driver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class CTL_36_Negative_Scenario_2 {
	CTL_Employment_Infor_Mandatory_Fields empManFields = new CTL_Employment_Infor_Mandatory_Fields();
	CTL_Contact_Information_Page contactPage = new CTL_Contact_Information_Page();
	private static WebDriver driver = Driver.getInstance();
	
	@Given("^User submits form with each mandatory fields empty$")
	public void user_submits_form_with_each_mandatory_fields_empty() throws Throwable {
		driver.get("http://cybertekschool.com/ctl.qa");
		new WebDriverWait(driver, 60);
		driver.switchTo().frame(1);
		
		CTL_Personal_Information_Page perInfoPage=new CTL_Personal_Information_Page();
		perInfoPage.firstName.sendKeys("Nafisa");
		
		perInfoPage.lastName.sendKeys("Safarova");
		
		Thread.sleep(2000);
		
		perInfoPage.gender.click();
		
		perInfoPage.dob.sendKeys("12/12/2017");

		perInfoPage.id.sendKeys("123456789");
		
		perInfoPage.nextIp.click();
		
		contactPage.addressInputField.sendKeys("1234 Clarendon blvd");
		
		contactPage.addressInputField2.sendKeys("Apt 123");
		
		contactPage.city.sendKeys("Arlington");
		
		contactPage.state.sendKeys("VA");
		
		contactPage.zip.sendKeys("22201");
		
		Select country = new Select(driver.findElement(By.id("Address_Country")));
		country.selectByVisibleText("United States");
		
		contactPage.code.sendKeys("123");
		
		contactPage.firstThreeNums.sendKeys("123");
		
		contactPage.secondSetNums.sendKeys("1234");
		
		contactPage.code1.sendKeys("123");
		
		contactPage.firstThreeNums1.sendKeys("123");
		
		contactPage.secondSetNums1.sendKeys("1234");
		
		contactPage.email1.sendKeys("a@gmail.com");
		
		contactPage.email2.sendKeys("b@gmail.com");
		
		contactPage.nextContInfo.click();
		
		Thread.sleep(2000);
		Select dropDownTitle=new Select(driver.findElement(By.name("Dropdown")));
		Assert.assertFalse(dropDownTitle.isMultiple());
	}

	@When("^User should end up on the same page$")
	public void user_should_end_up_on_the_same_page() throws Throwable {
		CTL_Employment_Infor_Mandatory_Fields empManFields = new CTL_Employment_Infor_Mandatory_Fields();
		empManFields.nextBtn.click();
	}

	@When("^page throws error message for the empty fields$")
	public void page_throws_error_message_for_the_empty_fields() throws Throwable {
		WebElement errorTitle=driver.findElement(By.id("error-Dropdown"));
		Assert.assertTrue(errorTitle.isDisplayed());
		
		WebElement errorDepartment=driver.findElement(By.id("error-Dropdown1"));
		Assert.assertTrue(errorDepartment.isDisplayed());
		
		WebElement errorDurationOfEmp=driver.findElement(By.id("error-Dropdown2"));
		Assert.assertTrue(errorDurationOfEmp.isDisplayed());

		WebElement errorPurposeOfLoan=driver.findElement(By.id("error-Dropdown3"));
		Assert.assertTrue(errorPurposeOfLoan.isDisplayed());

		WebElement errorSupervisorn=driver.findElement(By.id("error-Dropdown4"));
		Assert.assertTrue(errorSupervisorn.isDisplayed());
	}


}
