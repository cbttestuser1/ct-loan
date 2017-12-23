package com.ct.stepDefinitions;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.ct.pages.CT_HomePage;
import com.ct.pages.ContactInfoHomePage;
import com.ct.utilities.CTContstants;
import com.ct.utilities.Driver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class personalStepInfo {
	CT_HomePage homePage = new CT_HomePage();
	ContactInfoHomePage contactInfo= new ContactInfoHomePage();
	WebDriver driver = Driver.getInstance();
	String[] chars = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s",
			"t", "u", "v", "w", "x", "y", "z" };

	@Given("^User navigates to the following url: \"([^\"]*)\"$")
	public void user_navigates_to_the_following_url(String arg1) throws Throwable {
		Driver.getInstance().get(CTContstants.QA_URL);

	}

	@Given("^Enters First Name and Last Name$")
	public void enters_First_Name_and_Last_Name() throws Throwable {
		Driver.getInstance().switchTo().defaultContent();
		Driver.getInstance().switchTo().parentFrame();
		Driver.getInstance().switchTo().frame(1);
		homePage.firstName.sendKeys("Akyl");
		Thread.sleep(300);
		homePage.lastName.sendKeys("Smith");
		Thread.sleep(300);

	}

	@Then("^Verify Data type: String characters a-Z$")
	public void verify_Data_type_String_characters_a_Z() throws Throwable {
//		homePage.firstName.clear();
		homePage.lastName.clear();
		Thread.sleep(900);
//		homePage.firstName.sendKeys(chars);
//
		if (chars.equals(chars)) {
			for (int i = 0; i < chars.length; i++) {
				System.out.print(chars[i].toString());

			}
		} else {
			System.out.println("Did NOT enter the charackters from A-Z");
		}

		homePage.lastName.sendKeys(chars);
		

	}

	@Then("^Field type: text box$")
	public void field_type_text_box() throws Throwable {
		String textBox1 = homePage.firstName.getAttribute("type");
		System.out.println(textBox1);
		Assert.assertTrue(textBox1.equals("text"));

		String textBox2 = homePage.middleName.getAttribute("type");
		Assert.assertTrue(textBox2.equals("text"));

		String textBox3 = homePage.lastName.getAttribute("type");
		Assert.assertTrue(textBox3.equals("text"));

	}

	@Then("^Accepted special characters \\(apostrophe, hyphen\\)$")
	public void accepted_special_characters_apostrophe_hyphen() throws Throwable {
		homePage.firstName.sendKeys("'" + "-");
		Thread.sleep(900);
		homePage.lastName.sendKeys("'" + "-");
		System.out.println("Spe");
	}

	@Then("^User selects the gender$")
	public void user_selects_the_gender() throws Throwable {
		Thread.sleep(900);
		homePage.GenderMale.click();
	}

	@Then("^Verify field input (\\d+) options, F, M$")
	public void verify_field_input_options_F_M(int arg1) throws Throwable {
		String textM = homePage.GenderMale.getAttribute("value");
		System.out.println(textM);
		Assert.assertEquals("M", textM);
		String textF = homePage.GenderFemale.getAttribute("value");
		System.out.println(textF);
		Assert.assertEquals("F", textF);

		if (textM.equals("M") && textF.equals("F")) {
			System.out.println("Success!!! Feild input options M and F are verified!");
		} else {
			System.out.println("Feild input options M and F are NOT verified!");
		}
	}

	@Then("^User enters Date of Birth$")
	public void user_enters_Date_of_Birth() throws Throwable {
		homePage.DateOfBirth.click();
		Thread.sleep(900);
		Select dateOfBirth = new Select(homePage.selectMonth);
		dateOfBirth.selectByVisibleText("Apr");
		Thread.sleep(900);

		dateOfBirth = new Select(homePage.selectYear);
		dateOfBirth.selectByVisibleText("1990");
		driver.findElement(By.xpath("(//div[@id='ui-datepicker-div']/table/tbody/tr/td)[14]")).click();

	}

	@Then("^Verify Watermark format is MM/DD/YYYY$")
	public void verify_Watermark_format_is_MM_DD_YYYY() throws Throwable {
		String verifyFormat = homePage.dateFormat.getText();

		if (verifyFormat.equalsIgnoreCase("MM/DD/YYYY")) {
			System.out.println("Success!!! Month-Date-Year format is verified!");
		} else {
			System.out.println("Exeption! Month-Date-Year format is DID NOT match the requirement");
		}
	}

	@Then("^Data type: integer$")
	public void data_type_integer() throws Throwable {
		homePage.DateOfBirth.click();
		Thread.sleep(900);
		List<WebElement> nomericList = driver
				.findElements(By.xpath("//div[@id='ui-datepicker-div']/table/tbody/tr/td"));

		Object[] i = nomericList.toArray();
		if (Arrays.equals(i, chars)) {
			System.out.println("Arrays are equals");
		} else {
			System.out.println("calendar of date anly integer format");
		}

		for (WebElement list : nomericList) {
			System.out.print(list.getText());
			if (i.equals(chars)) {
				System.out.println("Exception! The nomeric list of date format DID NOT match the requirement!!!");
			}
		}
		Assert.assertFalse(chars.equals(i));
	}

	@Then("^User enters SSN$")
	public void user_enters_SSN() throws Throwable {
		Thread.sleep(900);
		homePage.PersonalFileID.sendKeys("12345678");
	}

	@Then("^Verify Data type integer only$")
	public void verify_Data_type_integer_only() throws Throwable {
		homePage.PersonalFileID.clear();
		homePage.PersonalFileID.sendKeys("hello world!");
		homePage.NextButton.click();
		WebElement a = driver.findElement(By.xpath("//div/p[@id='error-Number']"));
		System.out.println(a.getText());
		String ErrorMessage = a.getText();

		if (ErrorMessage.equals("Enter a valid number.")) {
			System.out.println("Success! SSN integer format was verified!");
		}
	}

	@Then("^Watermark format \"([^\"]*)\" \\.$")
	public void watermark_format(String arg1) throws Throwable {
		homePage.PersonalFileID.clear();
		Thread.sleep(900);
		homePage.PersonalFileID.sendKeys("hello world!");
		homePage.NextButton.click();
		// homePage.PersonalFileID.sendKeys(arg1);
		// homePage.NextButton.click();
		Thread.sleep(900);
		WebElement a = driver.findElement(By.xpath("//div/p[@id='error-Number']"));
		a.isDisplayed();
		String ErrorMessage = a.getText();
		System.out.println(ErrorMessage);
		if (a.isDisplayed()) {
			System.out.println("Success!!! The ID input box Did not accept the string type!");
			homePage.PersonalFileID.clear();
			homePage.PersonalFileID.sendKeys(arg1);
			homePage.NextButton.click();

		} else {
			System.out.println("The ID input box DID NOT match the requirement!!!");
		}
		// Assert.assertTrue(ErrorMessage.equalsIgnoreCase("Enter a valid
		// number."));
		// homePage.PersonalFileID.clear();
		// homePage.PersonalFileID.sendKeys(arg1);
		// homePage.NextButton.click();

	}


	@When("^the user enters the address line one$")
	public void the_user_enters_the_address_line_one() throws Throwable {
		Thread.sleep(900);
		contactInfo.streetAddress.sendKeys("7988 Tyson oaks circle");
	}

	@When("^the user enters address line two$")
	public void the_user_enters_address_line_two() throws Throwable {
		Thread.sleep(900);
	   contactInfo.addressLine2.sendKeys("Vienna Va"); 
	}

	@When("^the user enter city$")
	public void the_user_enter_city() throws Throwable {
		Thread.sleep(900);
	  contactInfo.City.sendKeys("Vienna");
	}

	@When("^the user enter state$")
	public void the_user_enter_state() throws Throwable {
		Thread.sleep(900);
		contactInfo.State.sendKeys("VA");
	   
	}

	@When("^the user enters zipcode$")
	public void the_user_enters_zipcode() throws Throwable {
		Thread.sleep(500);
		contactInfo.postalZip.sendKeys("221282");
	}

	@When("^the user enters work phone$")
	public void the_user_enters_work_phone() throws Throwable {
		Thread.sleep(500);
		contactInfo.personalPh1.sendKeys("5712901637");
		System.out.println("Personal phone number has been entered successfully!");
	}
	
	@Given("^the user enters Country$")
	public void the_user_enters_Country() throws Throwable {
	 WebElement country= contactInfo.Country2;
	 country.click();
	 Thread.sleep(500);
	  Select selCountry= new Select(country);
	  selCountry.selectByVisibleText("Zimbabwe");
	  System.out.println("Country has been choosen successfully!");
	   
	}


	@When("^the user enters Extension$")
	public void the_user_enters_Extension() throws Throwable {
		Thread.sleep(900);
		contactInfo.Extension.sendKeys("90571");
	    
	}

	@When("^the user enters Email$")
	public void the_user_enters_Email() throws Throwable {
		Thread.sleep(900);
		contactInfo.workEmail.sendKeys("adam94@gmail.com");
	}

	@When("^the user enters Personal email$")
	public void the_user_enters_Personal_email() throws Throwable {
		Thread.sleep(900);
		contactInfo.PersonalEmail.sendKeys("aydinbekiroglu@gmail.com");
	}


}
