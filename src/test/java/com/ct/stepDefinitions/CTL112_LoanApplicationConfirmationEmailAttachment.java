package com.ct.stepDefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ct.pages.GmailHomeAndInboxPages;
import com.ct.utilities.Driver;

import cucumber.api.java.en.Then;

public class CTL112_LoanApplicationConfirmationEmailAttachment {

	GmailHomeAndInboxPages gmail = new GmailHomeAndInboxPages();

	@Then("^I go to gmail\\.com$")
	public void i_go_to_gmail_com() throws Throwable {
		Driver.getInstance().get("https://accounts.google.com/signin");
	}

	@Then("^I add usearname \"([^\"]*)\" and click next button$")
	public void i_add_usearname_and_click_next_button(String userName) throws Throwable {
		// Thread.sleep(2000);
		// gmail.emailField.click();
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(Driver.getInstance(), 10);
		wait.until(ExpectedConditions.elementToBeClickable(gmail.emailField));
		gmail.emailField.sendKeys(userName);
		gmail.nextButton.click();
		Thread.sleep(2000);
	}

	@Then("^I add password \"([^\"]*)\" and click next button$")
	public void i_add_password_and_click_next_button(String password) throws Throwable {

		
		gmail.passwordField.sendKeys(password);
		gmail.nextButton.click();
	}
	// @Then("^I add usearname and click next button$")
	// public void i_add_usearname_and_click_next_button() throws Throwable {
	// gmail.emailField.click();
	// Thread.sleep(2000);
	// gmail.emailField.sendKeys("markjonesctl");
	// Thread.sleep(2000);
	// gmail.nextButton.click();
	// }
	//
	// @Then("^I add password and click next button$")
	// public void i_add_password_and_click_next_button() throws Throwable {
	// Thread.sleep(4000);
	// gmail.passwordField.click();
	// gmail.passwordField.sendKeys("cybertek");
	// gmail.nextButton.click();
	// }

	@Then("^I open email from CT Loan from inbox folder$")
	public void i_open_email_from_CT_Loan_from_inbox_folder() throws Throwable {
		WebElement emailTable = Driver.getInstance().findElement(By.xpath("//*[@id=':34']"));
		List<WebElement> emailList = (List<WebElement>) emailTable.findElement(By.tagName("tr"));
		for (WebElement emails : emailList) {
			List<WebElement> email = emails.findElements(By.tagName("td"));
			{
				if (email.contains("training@cybertekschool.com")) {
					System.out.println("email is here");
				}
			}
		}

	}

	@Then("^I check if an email recieved with an attachment named CTLoanDev\\.pdf$")
	public void i_check_if_an_email_recieved_with_an_attachment_named_CTLoanDev_pdf() throws Throwable {

	}

}