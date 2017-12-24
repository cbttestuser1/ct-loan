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
  "duration": 10225088120,
  "status": "passed"
});
formatter.match({
  "location": "personalStepInfo.enters_First_Name_and_Last_Name()"
});
formatter.result({
  "duration": 1145769090,
  "status": "passed"
});
formatter.match({
  "location": "personalStepInfo.verify_Data_type_String_characters_a_Z()"
});
formatter.result({
  "duration": 1342564820,
  "status": "passed"
});
formatter.match({
  "location": "personalStepInfo.field_type_text_box()"
});
formatter.result({
  "duration": 65702856,
  "status": "passed"
});
formatter.match({
  "location": "personalStepInfo.accepted_special_characters_apostrophe_hyphen()"
});
formatter.result({
  "duration": 1028891177,
  "status": "passed"
});
formatter.match({
  "location": "personalStepInfo.user_selects_the_gender()"
});
formatter.result({
  "duration": 1027569017,
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
  "duration": 50087514,
  "status": "passed"
});
formatter.match({
  "location": "personalStepInfo.user_enters_Date_of_Birth()"
});
formatter.result({
  "duration": 2446870255,
  "status": "passed"
});
formatter.match({
  "location": "personalStepInfo.verify_Watermark_format_is_MM_DD_YYYY()"
});
formatter.result({
  "duration": 50223489,
  "status": "passed"
});
formatter.match({
  "location": "personalStepInfo.data_type_integer()"
});
formatter.result({
  "duration": 2052086097,
  "status": "passed"
});
formatter.match({
  "location": "personalStepInfo.user_enters_SSN()"
});
formatter.result({
  "duration": 1047408770,
  "status": "passed"
});
formatter.match({
  "location": "personalStepInfo.verify_Data_type_integer_only()"
});
formatter.result({
  "duration": 365954882,
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
  "duration": 2505715105,
  "status": "passed"
});
formatter.after({
  "duration": 217241,
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
  "duration": 1230625495,
  "status": "passed"
});
formatter.match({
  "location": "personalStepInfo.the_user_enters_address_line_two()"
});
formatter.result({
  "duration": 1066516604,
  "status": "passed"
});
formatter.match({
  "location": "personalStepInfo.the_user_enter_city()"
});
formatter.result({
  "duration": 1049806519,
  "status": "passed"
});
formatter.match({
  "location": "personalStepInfo.the_user_enter_state()"
});
formatter.result({
  "duration": 988761353,
  "status": "passed"
});
formatter.match({
  "location": "personalStepInfo.the_user_enters_zipcode()"
});
formatter.result({
  "duration": 625073774,
  "status": "passed"
});
formatter.match({
  "location": "personalStepInfo.the_user_enters_work_phone()"
});
formatter.result({
  "duration": 700502249,
  "status": "passed"
});
formatter.match({
  "location": "personalStepInfo.the_user_enters_Country()"
});
formatter.result({
  "duration": 1105707724,
  "status": "passed"
});
formatter.match({
  "location": "personalStepInfo.the_user_enters_Extension()"
});
formatter.result({
  "duration": 1022764638,
  "status": "passed"
});
formatter.match({
  "location": "personalStepInfo.the_user_enters_Email()"
});
formatter.result({
  "duration": 1346493795,
  "status": "passed"
});
formatter.match({
  "location": "personalStepInfo.the_user_enters_Personal_email()"
});
formatter.result({
  "duration": 1268328920,
  "status": "passed"
});
formatter.after({
  "duration": 53988,
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
  "duration": 73672956,
  "status": "passed"
});
formatter.match({
  "location": "contactInfoVerify.user_enters_Work_Phone_number()"
});
formatter.result({
  "duration": 486259391,
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
  "duration": 301949657,
  "status": "passed"
});
formatter.match({
  "location": "contactInfoVerify.user_enters_Extension()"
});
formatter.result({
  "duration": 305242475,
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
  "duration": 301601420,
  "status": "passed"
});
formatter.match({
  "location": "contactInfoVerify.user_enters_Email_work()"
});
formatter.result({
  "duration": 566147939,
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
  "duration": 1396435345,
  "status": "passed"
});
formatter.match({
  "location": "contactInfoVerify.user_enters_Personal_email()"
});
formatter.result({
  "duration": 340405865,
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
  "duration": 444103748,
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
  "duration": 301621890,
  "status": "passed"
});
formatter.match({
  "location": "contactInfoVerify.the_user_clicks_next()"
});
formatter.result({
  "duration": 371741670,
  "status": "passed"
});
formatter.after({
  "duration": 40166,
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
  "duration": 40774848,
  "status": "passed"
});
formatter.match({
  "location": "positiveEmpTest.choose_the_Title()"
});
formatter.result({
  "duration": 479497177,
  "status": "passed"
});
formatter.match({
  "location": "positiveEmpTest.choose_Department()"
});
formatter.result({
  "duration": 520556965,
  "status": "passed"
});
formatter.match({
  "location": "positiveEmpTest.choose_Time_of_Empoyment()"
});
formatter.result({
  "duration": 554375751,
  "status": "passed"
});
formatter.match({
  "location": "positiveEmpTest.choose_Loan_Type()"
});
formatter.result({
  "duration": 550811112,
  "status": "passed"
});
formatter.match({
  "location": "positiveEmpTest.choose_Supervisor_Contact_Info()"
});
formatter.result({
  "duration": 761089310,
  "status": "passed"
});
formatter.after({
  "duration": 50274,
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
  "duration": 7518436,
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
  "duration": 625583521,
  "status": "passed"
});
formatter.match({
  "location": "FinancialCTL.the_user_should_fill_annual_income()"
});
formatter.result({
  "duration": 664359843,
  "status": "passed"
});
formatter.match({
  "location": "FinancialCTL.the_user_should_choose_income_type()"
});
formatter.result({
  "duration": 1026028992,
  "status": "passed"
});
formatter.match({
  "location": "FinancialCTL.the_user_should_choose_house_own_or_rent()"
});
formatter.result({
  "duration": 600733591,
  "status": "passed"
});
formatter.match({
  "location": "FinancialCTL.the_user_should_fill_spent_in_one_month()"
});
formatter.result({
  "duration": 613220043,
  "status": "passed"
});
formatter.match({
  "location": "FinancialCTL.the_user_should_fill_number_of_dependents()"
});
formatter.result({
  "duration": 572031975,
  "status": "passed"
});
formatter.match({
  "location": "FinancialCTL.the_user_should_fill_savings()"
});
formatter.result({
  "duration": 617152360,
  "status": "passed"
});
formatter.match({
  "location": "FinancialCTL.the_user_choose_the_desired_loan_term()"
});
formatter.result({
  "duration": 963765570,
  "status": "passed"
});
formatter.match({
  "location": "FinancialCTL.the_user_should_check_confirm_box()"
});
formatter.result({
  "duration": 604528037,
  "status": "passed"
});
formatter.match({
  "location": "FinancialCTL.the_user_should_enter_full_name_to_submit_application()"
});
formatter.result({
  "duration": 687542921,
  "status": "passed"
});
formatter.match({
  "location": "FinancialCTL.the_user_should_type_date()"
});
formatter.result({
  "duration": 765397523,
  "status": "passed"
});
formatter.match({
  "location": "FinancialCTL.the_user_should_click_submit_on_finanpage()"
});
formatter.result({
  "duration": 673224379,
  "status": "passed"
});
formatter.match({
  "location": "FinancialCTL.assert_thank_you_message_is_displayed()"
});
formatter.result({
  "duration": 504214064,
  "status": "passed"
});
formatter.after({
  "duration": 55975,
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
  "duration": 16868280,
  "status": "passed"
});
formatter.match({
  "location": "EmailConfirmation.enter_valid_personal_contact_employment_and_financial_information()"
});
formatter.result({
  "duration": 37480,
  "status": "passed"
});
formatter.match({
  "location": "EmailConfirmation.i_submit_the_form()"
});
formatter.result({
  "duration": 39887,
  "status": "passed"
});
formatter.match({
  "location": "EmailConfirmation.i_should_get_an_email_with_an_attachment()"
});
formatter.result({
  "duration": 6280667292,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//*[@email\u003d\u0027training@cybertekschool.com\u0027]\"}\n  (Session info: chrome\u003d63.0.3239.84)\n  (Driver info: chromedriver\u003d2.34.522932 (4140ab217e1ca1bec0c4b4d1b148f3361eb3a03e),platform\u003dMac OS X 10.13.1 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.8.1\u0027, revision: \u00276e95a6684b\u0027, time: \u00272017-12-01T18:33:54.468Z\u0027\nSystem info: host: \u0027Zeineps-Air.localdomain\u0027, ip: \u0027fe80:0:0:0:18f1:5a53:1d3f:6b3e%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.13.1\u0027, java.version: \u00271.8.0_111\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptSslCerts: true, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.34.522932 (4140ab217e1ca1..., userDataDir: /var/folders/vb/jg1mlv61431...}, cssSelectorsEnabled: true, databaseEnabled: false, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: MAC, platformName: MAC, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 63.0.3239.84, webStorageEnabled: true}\nSession ID: 058425c68ccfaba5e412e84337f7bde2\n*** Element info: {Using\u003dxpath, value\u003d//*[@email\u003d\u0027training@cybertekschool.com\u0027]}\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:601)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:371)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:473)\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:363)\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\n\tat com.sun.proxy.$Proxy18.isDisplayed(Unknown Source)\n\tat com.ct.stepDefinitions.EmailConfirmation.i_should_get_an_email_with_an_attachment(EmailConfirmation.java:50)\n\tat ✽.Then I should get an email with an attachment(CTLoanPositive.feature:84)\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 3467637827,
  "status": "passed"
});
formatter.uri("endToend.feature");
formatter.feature({
  "line": 2,
  "name": "End to end Ct loan",
  "description": "",
  "id": "end-to-end-ct-loan",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@endToEnd"
    }
  ]
});
formatter.scenarioOutline({
  "line": 4,
  "name": "personal info",
  "description": "",
  "id": "end-to-end-ct-loan;personal-info",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "User navigates to the following url: http://cybertekschool.com/ctl.qa",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User enters firstName as pos \u003cfirstName\u003e and lastName \u003clastName\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User selects gender pos \u003cgender\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User enters date pos \u003cDate\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Userenters ssn pos \u003cSSN\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Click to next button",
  "keyword": "And "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "end-to-end-ct-loan;personal-info;",
  "rows": [
    {
      "cells": [
        "firstName",
        "lastName",
        "gender",
        "Date",
        "SSN"
      ],
      "line": 13,
      "id": "end-to-end-ct-loan;personal-info;;1"
    },
    {
      "cells": [
        "\"ellen\"",
        "\"smith\"",
        "\"F\"",
        "\"02/11/1990\"",
        "\"123456789\""
      ],
      "line": 14,
      "id": "end-to-end-ct-loan;personal-info;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 14,
  "name": "personal info",
  "description": "",
  "id": "end-to-end-ct-loan;personal-info;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@endToEnd"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User navigates to the following url: http://cybertekschool.com/ctl.qa",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User enters firstName as pos \"ellen\" and lastName \"smith\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User selects gender pos \"F\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User enters date pos \"02/11/1990\"",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Userenters ssn pos \"123456789\"",
  "matchedColumns": [
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Click to next button",
  "keyword": "And "
});
formatter.match({
  "location": "CTL78_PersonalInfo.user_navigates_to_the_following_url_http_cybertekschool_com_ctl_qa()"
});
formatter.result({
  "duration": 3225897238,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ellen",
      "offset": 30
    },
    {
      "val": "smith",
      "offset": 51
    }
  ],
  "location": "EndToEnd.user_enters_firstName_as_pos_and_lastName(String,String)"
});
formatter.result({
  "duration": 1389147656,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "F",
      "offset": 25
    }
  ],
  "location": "EndToEnd.user_selects_gender_pos(String)"
});
formatter.result({
  "duration": 165112679,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "02/11/1990",
      "offset": 22
    }
  ],
  "location": "EndToEnd.user_enters_date_pos(String)"
});
formatter.result({
  "duration": 478762966,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "123456789",
      "offset": 20
    }
  ],
  "location": "EndToEnd.userenters_ssn_pos(String)"
});
formatter.result({
  "duration": 214394157,
  "status": "passed"
});
formatter.match({
  "location": "CTL78_PersonalInfo.click_to_next_button()"
});
formatter.result({
  "duration": 174970901,
  "status": "passed"
});
formatter.after({
  "duration": 55760,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 17,
  "name": "Contact information",
  "description": "",
  "id": "end-to-end-ct-loan;contact-information",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 18,
  "name": "I am on the contactPage",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "I fill addressline1 \u003cAddress\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "I fill city \u003ccity\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I fill State \u003cstate\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I fill ZipCode \u003czipcode\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I select country \u003ccountry\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I enter personal phone number\u003cphonenumber\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "I enter personal email \u003cpersEmail\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "I enter work email \u003cworkEmail\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "I click next button in contactpage",
  "keyword": "Then "
});
formatter.examples({
  "line": 29,
  "name": "",
  "description": "",
  "id": "end-to-end-ct-loan;contact-information;",
  "rows": [
    {
      "cells": [
        "adddress",
        "city",
        "state",
        "zipcode",
        "country",
        "phonenumber",
        "persEmail",
        "workEmail"
      ],
      "line": 30,
      "id": "end-to-end-ct-loan;contact-information;;1"
    },
    {
      "cells": [
        "\"blueberry \"",
        "\"newyork\"",
        "\"NJ\"",
        "\"23564\"",
        "\"United States\"",
        "\"85758\"",
        "\"abc@gmail.com\"",
        "\"fgt@hotmail.com\""
      ],
      "line": 31,
      "id": "end-to-end-ct-loan;contact-information;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 31,
  "name": "Contact information",
  "description": "",
  "id": "end-to-end-ct-loan;contact-information;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@endToEnd"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "I am on the contactPage",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "I fill addressline1 \u003cAddress\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "I fill city \"newyork\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I fill State \"NJ\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I fill ZipCode \"23564\"",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I select country \"United States\"",
  "matchedColumns": [
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I enter personal phone number\"85758\"",
  "matchedColumns": [
    5
  ],
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "I enter personal email \"abc@gmail.com\"",
  "matchedColumns": [
    6
  ],
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "I enter work email \"fgt@hotmail.com\"",
  "matchedColumns": [
    7
  ],
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "I click next button in contactpage",
  "keyword": "Then "
});
formatter.match({
  "location": "EndToEnd.i_am_on_the_contactPage()"
});
formatter.result({
  "duration": 2627246,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 18
    }
  ],
  "location": "EndToEnd.i_fill_addressline_Address(String)"
});
formatter.result({
  "duration": 459887358,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "newyork",
      "offset": 13
    }
  ],
  "location": "EndToEnd.i_fill_city(String)"
});
formatter.result({
  "duration": 134757296,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "NJ",
      "offset": 14
    }
  ],
  "location": "EndToEnd.i_fill_State(String)"
});
formatter.result({
  "duration": 90270085,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "23564",
      "offset": 16
    }
  ],
  "location": "EndToEnd.i_fill_ZipCode(String)"
});
formatter.result({
  "duration": 150786550,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "United States",
      "offset": 18
    }
  ],
  "location": "EndToEnd.i_select_country(String)"
});
formatter.result({
  "duration": 109070571,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "85758",
      "offset": 30
    }
  ],
  "location": "EndToEnd.i_enter_personal_phone_number(String)"
});
formatter.result({
  "duration": 531022820,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abc@gmail.com",
      "offset": 24
    }
  ],
  "location": "EndToEnd.i_enter_personal_email(String)"
});
formatter.result({
  "duration": 234147065,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "fgt@hotmail.com",
      "offset": 20
    }
  ],
  "location": "EndToEnd.i_enter_work_email(String)"
});
