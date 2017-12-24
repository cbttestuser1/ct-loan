package com.ct.stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ct.pages.CTL_Contact_Information_Page;
import com.ct.pages.CTL_Employment_Infor_Mandatory_Fields;
import com.ct.pages.CTL_Personal_Information_Page;
import com.ct.utilities.Driver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CTL36_StepDefinitions {
	
	CTL_Employment_Infor_Mandatory_Fields empManFields = new CTL_Employment_Infor_Mandatory_Fields();
	CTL_Contact_Information_Page contactPage = new CTL_Contact_Information_Page();
	private static WebDriver driver = Driver.getInstance();
	//WebDriverWait wait = new WebDriverWait(driver, 60);
	
	@Given("^User submits from with all drop down options selected$")
	public void user_submits_from_with_all_drop_down_options_selected() throws Throwable {
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
		dropDownTitle.selectByValue("QA");
		 
		Select dropDownDepartment = new Select(driver.findElement(By.name("Dropdown1")));
		dropDownDepartment.selectByValue("Development");
		
		Select dropDownDurEmpl = new Select(driver.findElement(By.name("Dropdown2")));
		dropDownDurEmpl.selectByValue("0-2");
		
		Select dropDownPurLoan = new Select(driver.findElement(By.name("Dropdown3")));
		dropDownPurLoan.selectByValue("Auto");
		
		Select dropDownSupervisor = new Select(driver.findElement(By.name("Dropdown4")));
		dropDownSupervisor.selectByValue("Katherine Hillard");

	}

	@Then("^User should be able to navigate to the next page$")
	public void user_should_be_able_to_navigate_to_the_next_page() throws Throwable {
		//CTL_Employment_Infor_Mandatory_Fields empManFields = new CTL_Employment_Infor_Mandatory_Fields();
				empManFields.nextBtn.click();

	}

//	@Given("^User submits form with all mandatory fields empty$")
//	public void user_submits_form_with_all_mandatory_fields_empty() throws Throwable {
//		//CTL_Employment_Infor_Mandatory_Fields empManFields = new CTL_Employment_Infor_Mandatory_Fields();
//		Thread.sleep(2000);		
//		empManFields.nextBtn.click();

//	@When("^User should end up on the same page$")
//	public void user_should_end_up_on_the_same_page() throws Throwable {
//	     Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}

//	@When("^page throws error message for the empty fields$")
//	public void page_throws_error_message_for_the_empty_fields() throws Throwable {
//		WebElement errorTitle=driver.findElement(By.id("error-Dropdown"));
//		Assert.assertTrue(errorTitle.isDisplayed());
//		
//		WebElement errorDepartment=driver.findElement(By.id("error-Dropdown1"));
//		Assert.assertTrue(errorDepartment.isDisplayed());
//		
//		WebElement errorDurationOfEmp=driver.findElement(By.id("error-Dropdown2"));
//		Assert.assertTrue(errorDurationOfEmp.isDisplayed());
//
//		WebElement errorPurposeOfLoan=driver.findElement(By.id("error-Dropdown3"));
//		Assert.assertTrue(errorPurposeOfLoan.isDisplayed());
//
//		WebElement errorSupervisorn=driver.findElement(By.id("error-Dropdown4"));
//		Assert.assertTrue(errorSupervisorn.isDisplayed());
//	}

//	@Given("^User leaves first drop down field empty$")
//	public void user_leaves_first_drop_down_field_empty() throws Throwable {
//
//		Select dropDownTitle=new Select(driver.findElement(By.name("DropDown")));
//		Assert.assertFalse(dropDownTitle.isMultiple());
//
//	}
//
//	@When("^User submit form with valid data in all other fields$")
//	public void user_submit_form_with_valid_data_in_all_other_fields() throws Throwable {
//		Select dropDownDepartment = new Select(driver.findElement(By.name("DropDown1")));
//		dropDownDepartment.selectByValue("HR");
//		
//		Select dropDownDurEmpl = new Select(driver.findElement(By.name("DropDown2")));
//		dropDownDurEmpl.selectByValue("5-10");
//		
//		Select dropDownPurLoan = new Select(driver.findElement(By.name("DropDown3")));
//		dropDownPurLoan.selectByValue("Personal");
//		
//		Select dropDownSupervisor = new Select(driver.findElement(By.name("DropDown4")));
//		dropDownSupervisor.selectByValue("William Cranston");
//	  
//		//CTL_Employment_Infor_Mandatory_Fields empManFields = new CTL_Employment_Infor_Mandatory_Fields();
//		empManFields.nextBtn.click();
//
//	}
//
//	@Then("^page thows error message for the empty field$")
//	public void page_thows_error_message_for_the_empty_field() throws Throwable {
//		WebElement errorTitle=driver.findElement(By.id("error-Dropdown"));
//		Assert.assertTrue(errorTitle.isDisplayed());
//
//	}
//
//	@Then("^User ends up on the same page$")
//	public void user_ends_up_on_the_same_page() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@Given("^User leaves second drop down field empty$")
//	public void user_leaves_second_drop_down_field_empty() throws Throwable {
//		Select dropDownDepartment=new Select(driver.findElement(By.name("DropDown1")));
//		Assert.assertFalse(dropDownDepartment.isMultiple());
//		
//		Select dropDownTitle = new Select(driver.findElement(By.name("DropDown")));
//		dropDownTitle.selectByValue("Manager");
//		
//		Select dropDownDurEmpl = new Select(driver.findElement(By.name("DropDown2")));
//		dropDownDurEmpl.selectByValue("5-10");
//		
//		Select dropDownPurLoan = new Select(driver.findElement(By.name("DropDown3")));
//		dropDownPurLoan.selectByValue("Personal");
//		
//		Select dropDownSupervisor = new Select(driver.findElement(By.name("DropDown4")));
//		dropDownSupervisor.selectByValue("William Cranston");
//		
//		//CTL_Employment_Infor_Mandatory_Fields empManFields = new CTL_Employment_Infor_Mandatory_Fields();
//		empManFields.nextBtn.click();
//
//	}
//
//	@Given("^User leaves third drop down field empty$")
//	public void user_leaves_third_drop_down_field_empty() throws Throwable {
//		Select dropDownDurEmpl=new Select(driver.findElement(By.name("DropDown2")));
//		Assert.assertFalse(dropDownDurEmpl.isMultiple());
//		
//		Select dropDownTitle=new Select(driver.findElement(By.name("DropDown")));
//		dropDownTitle.selectByValue("QA");
//		 
//		Select dropDownDepartment = new Select(driver.findElement(By.name("DropDown1")));
//		dropDownDepartment.selectByValue("Development");
//		
//		Select dropDownPurLoan = new Select(driver.findElement(By.name("DropDown3")));
//		dropDownPurLoan.selectByValue("auto");
//		
//		Select dropDownSupervisor = new Select(driver.findElement(By.name("DropDown4")));
//		dropDownSupervisor.selectByValue("Katherine Hillard");
//		
//		//CTL_Employment_Infor_Mandatory_Fields empManFields = new CTL_Employment_Infor_Mandatory_Fields();
//		empManFields.nextBtn.click();
//
//	}
//
//	@Given("^User leaves fourth drop down field empty$")
//	public void user_leaves_fourth_drop_down_field_empty() throws Throwable {
//		Select dropDownPurLoan=new Select(driver.findElement(By.name("DropDown3")));
//		Assert.assertFalse(dropDownPurLoan.isMultiple());
//		
//		Select dropDownTitle=new Select(driver.findElement(By.name("DropDown")));
//		dropDownTitle.selectByValue("QA");
//		 
//		Select dropDownDepartment = new Select(driver.findElement(By.name("DropDown1")));
//		dropDownDepartment.selectByValue("Development");
//		
//		Select dropDownDurEmpl = new Select(driver.findElement(By.name("DropDown2")));
//		dropDownDurEmpl.selectByValue("0-2");
//		
//		Select dropDownSupervisor = new Select(driver.findElement(By.name("DropDown4")));
//		dropDownSupervisor.selectByValue("Katherine Hillard");
//		
//		//CTL_Employment_Infor_Mandatory_Fields empManFields = new CTL_Employment_Infor_Mandatory_Fields();
//		empManFields.nextBtn.click();
//
//	}
//
//	@Given("^User leaves fifth drop down field empty$")
//	public void user_leaves_fifth_drop_down_field_empty() throws Throwable {
//		Select dropDownSupervisor=new Select(driver.findElement(By.name("DropDown4")));
//		Assert.assertFalse(dropDownSupervisor.isMultiple());
//		
//		Select dropDownTitle=new Select(driver.findElement(By.name("DropDown")));
//		dropDownTitle.selectByValue("QA");
//		 
//		Select dropDownDepartment = new Select(driver.findElement(By.name("DropDown1")));
//		dropDownDepartment.selectByValue("Development");
//		
//		Select dropDownDurEmpl = new Select(driver.findElement(By.name("DropDown2")));
//		dropDownDurEmpl.selectByValue("0-2");
//		
//		Select dropDownPurLoan = new Select(driver.findElement(By.name("DropDown3")));
//		dropDownPurLoan.selectByValue("auto");
//		
//		//CTL_Employment_Infor_Mandatory_Fields empManFields = new CTL_Employment_Infor_Mandatory_Fields();
//		empManFields.nextBtn.click();

	}


