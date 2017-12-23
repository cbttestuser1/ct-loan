package com.ct.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static com.ct.stepDefinitions.CTL_FinancialInfo.*;
import com.ct.pages.CTL_BasePage;
import com.ct.pages.GmailHomeAndInboxPages;
import com.ct.utilities.Driver;

import cucumber.api.java.en.Then;

public class CTL117_confirmationEmailWith_ID {

	CTL_BasePage base = new CTL_BasePage();
	GmailHomeAndInboxPages gmailPage = new GmailHomeAndInboxPages();
	WebDriverWait wait = new WebDriverWait(Driver.getInstance(), 10);

	@Then("^Loan application ID in the email should be the same as system showed after submitting the form$")
	public void loan_application_ID_in_the_email_should_be_the_same_as_system_showed_after_submitting_the_form() throws Throwable {
		wait.until(ExpectedConditions.visibilityOf(gmailPage.uniqueID));
		Assert.assertEquals(myApplicationId, gmailPage.uniqueID.getText());

	}

}
