package com.ct.stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.ct.pages.empInfoPage;
import com.ct.utilities.Driver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class positiveEmpTest {
	empInfoPage empPage= new empInfoPage();
	WebDriver driver = Driver.getInstance();

	@Given("^get the page Logo$")
	public void get_the_page_Logo() throws Throwable {
		if(empPage.EmpInformationSign.isDisplayed()){
		System.out.println("We are in "+empPage.EmpInformationSign.getText()
		+". Defined from Employee Class execution!");
		}else{
			System.out.println("DID NOT GET THE LOGO OF THE PAGE!!!");
		}
	}
	
	@Then("^choose the Title$")
	public void choose_the_Title() throws Throwable {
		WebElement title=empPage.Title;
		title.click();
		Select depSelection= new Select(title);
		depSelection.selectByVisibleText("Engineer");
		System.out.println("Department has been choosed!");
	    
	}
	@Then("^choose Department$")
	public void choose_Department() throws Throwable {
		WebElement dep=empPage.Department;
		dep.click();
		Select depSelection= new Select(dep);
		depSelection.selectByVisibleText("Development");
		System.out.println("Department has been choosed!");
	}

	@Then("^choose Time of Empoyment$")
	public void choose_Time_of_Empoyment() throws Throwable {
		WebElement time=empPage.durationOfEmp;
		time.click();
		Select depSelection= new Select(time);
		depSelection.selectByVisibleText("3-5");
		System.out.println("Duration has been choosed!");
	}

	@Then("^choose Loan Type$")
	public void choose_Loan_Type() throws Throwable {
		WebElement loan=empPage.purposeOfLoan;
		loan.click();
		Select depSelection= new Select(loan);
		depSelection.selectByVisibleText("Education");
		System.out.println("Purpose of LOAN has been choosed!");
	}

	@Then("^choose Supervisor Contact Info$")
	public void choose_Supervisor_Contact_Info() throws Throwable {
		WebElement contact =empPage.supervisor;
		contact.click();
		Select depSelection= new Select(contact);
		depSelection.selectByVisibleText("William Cranston");
		System.out.println("Supervisor name has been selected!");
		
		
		empPage.nextButton.click();
	WebElement logo=driver.findElement(By.xpath("//h2[.='Financial Information']"));
		
		if(logo.isDisplayed()){
			System.out.println("The Employment Information Page is DONE! We are at===>"+logo.getText()+" Page!");
		}
	}

}
