$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("PersonalInfoPositive.feature");
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
  "duration": 8023787732,
  "status": "passed"
});
formatter.match({
  "location": "personalStepInfo.enters_First_Name_and_Last_Name()"
});
formatter.result({
  "duration": 1087219838,
  "status": "passed"
});
formatter.match({
  "location": "personalStepInfo.verify_Data_type_String_characters_a_Z()"
});
formatter.result({
  "duration": 1481676708,
  "status": "passed"
});
formatter.match({
  "location": "personalStepInfo.field_type_text_box()"
});
formatter.result({
  "duration": 85148808,
  "status": "passed"
});
formatter.match({
  "location": "personalStepInfo.accepted_special_characters_apostrophe_hyphen()"
});
formatter.result({
  "duration": 1042041798,
  "status": "passed"
});
formatter.match({
  "location": "personalStepInfo.user_selects_the_gender()"
});
formatter.result({
  "duration": 1024615230,
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
  "duration": 42887705,
  "status": "passed"
});
formatter.match({
  "location": "personalStepInfo.user_enters_Date_of_Birth()"
});
formatter.result({
  "duration": 2394207690,
  "status": "passed"
});
formatter.match({
  "location": "personalStepInfo.verify_Watermark_format_is_MM_DD_YYYY()"
});
formatter.result({
  "duration": 40561079,
  "status": "passed"
});
formatter.match({
  "location": "personalStepInfo.data_type_integer()"
});
formatter.result({
  "duration": 1782581454,
  "status": "passed"
});
formatter.match({
  "location": "personalStepInfo.user_enters_SSN()"
});
formatter.result({
  "duration": 1047362206,
  "status": "passed"
});
formatter.match({
  "location": "personalStepInfo.verify_Data_type_integer_only()"
});
formatter.result({
  "duration": 392795680,
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
  "duration": 2412843065,
  "status": "passed"
});
formatter.after({
  "duration": 152995,
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
  "duration": 1210724596,
  "status": "passed"
});
formatter.match({
  "location": "personalStepInfo.the_user_enters_address_line_two()"
});
formatter.result({
  "duration": 1075988026,
  "status": "passed"
});
formatter.match({
  "location": "personalStepInfo.the_user_enter_city()"
});
formatter.result({
  "duration": 1025910444,
  "status": "passed"
});
formatter.match({
  "location": "personalStepInfo.the_user_enter_state()"
});
formatter.result({
  "duration": 984996695,
  "status": "passed"
});
formatter.match({
  "location": "personalStepInfo.the_user_enters_zipcode()"
});
formatter.result({
  "duration": 613989066,
  "status": "passed"
});
formatter.match({
  "location": "personalStepInfo.the_user_enters_work_phone()"
});
formatter.result({
  "duration": 679117527,
  "status": "passed"
});
formatter.match({
  "location": "personalStepInfo.the_user_enters_Country()"
});
formatter.result({
  "duration": 1077986710,
  "status": "passed"
});
formatter.match({
  "location": "personalStepInfo.the_user_enters_Extension()"
});
formatter.result({
  "duration": 1024860781,
  "status": "passed"
});
formatter.match({
  "location": "personalStepInfo.the_user_enters_Email()"
});
formatter.result({
  "duration": 1152891678,
  "status": "passed"
});
formatter.match({
  "location": "personalStepInfo.the_user_enters_Personal_email()"
});
formatter.result({
  "duration": 1214187781,
  "status": "passed"
});
formatter.after({
  "duration": 33562,
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
formatter.step({
  "line": 13,
  "name": "verify one more time  Size:10-30 digits",
  "keyword": "But "
});
formatter.step({
  "line": 14,
  "name": "the user clicks next",
  "keyword": "And "
});
formatter.match({
  "location": "contactInfoVerify.user_is_on_Contact_Information_Page()"
});
formatter.result({
  "duration": 84354616,
  "status": "passed"
});
formatter.match({
  "location": "contactInfoVerify.user_enters_Work_Phone_number()"
});
formatter.result({
  "duration": 480173953,
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
  "duration": 304231605,
  "status": "passed"
});
formatter.match({
  "location": "contactInfoVerify.user_enters_Extension()"
});
formatter.result({
  "duration": 300167153,
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
  "duration": 302299628,
  "status": "passed"
});
formatter.match({
  "location": "contactInfoVerify.user_enters_Email_work()"
});
formatter.result({
  "duration": 570125674,
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
  "duration": 1345244577,
  "status": "passed"
});
formatter.match({
  "location": "contactInfoVerify.user_enters_Personal_email()"
});
formatter.result({
  "duration": 344277929,
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
  "duration": 436563891,
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
  "duration": 303753634,
  "status": "passed"
});
formatter.match({
  "location": "contactInfoVerify.the_user_clicks_next()"
});
formatter.result({
  "duration": 368386149,
  "status": "passed"
});
formatter.after({
  "duration": 33020,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 15,
      "value": "# Verify Contract TITLE SHOULD BE VISIBLE ON THE TOP OF THE PAGE"
    }
  ],
  "line": 18,
  "name": "",
  "description": "",
  "id": "verify-user-information;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 17,
      "name": "@positiveEmp"
    }
  ]
});
formatter.step({
  "line": 19,
  "name": "get the page Logo",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "choose the Title",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "choose Department",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "choose Time of Empoyment",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "choose Loan Type",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "choose Supervisor Contact Info",
  "keyword": "And "
});
formatter.match({
  "location": "positiveEmpTest.get_the_page_Logo()"
});
formatter.result({
  "duration": 45578361,
  "status": "passed"
});
formatter.match({
  "location": "positiveEmpTest.choose_the_Title()"
});
formatter.result({
  "duration": 480441231,
  "status": "passed"
});
formatter.match({
  "location": "positiveEmpTest.choose_Department()"
});
formatter.result({
  "duration": 529891508,
  "status": "passed"
});
formatter.match({
  "location": "positiveEmpTest.choose_Time_of_Empoyment()"
});
formatter.result({
  "duration": 539267954,
  "status": "passed"
});
formatter.match({
  "location": "positiveEmpTest.choose_Loan_Type()"
});
formatter.result({
  "duration": 549834537,
  "status": "passed"
});
formatter.match({
  "location": "positiveEmpTest.choose_Supervisor_Contact_Info()"
});
formatter.result({
  "duration": 825241599,
  "status": "passed"
});
formatter.after({
  "duration": 69640,
  "status": "passed"
});
});