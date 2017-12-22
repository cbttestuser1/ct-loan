package com.ct.stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.ct.pages.ContactInfoHomePage;
import com.ct.utilities.Driver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class contactInfoVerify {
	ContactInfoHomePage contactInfo = new ContactInfoHomePage();
	WebDriver driver = Driver.getInstance();
	final String workPHONE="2401234567";

	@Given("^User is on Contact Information Page$")
	public void user_is_on_Contact_Information_Page() throws Throwable {
		WebElement logo = contactInfo.contactLogo;
		if (logo.isDisplayed()) {
			System.out.println("The page logo is: " + logo.getText());
		} else {
			System.out.println("There is no logo on Contact Information page");
		}
	}

	@Given("^User enters Work Phone number$")
	public void user_enters_Work_Phone_number() throws Throwable {
		Thread.sleep(300);
		contactInfo.personalPh2.sendKeys(workPHONE);
		System.out.println("Work phone number has been entered successfully!");
	}

	@Then("^Verify the Size:(\\d+) digits$")
	public void verify_the_Size_digits(int arg1) throws Throwable {
		Thread.sleep(300);
		if(workPHONE.length()== 10){
		for(int i=1; i<=workPHONE.length(); i++){
			System.out.println(i);
		}
		System.out.println("The size of the work phone number was verified successfully!");
		}else{
			System.out.println("DID NOT VERIFY THE SIZE OF 10 DIGITS!!!");
		}
	}

	@Then("^User enters Extension$")
	public void user_enters_Extension() throws Throwable {
		Thread.sleep(300);
		contactInfo.Extension.sendKeys("678910788986");
		System.out.println("Extension number has been entered!");
		
	}

	@Then("^User enters Email \\(work\\)$")
	public void user_enters_Email_work() throws Throwable {
		Thread.sleep(300);
		contactInfo.workEmail.sendKeys("ademik3@gmail.com");
	}

	@Then("^Verify Size:(\\d+)-(\\d+) digits$")
	public void verify_Size_digits(int arg1, int arg2) throws Throwable {
		Thread.sleep(300);
		contactInfo.nextButton.click();
		if(contactInfo.emailErrorMWork.isDisplayed()){
			Thread.sleep(300);
			System.out.println(contactInfo.emailErrorMWork.getText());
			contactInfo.workEmail.clear();
			Thread.sleep(300);
			contactInfo.workEmail.sendKeys("ademik3@gmail.com");
		}else{
			System.out.println("There is no error message on work email!"
					+ " Input box was PROBALY empty and email address was entered!"
					+ " Make sure, it is not a defect!");
		}
		
		
		
	
	}

	@Then("^User enters Personal \\(email\\)$")
	public void user_enters_Personal_email() throws Throwable {
		//contactInfo.nextButton.click();
		Thread.sleep(300);
		if(contactInfo.emailErrorMPersonal.isDisplayed()){
			System.out.println(contactInfo.emailErrorMPersonal.getText());
			contactInfo.PersonalEmail.clear();
			Thread.sleep(300);
			contactInfo.PersonalEmail.sendKeys("ademik3@gmail.com");
		}else{
			System.out.println("There is no error message on work email!"
					+ " Input box was PROBALY empty and email address was entered!"
					+ " Make sure, it is not a defect!");
		}
		
	}
	@Then("^verify one more time  Size:(\\d+)-(\\d+) digits$")
	public void verify_one_more_time_Size_digits(int arg1, int arg2) throws Throwable {
		Thread.sleep(300);
		//contactInfo.nextButton.click();
		final String _moreThen30="alemkadirqanurdemibelensenkelchimaga@gmail.com";
		//contactInfo.workEmail.clear();
		//contactInfo.workEmail.sendKeys(_moreThen30);
//		final String _30="mibelensenkelchimaga@gmail.com";
//		if(contactInfo.emailErrorMWork.isDisplayed()){
//			contactInfo.workEmail.clear();
//			Thread.sleep(3000);
//			contactInfo.workEmail.sendKeys(_moreThen30);
//			contactInfo.nextButton.click();
//			Thread.sleep(3000);
//			System.out.println("DID NOT GET ANY ERROR MESSAGE!");
//			if(contactInfo.emailErrorMWork.isDisplayed()){
//				contactInfo.workEmail.clear();
//				Thread.sleep(3000);
//				contactInfo.workEmail.sendKeys("workEmail");
//				contactInfo.nextButton.click();
//				
//			}
		//}
	}
	
	
	@When("^the user clicks next$")
	public void the_user_clicks_next() throws Throwable {
		//contactInfo.nextButton.click();
		Thread.sleep(300);
//		WebElement pageLogo=driver.findElement(By.xpath("//*[@id='formBodyDiv']//*[@id='Section2-li']/"));
//		if(pageLogo.isDisplayed()){
//		System.out.println("Contact page is DONE and application opened the next Step of THE HOME PAGE!"
//				+ " Which is ==>"+pageLogo.getText());
//				}else{
//					System.out.println("DID NOT GET THE PAGE LOGO");
//					
//		}
	}
	

}
