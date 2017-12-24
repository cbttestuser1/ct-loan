package com.ct.stepDefinitions;

import org.junit.Assert;

import cucumber.api.java.en.Then;

public class CT_CloanStepDefs_CTL_113 {

	@Then("^I should get an email with an attachment$")
	public void i_should_get_an_email_with_an_attachment() throws Throwable {
		System.out.println("Establishing Connection with GMAIL: ...................");
		String attachment = EmailChecker.downloadAttachment();
		System.out.println("Connection with GMAIL established:");
		System.out.println("Email contains attachment and file name is "  + attachment);
		Assert.assertEquals("CTLoanDev.pdf", attachment);
	}
}
