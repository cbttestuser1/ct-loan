package com.ct.stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import com.ct.pages.CTeckLoan_37Home;
import com.ct.utilities.Driver;

import cucumber.api.java.en.Then;

public class CteckLoan40EmploymentInfoSteps {
	
	
	CTeckLoan_37Home user=new CTeckLoan_37Home();
		

@Then("^user should select Title dropdown box and check all fiels are in alphabetical order$")
public void user_should_select_Title_dropdown_box_and_check_all_fiels_are_in_alphabetical_order() throws Throwable {
    user.comparison((By) user.titleDropDown);
    JavascriptExecutor js = (JavascriptExecutor) Driver.getInstance();
	js.executeScript("window.scrollBy(0,300)");
   
}

@Then("^user should select Department dropdown box and check all fiels are in alphabetical order$")
public void user_should_select_Department_dropdown_box_and_check_all_fiels_are_in_alphabetical_order() throws Throwable {
   user.comparison((By) user.departmentDropDown);
}

@Then("^user should select Duration of Employment dropdown box and check all fiels are in ascending order$")
public void user_should_select_Duration_of_Employment_dropdown_box_and_check_all_fiels_are_in_ascending_order() throws Throwable {
    user.comparison((By) user.durationOfEmploymentDropDown);
}

@Then("^user should select Purpose of Loan dropdown box and check all fiels are in alphabetical order$")
public void user_should_select_Purpose_of_Loan_dropdown_box_and_check_all_fiels_are_in_alphabetical_order() throws Throwable {
   user.comparison((By) user.PurposeOfLoanDropDown);
}

@Then("^user should select Supervisor  dropdown box and check all fiels are in alphabetical order$")
public void user_should_select_Supervisor_dropdown_box_and_check_all_fiels_are_in_alphabetical_order() throws Throwable {
   user.comparison((By) user.SupervisorDropDown);
   
}

}
