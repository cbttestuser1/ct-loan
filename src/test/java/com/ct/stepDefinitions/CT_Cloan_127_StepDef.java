package com.ct.stepDefinitions;

import static org.testng.Assert.assertTrue;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Hashtable;

import org.openqa.selenium.WebDriver;

import com.ct.pages.CT_CloanHomePage_4;
import com.ct.pages.CT_CloanJDBCProject;
import com.ct.pages.CT_Cloan_FakePerson;
import com.ct.utilities.Driver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.bytebuddy.dynamic.scaffold.FieldRegistry;

public class CT_Cloan_127_StepDef {

	private WebDriver driver = Driver.getInstance();
	// WebDriver driver=Driver.getInstance();
	CT_CloanJDBCProject user = new CT_CloanJDBCProject();
	CT_Cloan_FakePerson x = new CT_Cloan_FakePerson();

	private String url = "jdbc:oracle:thin:@ec2-54-244-62-153.us-west-2.compute.amazonaws.com:1521:xe";
	private String name = "ctlqa";
	private String password = "ctl987";
	Connection connection = null;
	Statement statement = null;
	ResultSet result = null;
	CT_Cloan_FakePerson fake = new CT_Cloan_FakePerson();

	public static String oracleQuery = "Select p.FIRST_NAME, p.LAST_NAME, p.MIDDLE_INIT,to_char(p.DATE_OF_BIRTH,'MM/DD/YYYY'),"
			+ "p.GENDER,p.SSN_NR " + "from CTLDEV.PERSON p " + "JOIN CTLDEV.CORRELATIONS c ON p.SSN_NR = c.SSN_NR "
			+ "where c.APPLICATION_ID=";

	public static String id;

	@Given("^enter valid personal,contact,employment and financial information$")
	public void enter_valid_personal_contact_employment_and_financial_information() throws Throwable {
		CT_Cloan_FakePerson person = new CT_Cloan_FakePerson();
		person.fillOutAllPersonInfoOn_CT_Cloan();
	}

	@When("^I submit the application form$")
	public void i_submit_the_application_form() throws Throwable {
		CT_CloanHomePage_4 p4 = new CT_CloanHomePage_4();
		p4.submitButton.click();
		Thread.sleep(5000);
	}

	@Given("^User should have personal information in DataBase as required$")
	public void user_should_have_personal_information_in_DataBase_as_required() throws Throwable {

	}

	@Then("^verify information from DataBase$")
	public void verify_information_from_DataBase() throws Throwable {

		String appId = CT_Cloan_FakePerson.actualData.get("APPLICATION_ID");

		System.out.println(oracleQuery + appId);
		connection = DriverManager.getConnection(url, name, password);
		statement = connection.createStatement();
		result = statement.executeQuery(oracleQuery + appId);
		while(result.next()){
		Hashtable<String, String> firstPageExpected = new Hashtable<>();
		firstPageExpected.put("FIRST_NAME", result.getString("FIRST_NAME"));
		firstPageExpected.put("LAST_NAME", result.getString("LAST_NAME"));
		firstPageExpected.put("MIDDLE_INIT", result.getString("MIDDLE_INIT"));
		firstPageExpected.put("DATE_OF_BIRTH", result.getString("TO_CHAR(P.DATE_OF_BIRTH,'MM/DD/YYYY')"));
		firstPageExpected.put("GENDER", result.getString("GENDER"));
		firstPageExpected.put("APPLICATION_ID", appId);
		firstPageExpected.put("SSN_NR", result.getString("SSN_NR"));
		System.out.println(firstPageExpected);
		System.out.println(CT_Cloan_FakePerson.actualData);
		System.out.println((firstPageExpected.equals(CT_Cloan_FakePerson.actualData)));
		}
		
		
	}

}
