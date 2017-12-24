package com.ct.stepDefinitions;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.List;

import org.openqa.selenium.WebDriver;

import com.ct.utilities.DBUtility;
import com.ct.utilities.DBUtility.DBType;
import com.ct.utilities.Driver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CTL_123_VerifyInfo_PersonTable {

	WebDriver driver = Driver.getInstance();

	@Given("^I connect to the data table$")
	public void i_connect_to_the_data_table() throws Throwable {
		DBUtility.establishConnection(DBType.ORACLE);

	}

	@When("^personal table should contain  \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" and \"([^\"]*)\"$")
	public void personal_table_should_contain_and(String SSN_NR, String FIRST_NAME, String LAST_NAME,
			String MIDDLE_INIT, String GENDER, String DATE_OF_BIRTH) throws Throwable {

		String SqlQuery = "select * from CTLDEV.PERSON";
		Connection connect = DBUtility.getConnection(DBType.ORACLE);
		Statement statement = connect.createStatement();
		ResultSet resultset = statement.executeQuery(SqlQuery);
		ResultSetMetaData metaData = resultset.getMetaData();

		int columns = metaData.getColumnCount();
		for (int i = 1; i < columns + 1; i++) {
			System.out.println(metaData.getColumnName(i));
		}

	}

	@When("^personal table should have user's  \"([^\"]*)\" ssn number$")
	public void personal_table_should_have_user_s_ssn_number(String expected_SSN) throws Throwable {
		String ssn = "select SSN_NR from CTLDEV.PERSON";

		Connection connect = DBUtility.getConnection(DBType.ORACLE);
		Statement statement = connect.createStatement();
		ResultSet resultset = statement.executeQuery(ssn);

		while (resultset.next()) {
			if (resultset.getString("SSN_NR").equals(expected_SSN)) {
				System.out.println(expected_SSN + " exists");
				break;
			}
		}
	}

	@When("^personal table should have user's \"([^\"]*)\" first name$")
	public void personal_table_should_have_user_s_first_name(String expected_FirstName) throws Throwable {

		String firsName = "select FIRST_NAME from CTLDEV.PERSON";

		Connection connect = DBUtility.getConnection(DBType.ORACLE);
		Statement statement = connect.createStatement();
		ResultSet resultset = statement.executeQuery(firsName);

		while (resultset.next()) {
			if (resultset.getString("FIRST_NAME").equals(expected_FirstName)) {
				System.out.println(expected_FirstName + " exists");
				break;
			}
		}
	}

	@When("^personal table should have user's \"([^\"]*)\" last name$")
	public void personal_table_should_have_user_s_last_name(String expected_LastName) throws Throwable {

		String lastName = "select LAST_NAME from CTLDEV.PERSON";

		Connection connect = DBUtility.getConnection(DBType.ORACLE);
		Statement statement = connect.createStatement();
		ResultSet resultset = statement.executeQuery(lastName);

		while (resultset.next()) {
			if (resultset.getString("LAST_NAME").equals(expected_LastName)) {
				System.out.println(expected_LastName + " exists");
				break;
			}
		}
	}

	@When("^personal table should have user's \"([^\"]*)\" middle init$")
	public void personal_table_should_have_user_s_middle_init(String expected_MiddleName) throws Throwable {

		String SqlQuery = "select * from CTLDEV.PERSON";
		Connection connect = DBUtility.getConnection(DBType.ORACLE);
		Statement statement = connect.createStatement();
		ResultSet resultset = statement.executeQuery(SqlQuery);
		ResultSetMetaData metaData = resultset.getMetaData();

		int columnsCount = metaData.getColumnCount();

		while (resultset.next()) {

			for (int cell = 1; cell <= columnsCount; cell++) {
				if (resultset.getString(cell) == null) {
					continue;
				}
				if (resultset.getString(cell).contains(expected_MiddleName)) {
					System.out.println(expected_MiddleName + " exists");
					break;
				}

			}
		}
	}

	@When("^personal table should have user's \"([^\"]*)\" gender$")
	public void personal_table_should_have_user_s_gender(String expected_Gander) throws Throwable {

		String gander = "select GENDER from CTLDEV.PERSON";

		Connection connect = DBUtility.getConnection(DBType.ORACLE);
		Statement statement = connect.createStatement();
		ResultSet resultset = statement.executeQuery(gander);

		while (resultset.next()) {
			if (resultset.getString("GENDER").equals(expected_Gander)) {
				System.out.println(expected_Gander + " exists");
				break;
			}
		}
	}

	@Then("^personal table should have user's \"([^\"]*)\" date of birth$")
	public void personal_table_should_have_user_s_date_of_birth(String expected_dateOfBirth) throws Throwable {

		String SqlQuery = "select DATE_OF_BIRTH from CTLDEV.PERSON";

		List<String[]> dateResult = DBUtility.runSQLQuery(SqlQuery);

		for (String[] result : dateResult) {
			for (String cell : result) {
				if (cell.contains(expected_dateOfBirth)) {
					System.out.println(expected_dateOfBirth + " exists");
					break;
				} else {
					continue;
				}
			}
		}
		System.out.println(expected_dateOfBirth + " does not exist or not in correct format");

	}
}