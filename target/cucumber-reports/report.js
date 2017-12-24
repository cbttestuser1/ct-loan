$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("CTLoanPositive.feature");
formatter.feature({
  "line": 2,
  "name": "Positive test",
  "description": "",
  "id": "positive-test",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@positiveInfoTest"
    }
  ]
});
formatter.scenario({
  "line": 3,
  "name": "",
  "description": "",
  "id": "positive-test;",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User navigates to the following url: \"http://cybertekschool.com/ctl.qa\"",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Enters First Name and Last Name",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Verify Data type: String characters a-Z",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Field type: text box",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Accepted special characters (apostrophe, hyphen)",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User selects the gender",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Verify field input 2 options, F, M",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "User enters Date of Birth",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Verify Watermark format is MM/DD/YYYY",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "Data type: integer",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User enters SSN",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "Verify Data type integer only",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "Watermark format \"0123456789\" .",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "http://cybertekschool.com/ctl.qa",
      "offset": 38
    }
  ],
  "location": "personalStepInfo.user_navigates_to_the_following_url(String)"
});
formatter.result({
  "duration": 8672539737,
  "status": "passed"
});
formatter.match({
  "location": "personalStepInfo.enters_First_Name_and_Last_Name()"
});
formatter.result({
  "duration": 1136592670,
  "status": "passed"
});
formatter.match({
  "location": "personalStepInfo.verify_Data_type_String_characters_a_Z()"
});
formatter.result({
  "duration": 1303727976,
  "status": "passed"
});
formatter.match({
  "location": "personalStepInfo.field_type_text_box()"
});
formatter.result({
  "duration": 59484041,
  "status": "passed"
});
formatter.match({
  "location": "personalStepInfo.accepted_special_characters_apostrophe_hyphen()"
});
formatter.result({
  "duration": 1028771243,
  "status": "passed"
});
formatter.match({
  "location": "personalStepInfo.user_selects_the_gender()"
});
formatter.result({
  "duration": 1024469947,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 19
    }
  ],
  "location": "personalStepInfo.verify_field_input_options_F_M(int)"
});
formatter.result({
  "duration": 44861919,
  "status": "passed"
});
formatter.match({
  "location": "personalStepInfo.user_enters_Date_of_Birth()"
});
formatter.result({
  "duration": 2373415201,
  "status": "passed"
});
formatter.match({
  "location": "personalStepInfo.verify_Watermark_format_is_MM_DD_YYYY()"
});
formatter.result({
  "duration": 40954404,
  "status": "passed"
});
formatter.match({
  "location": "personalStepInfo.data_type_integer()"
});
formatter.result({
  "duration": 1742935843,
  "status": "passed"
});
formatter.match({
  "location": "personalStepInfo.user_enters_SSN()"
});
formatter.result({
  "duration": 1072190421,
  "status": "passed"
});
formatter.match({
  "location": "personalStepInfo.verify_Data_type_integer_only()"
});
formatter.result({
  "duration": 406451813,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "0123456789",
      "offset": 18
    }
  ],
  "location": "personalStepInfo.watermark_format(String)"
});
formatter.result({
  "duration": 2430784505,
  "status": "passed"
});
formatter.after({
  "duration": 149855,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 20,
      "value": "#Test corresponding errors - refer to req documentation"
    },
    {
      "line": 21,
      "value": "#Please follow Requirement Document"
    },
    {
      "line": 22,
      "value": "#Positive Scenarios"
    }
  ],
  "line": 26,
  "name": "",
  "description": "",
  "id": "positive-test;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 25,
      "name": "@contact"
    }
  ]
});
formatter.step({
  "line": 27,
  "name": "the user enters the address line one",
  "keyword": "Given "
});
formatter.step({
  "line": 28,
  "name": "the user enters address line two",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "the user enter city",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "the user enter state",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "the user enters zipcode",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "the user enters work phone",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "the user enters Country",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "the user enters Extension",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "the user enters Email",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "the user enters Personal email",
  "keyword": "And "
});
formatter.match({
  "location": "personalStepInfo.the_user_enters_the_address_line_one()"
});
formatter.result({
  "duration": 1285122119,
  "status": "passed"
});
formatter.match({
  "location": "personalStepInfo.the_user_enters_address_line_two()"
});
formatter.result({
  "duration": 1072506280,
  "status": "passed"
});
formatter.match({
  "location": "personalStepInfo.the_user_enter_city()"
});
formatter.result({
  "duration": 1029797146,
  "status": "passed"
});
formatter.match({
  "location": "personalStepInfo.the_user_enter_state()"
});
formatter.result({
  "duration": 988470248,
  "status": "passed"
});
formatter.match({
  "location": "personalStepInfo.the_user_enters_zipcode()"
});
formatter.result({
  "duration": 622752507,
  "status": "passed"
});
formatter.match({
  "location": "personalStepInfo.the_user_enters_work_phone()"
});
formatter.result({
  "duration": 680424820,
  "status": "passed"
});
formatter.match({
  "location": "personalStepInfo.the_user_enters_Country()"
});
formatter.result({
  "duration": 1052931025,
  "status": "passed"
});
formatter.match({
  "location": "personalStepInfo.the_user_enters_Extension()"
});
formatter.result({
  "duration": 1018357251,
  "status": "passed"
});
formatter.match({
  "location": "personalStepInfo.the_user_enters_Email()"
});
formatter.result({
  "duration": 1156590821,
  "status": "passed"
});
formatter.match({
  "location": "personalStepInfo.the_user_enters_Personal_email()"
});
formatter.result({
  "duration": 1219636845,
  "status": "passed"
});
formatter.after({
  "duration": 98091,
  "status": "passed"
});
formatter.scenario({
  "line": 39,
  "name": "",
  "description": "",
  "id": "positive-test;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 38,
      "name": "@cantactInfo"
    }
  ]
});
formatter.step({
  "line": 40,
  "name": "User is on Contact Information Page",
  "keyword": "Given "
});
formatter.step({
  "line": 41,
  "name": "User enters Work Phone number",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "Verify the Size:10 digits",
  "keyword": "Then "
});
formatter.step({
  "line": 43,
  "name": "User enters Extension",
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "Verify the Size:5 digits",
  "keyword": "Then "
});
formatter.step({
  "line": 45,
  "name": "User enters Email (work)",
  "keyword": "And "
});
formatter.step({
  "line": 46,
  "name": "Verify Size:10-30 digits",
  "keyword": "Then "
});
formatter.step({
  "line": 47,
  "name": "User enters Personal (email)",
  "keyword": "And "
});
formatter.step({
  "line": 48,
  "name": "Verify Size:10-30 digits",
  "keyword": "Then "
});
formatter.step({
  "line": 49,
  "name": "verify one more time  Size:10-30 digits",
  "keyword": "But "
});
formatter.step({
  "line": 50,
  "name": "the user clicks next",
  "keyword": "And "
});
formatter.match({
  "location": "contactInfoVerify.user_is_on_Contact_Information_Page()"
});
formatter.result({
  "duration": 65954333,
  "status": "passed"
});
formatter.match({
  "location": "contactInfoVerify.user_enters_Work_Phone_number()"
});
formatter.result({
  "duration": 513561462,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "10",
      "offset": 16
    }
  ],
  "location": "contactInfoVerify.verify_the_Size_digits(int)"
});
formatter.result({
  "duration": 301253486,
  "status": "passed"
});
formatter.match({
  "location": "contactInfoVerify.user_enters_Extension()"
});
formatter.result({
  "duration": 305219737,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 16
    }
  ],
  "location": "contactInfoVerify.verify_the_Size_digits(int)"
});
formatter.result({
  "duration": 303267150,
  "status": "passed"
});
formatter.match({
  "location": "contactInfoVerify.user_enters_Email_work()"
});
formatter.result({
  "duration": 604468530,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "10",
      "offset": 12
    },
    {
      "val": "30",
      "offset": 15
    }
  ],
  "location": "contactInfoVerify.verify_Size_digits(int,int)"
});
formatter.result({
  "duration": 1429011818,
  "status": "passed"
});
formatter.match({
  "location": "contactInfoVerify.user_enters_Personal_email()"
});
formatter.result({
  "duration": 337184726,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "10",
      "offset": 12
    },
    {
      "val": "30",
      "offset": 15
    }
  ],
  "location": "contactInfoVerify.verify_Size_digits(int,int)"
});
formatter.result({
  "duration": 443992325,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "10",
      "offset": 27
    },
    {
      "val": "30",
      "offset": 30
    }
  ],
  "location": "contactInfoVerify.verify_one_more_time_Size_digits(int,int)"
});
formatter.result({
  "duration": 302112280,
  "status": "passed"
});
formatter.match({
  "location": "contactInfoVerify.the_user_clicks_next()"
});
formatter.result({
  "duration": 375262763,
  "status": "passed"
});
formatter.after({
  "duration": 75147,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 51,
      "value": "# Verify Contract TITLE SHOULD BE VISIBLE ON THE TOP OF THE PAGE"
    }
  ],
  "line": 54,
  "name": "",
  "description": "",
  "id": "positive-test;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 53,
      "name": "@positiveEmp"
    }
  ]
});
formatter.step({
  "line": 55,
  "name": "get the page Logo",
  "keyword": "Given "
});
formatter.step({
  "line": 56,
  "name": "choose the Title",
  "keyword": "Then "
});
formatter.step({
  "line": 57,
  "name": "choose Department",
  "keyword": "Then "
});
formatter.step({
  "line": 58,
  "name": "choose Time of Empoyment",
  "keyword": "And "
});
formatter.step({
  "line": 59,
  "name": "choose Loan Type",
  "keyword": "Then "
});
formatter.step({
  "line": 60,
  "name": "choose Supervisor Contact Info",
  "keyword": "And "
});
formatter.match({
  "location": "positiveEmpTest.get_the_page_Logo()"
});
formatter.result({
  "duration": 51172428,
  "status": "passed"
});
formatter.match({
  "location": "positiveEmpTest.choose_the_Title()"
});
formatter.result({
  "duration": 515035684,
  "status": "passed"
});
formatter.match({
  "location": "positiveEmpTest.choose_Department()"
});
formatter.result({
  "duration": 560495725,
  "status": "passed"
});
formatter.match({
  "location": "positiveEmpTest.choose_Time_of_Empoyment()"
});
formatter.result({
  "duration": 542941447,
  "status": "passed"
});
formatter.match({
  "location": "positiveEmpTest.choose_Loan_Type()"
});
formatter.result({
  "duration": 557870722,
  "status": "passed"
});
formatter.match({
  "location": "positiveEmpTest.choose_Supervisor_Contact_Info()"
});
formatter.result({
  "duration": 827061915,
  "status": "passed"
});
formatter.after({
  "duration": 48799,
  "status": "passed"
});
formatter.scenario({
  "line": 63,
  "name": "Positive",
  "description": "",
  "id": "positive-test;positive",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 62,
      "name": "@financialInfoPos"
    }
  ]
});
formatter.step({
  "line": 64,
  "name": "The user should be in financial information page",
  "keyword": "Given "
});
formatter.step({
  "line": 65,
  "name": "The user should choose Ct Loan \"no\"",
  "keyword": "When "
});
formatter.step({
  "line": 66,
  "name": "The user should fill annual income",
  "keyword": "And "
});
formatter.step({
  "line": 67,
  "name": "The user should choose income type",
  "keyword": "And "
});
formatter.step({
  "line": 68,
  "name": "The user should choose house own or rent",
  "keyword": "And "
});
formatter.step({
  "line": 69,
  "name": "The user should fill spent in one month",
  "keyword": "And "
});
formatter.step({
  "line": 70,
  "name": "The user should fill number of dependents",
  "keyword": "And "
});
formatter.step({
  "line": 71,
  "name": "The user should fill savings",
  "keyword": "But "
});
formatter.step({
  "line": 72,
  "name": "The user choose the desired loan term",
  "keyword": "When "
});
formatter.step({
  "line": 73,
  "name": "The user should check confirm box",
  "keyword": "And "
});
formatter.step({
  "line": 74,
  "name": "The user should enter full name to submit application",
  "keyword": "And "
});
formatter.step({
  "line": 75,
  "name": "the user should type date",
  "keyword": "And "
});
formatter.step({
  "line": 76,
  "name": "the user should click submit on finanpage",
  "keyword": "Then "
});
formatter.step({
  "line": 77,
  "name": "assert thank you message is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "FinancialCTL.the_user_should_be_in_financial_information_page()"
});
formatter.result({
  "duration": 5161651,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "no",
      "offset": 32
    }
  ],
  "location": "FinancialCTL.the_user_should_choose_Ct_Loan(String)"
});
formatter.result({
  "duration": 609632207,
  "status": "passed"
});
formatter.match({
  "location": "FinancialCTL.the_user_should_fill_annual_income()"
});
formatter.result({
  "duration": 635815142,
  "status": "passed"
});
formatter.match({
  "location": "FinancialCTL.the_user_should_choose_income_type()"
});
formatter.result({
  "duration": 986959950,
  "status": "passed"
});
formatter.match({
  "location": "FinancialCTL.the_user_should_choose_house_own_or_rent()"
});
formatter.result({
  "duration": 612779990,
  "status": "passed"
});
formatter.match({
  "location": "FinancialCTL.the_user_should_fill_spent_in_one_month()"
});
formatter.result({
  "duration": 606116550,
  "status": "passed"
});
formatter.match({
  "location": "FinancialCTL.the_user_should_fill_number_of_dependents()"
});
formatter.result({
  "duration": 575688456,
  "status": "passed"
});
formatter.match({
  "location": "FinancialCTL.the_user_should_fill_savings()"
});
formatter.result({
  "duration": 614521881,
  "status": "passed"
});
formatter.match({
  "location": "FinancialCTL.the_user_choose_the_desired_loan_term()"
});
formatter.result({
  "duration": 1002306338,
  "status": "passed"
});
formatter.match({
  "location": "FinancialCTL.the_user_should_check_confirm_box()"
});
formatter.result({
  "duration": 605257317,
  "status": "passed"
});
formatter.match({
  "location": "FinancialCTL.the_user_should_enter_full_name_to_submit_application()"
});
formatter.result({
  "duration": 676288990,
  "status": "passed"
});
formatter.match({
  "location": "FinancialCTL.the_user_should_type_date()"
});
formatter.result({
  "duration": 747773253,
  "status": "passed"
});
formatter.match({
  "location": "FinancialCTL.the_user_should_click_submit_on_finanpage()"
});
formatter.result({
  "duration": 660086032,
  "status": "passed"
});
formatter.match({
  "location": "FinancialCTL.assert_thank_you_message_is_displayed()"
});
formatter.result({
  "duration": 505324250,
  "status": "passed"
});
formatter.after({
  "duration": 62313,
  "status": "passed"
});
formatter.scenario({
  "line": 80,
  "name": "Confirm Email",
  "description": "",
  "id": "positive-test;confirm-email",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 79,
      "name": "@confirmation"
    }
  ]
});
formatter.step({
  "line": 81,
  "name": "I am on the CT Loan application",
  "keyword": "Given "
});
formatter.step({
  "line": 82,
  "name": "enter valid personal, contact, employment and financial information",
  "keyword": "And "
});
formatter.step({
  "line": 83,
  "name": "I submit the form",
  "keyword": "When "
});
formatter.step({
  "line": 84,
  "name": "I should get an email with an attachment",
  "keyword": "Then "
});
formatter.match({
  "location": "EmailConfirmation.i_am_on_the_CT_Loan_application()"
});
formatter.result({
  "duration": 19033304,
  "status": "passed"
});
formatter.match({
  "location": "EmailConfirmation.enter_valid_personal_contact_employment_and_financial_information()"
});
formatter.result({
  "duration": 32358,
  "status": "passed"
});
formatter.match({
  "location": "EmailConfirmation.i_submit_the_form()"
});
formatter.result({
  "duration": 31507,
  "status": "passed"
});
formatter.match({
  "location": "EmailConfirmation.i_should_get_an_email_with_an_attachment()"
});
formatter.result({
  "duration": 5791530139,
  "status": "passed"
});
formatter.after({
  "duration": 52005,
  "status": "passed"
});
});