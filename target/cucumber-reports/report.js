$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("navigateToCT-LoanHomepage.feature");
formatter.feature({
  "line": 1,
  "name": "navigate to CT-Loan home page",
  "description": "",
  "id": "navigate-to-ct-loan-home-page",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "check the system up and running",
  "description": "",
  "id": "navigate-to-ct-loan-home-page;check-the-system-up-and-running",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I am on the home page of CT-Loan home page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I scroll down the page",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I should be able to see text CT-Loan and user information boxes",
  "keyword": "Then "
});
formatter.match({
  "location": "NavigateToCT_LoanHomePage.i_am_on_the_home_page_of_CT_Loan_home_page()"
});
formatter.result({
  "duration": 7706351374,
  "status": "passed"
});
formatter.match({
  "location": "NavigateToCT_LoanHomePage.i_scroll_down_the_page()"
});
formatter.result({
  "duration": 2143187514,
  "status": "passed"
});
formatter.match({
  "location": "NavigateToCT_LoanHomePage.i_should_be_able_to_see_text_CT_Loan_and_user_information_boxes()"
});
formatter.result({
  "duration": 87835432,
  "status": "passed"
});
formatter.after({
  "duration": 154919,
  "status": "passed"
});
formatter.uri("personalInfo.feature");
formatter.feature({
  "line": 2,
  "name": "Test Personal Information fields Length/size",
  "description": "",
  "id": "test-personal-information-fields-length/size",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@personalInfoTest"
    }
  ]
});
formatter.scenario({
  "line": 4,
  "name": "",
  "description": "",
  "id": "test-personal-information-fields-length/size;",
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
  "name": "user enters Date of Birth",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Verify field size for MM max 2 digits, can accept number between 1-12; If one digit, add zero to front",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Field size for DD: max 2 digits; Can accept number between 1-31, depends on month; If one digit, add zero to front;",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Field size YYYY: max 4 digits; Can accept number between 1900 and (current date minus 16 years);",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User enters SSN/Personal File ID",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Verify do not accept any other characters other than digits 0-9; Cannot be null; Cannot contain any spaces.",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "http://cybertekschool.com/ctl.qa",
      "offset": 38
    }
  ],
  "location": "PersonalInformationCT_LoanPart2.user_navigates_to_the_following_url(String)"
});
formatter.result({
  "duration": 1948696,
  "status": "passed"
});
formatter.match({
  "location": "PersonalInformationCT_LoanPart2.user_enters_Date_of_Birth()"
});
formatter.result({
  "duration": 142580,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 29
    },
    {
      "val": "1",
      "offset": 65
    },
    {
      "val": "12",
      "offset": 67
    }
  ],
  "location": "PersonalInformationCT_LoanPart2.verify_field_size_for_MM_max_digits_can_accept_number_between_If_one_digit_add_zero_to_front(int,int,int)"
});
formatter.result({
  "duration": 1432960,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 23
    },
    {
      "val": "1",
      "offset": 59
    },
    {
      "val": "31",
      "offset": 61
    }
  ],
  "location": "PersonalInformationCT_LoanPart2.field_size_for_DD_max_digits_Can_accept_number_between_depends_on_month_If_one_digit_add_zero_to_front(int,int,int)"
});
formatter.result({
  "duration": 126470,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "4",
      "offset": 21
    },
    {
      "val": "1900",
      "offset": 57
    },
    {
      "val": "16",
      "offset": 86
    }
  ],
  "location": "PersonalInformationCT_LoanPart2.field_size_YYYY_max_digits_Can_accept_number_between_and_current_date_minus_years(int,int,int)"
});
formatter.result({
  "duration": 151945,
  "status": "passed"
});
formatter.match({
  "location": "PersonalInformationCT_LoanPart2.user_enters_SSN_Personal_File_ID()"
});
formatter.result({
  "duration": 30824,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "0",
      "offset": 60
    },
    {
      "val": "9",
      "offset": 62
    }
  ],
  "location": "PersonalInformationCT_LoanPart2.verify_do_not_accept_any_other_characters_other_than_digits_Cannot_be_null_Cannot_contain_any_spaces(int,int)"
});
formatter.result({
  "duration": 242417,
  "status": "passed"
});
formatter.after({
  "duration": 50098,
  "status": "passed"
});
formatter.uri("userContactInfo.feature");
formatter.feature({
  "line": 1,
  "name": "Verify User Information",
  "description": "",
  "id": "verify-user-information",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "",
  "description": "",
  "id": "verify-user-information;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@cantactInfo"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "User is on Contact Information Page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User enters Work Phone number",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "Verify the Size:10 digits",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "User enters Extension",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Verify the Size:5 digits",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "User enters Email (work)",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Verify Size:10-30 digits",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "User enters Personal (email)",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Verify Size:10-30 digits",
  "keyword": "Then "
});
formatter.match({
  "location": "userContactInfo.user_is_on_Contact_Information_Page()"
});
formatter.result({
  "duration": 71236,
  "status": "passed"
});
formatter.match({
  "location": "userContactInfo.user_enters_Work_Phone_number()"
});
formatter.result({
  "duration": 33206,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "10",
      "offset": 16
    }
  ],
  "location": "userContactInfo.verify_the_Size_digits(int)"
});
formatter.result({
  "duration": 249826,
  "status": "passed"
});
formatter.match({
  "location": "userContactInfo.user_enters_Extension()"
});
formatter.result({
  "duration": 24317,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 16
    }
  ],
  "location": "userContactInfo.verify_the_Size_digits(int)"
});
formatter.result({
  "duration": 126621,
  "status": "passed"
});
formatter.match({
  "location": "userContactInfo.user_enters_Email_work()"
});
formatter.result({
  "duration": 27171,
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
  "location": "userContactInfo.verify_Size_digits(int,int)"
});
formatter.result({
  "duration": 536078,
  "status": "passed"
});
formatter.match({
  "location": "userContactInfo.user_enters_Personal_email()"
});
formatter.result({
  "duration": 25565,
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
  "location": "userContactInfo.verify_Size_digits(int,int)"
});
formatter.result({
  "duration": 101709,
  "status": "passed"
});
formatter.after({
  "duration": 69874,
  "status": "passed"
});
});