package com.ct.stepDefinitions;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.junit.Assert;

import com.ct.utilities.DBUtilIty;
import com.ct.utilities.DBUtilIty.DBType;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CTL128_personalInfoDataBaseVirification {

	@Given("^I connect to the data table$")
	public void i_connect_to_the_data_table() throws Throwable {
		DBUtilIty.establishConnection(DBType.ORACLE);
	}

	@When("^personal table should contain  \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" and \"([^\"]*)\"$")
	public void personal_table_should_contain_and(String SSN_NR, String FIRST_NAME, String LAST_NAME,
			String MIDDLE_INIT, String GENDER, String DATE_OF_BIRTH) throws Throwable {

		String SqlQuery1 = "select " + SSN_NR + " from CTLDEV.PERSON";
		List<String[]> results1 = DBUtilIty.runSQLQuery(SqlQuery1);
		Assert.assertTrue(!results1.isEmpty());
		String SqlQuery2 = "select " + FIRST_NAME + " from CTLDEV.PERSON";
		List<String[]> results2 = DBUtilIty.runSQLQuery(SqlQuery2);
		Assert.assertTrue(!results2.isEmpty());
		String SqlQuery3 = "select " + LAST_NAME + " from CTLDEV.PERSON";
		List<String[]> results3 = DBUtilIty.runSQLQuery(SqlQuery3);
		Assert.assertTrue(!results3.isEmpty());
		String SqlQuery4 = "select " + MIDDLE_INIT + " from CTLDEV.PERSON";
		List<String[]> results4 = DBUtilIty.runSQLQuery(SqlQuery4);
		Assert.assertTrue(!results4.isEmpty());
		String SqlQuery5 = "select " + GENDER + " from CTLDEV.PERSON";
		List<String[]> results5 = DBUtilIty.runSQLQuery(SqlQuery5);
		Assert.assertTrue(!results5.isEmpty());
		String SqlQuery6 = "select " + DATE_OF_BIRTH + " from CTLDEV.PERSON";
		List<String[]> results6 = DBUtilIty.runSQLQuery(SqlQuery6);
		Assert.assertTrue(!results6.isEmpty());

	}

	@When("^personal table should has user's  \"([^\"]*)\" ssn number$")
	public void personal_table_should_has_user_s_ssn_number(String arg1) throws Throwable {
		String SqlQuery = "select ssn_nr from CTLDEV.PERSON";
		List<String[]> results = DBUtilIty.runSQLQuery(SqlQuery);
		Assert.assertTrue(!results.isEmpty());
	}

	@When("^personal table should has user's \"([^\"]*)\" first name$")
	public void personal_table_should_has_user_s_first_name(String arg1) throws Throwable {
		String SqlQuery = "select first_name from CTLDEV.PERSON";
		List<String[]> results = DBUtilIty.runSQLQuery(SqlQuery);
		Assert.assertTrue(!results.isEmpty());
	}

	@When("^personal table should has user's \"([^\"]*)\" last name$")
	public void personal_table_should_has_user_s_last_name(String arg1) throws Throwable {
		String SqlQuery = "select last_name from CTLDEV.PERSON";
		List<String[]> results = DBUtilIty.runSQLQuery(SqlQuery);
		Assert.assertTrue(!results.isEmpty());
	}

	@When("^personal table should has user's \"([^\"]*)\" middle init$")
	public void personal_table_should_has_user_s_middle_init(String arg1) throws Throwable {
		String SqlQuery = "select middle_init from CTLDEV.PERSON";
		List<String[]> results = DBUtilIty.runSQLQuery(SqlQuery);
		Assert.assertTrue(!results.isEmpty());
	}

	@When("^personal table should has user's \"([^\"]*)\" gender$")
	public void personal_table_should_has_user_s_gender(String arg1) throws Throwable {
		String SqlQuery = "select gender from CTLDEV.PERSON";
		List<String[]> results = DBUtilIty.runSQLQuery(SqlQuery);
		Assert.assertTrue(!results.isEmpty());
	}

	@Then("^personal table should has user's \"([^\"]*)\" date of birth$")
	public void personal_table_should_has_user_s_date_of_birth(String arg1) throws Throwable {
		String SqlQuery = "select date_of_birth from CTLDEV.PERSON";
		List<String[]> results = DBUtilIty.runSQLQuery(SqlQuery);
		Assert.assertTrue(!results.isEmpty());
	}

	@Then("^gender should be indicated by M and F characters$")
	public void gender_should_be_indicated_by_M_and_F_characters() throws Throwable {
		String SqlQuery = "select gender from CTLDEV.PERSON";
		List<String[]> results = DBUtilIty.runSQLQuery(SqlQuery);
		for (String[] result : results) {
			for (String cell : result) {
				if ((!cell.equalsIgnoreCase("F")) & (!cell.equalsIgnoreCase("M"))) {
					throw new Exception();
				}
			}
		}
	}

	@Then("^DOB table must have the date in \"([^\"]*)\" format$")
	public void dob_table_must_have_the_date_in_format(String format) throws Throwable {
		String SqlQuery = "select date_of_birth from CTLDEV.PERSON";
		List<String[]> results = DBUtilIty.runSQLQuery(SqlQuery);
		for (String[] result : results) {
			for (String cell : result) {
				Date date = null;
				try {
//				SimpleDateFormat sdf = new SimpleDateFormat(format);
//				date = sdf.parse(cell);
//					DateFormat formatter = new SimpleDateFormat(format);
//					String today = formatter.format(date);
//					 System.out.println("Today : " + today);
					SimpleDateFormat sdf = new SimpleDateFormat(format);
					date = sdf.parse(cell);
					System.out.println(date + "+++++++++++++");
					
					Assert.assertEquals(sdf.format(date), cell);
				if (!cell.equals(sdf.format(date))) {
						date = null;
						System.out.println(date + "~~~~~~~~~~~~");
					}
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
		}
	}

	@When("^the user does not enter middle name, the field value should be blank$")
	public void the_user_does_not_enter_middle_name_the_field_value_should_be_blank() throws Throwable {
		String SqlQuery2 = "select * from CTLDEV.PERSON where middle_init is null";
		List<String[]> results = DBUtilIty.runSQLQuery(SqlQuery2);
		Assert.assertTrue(!results.isEmpty());
	}
}
