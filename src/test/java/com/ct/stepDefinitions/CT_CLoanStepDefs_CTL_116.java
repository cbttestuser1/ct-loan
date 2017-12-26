package com.ct.stepDefinitions;

import static io.restassured.RestAssured.given;

import java.net.URL;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.ct.pages.CT_CloanHomePage_4;
import com.ct.pages.CT_Cloan_FakePerson;
import com.ct.utilities.Driver;
import com.ct.utilities.PageUtils;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;

public class CT_CLoanStepDefs_CTL_116 {
	private WebDriver driver = Driver.getInstance();
	private CT_Cloan_FakePerson person = new CT_Cloan_FakePerson();

	@Given("^enter valid personal, contact, employment and financial information$")
	public void enter_valid_personal_contact_employment_and_financial_information() throws Throwable {

		person.fillOutAllPersonInfoOn_CT_Cloan();
		// comment
	}

	@When("^I submit the form$")
	public void i_submit_the_form() throws Throwable {
		CT_CloanHomePage_4 p4 = new CT_CloanHomePage_4();
		// p4.submitButton.click();
		Thread.sleep(5000);
	}

	@Then("^I should get an email confirming my application$")
	public void i_should_get_an_email_confirming_my_application() throws Throwable {

		String loanNumber = PageUtils
				.getId(driver.findElement(By.xpath("//*[@id='richTxtMsgSpan']//div[4]")).getText());
		System.out.println("We got Loan Application Number, it is " + loanNumber);
		String emailContent = EmailChecker.massageText();
		Assert.assertTrue(emailContent.contains(loanNumber));
		System.out.println("Loan Numver " + loanNumber + " and it is contains in email!");
	}

	@Then("^I should get person information by ssn via rest get endpoint$")
	public void i_should_get_person_information_by_ssn_via_rest_get_endpoint() throws Throwable {
		System.out.println("Entered Data true GUI is:");
		System.out.println(person.getFirstName() + " " + person.getLastName() + " M " + person.getDateOfBirth() + " "
				+ person.getPersonalFileID() + " " + person.getPpnumber() + " " + person.getWpnumber());

		System.out.println("\n Got personal information true WebService is: ");
		URL url = new URL(
				"http://ec2-54-244-62-153.us-west-2.compute.amazonaws.com:443/person/" + person.getPersonalFileID());

		String text = given().accept(ContentType.JSON).when().get(url).getBody().asString();
		System.out.println("\n WebService Responce is: ");
		System.out.println(text);
		JsonPath path = new JsonPath(text);

		System.out.println("\n Comparing Data from entering true GUI with Data from WebService: ");

		System.out.println("First Name is the same? " + path.getString("firstName").equals(person.getFirstName()));
		Assert.assertTrue(path.getString("firstName").equals(person.getFirstName()));

		System.out.println("Last Name is the same? " + path.getString("lastName").equals(person.getLastName()));
		Assert.assertTrue(path.getString("lastName").equals(person.getLastName()));

		System.out.println("Middle Name is the same? " + path.getString("middleInit").equals("M"));
		Assert.assertTrue(path.getString("middleInit").equals("M"));

		System.out.println("GENDER is the same? " + path.getString("gender").equals("M"));
		Assert.assertTrue(path.getString("gender").equals("M"));

		System.out.println("DOB is the same? " + path.getString("dob").equals(person.getDateOfBirth()));
		// Assert.assertTrue(path.getString("dob").equals("M"));

		System.out.println("SSN is the same? " + path.getString("ssn").equals(person.getPersonalFileID()));
		Assert.assertTrue(path.getString("ssn").equals(person.getPersonalFileID()));

		System.out.println("Cell is the same? " + path.getString("cellPhone").equals(person.getPpnumber()));
		// Assert.assertTrue(path.getString("ssn").equals(person.getPpnumber()));

		System.out.println("Work Number is the same? " + path.getString("workPhone").equals(person.getWpnumber()));
		// Assert.assertTrue(path.getString("workPhone").equals(person.getWpnumber()));
	}

}
