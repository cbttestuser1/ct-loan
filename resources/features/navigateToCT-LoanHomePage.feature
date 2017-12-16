
Feature: navigate to CT-Loan home page

  @SmokeTest
  Scenario: check the system up and running
    Given I go to CT-Loan web page
    When I navigate to "http://cybertekschool.com/ctl.dev"
    Then I should be able to be on CT-Loan home page
