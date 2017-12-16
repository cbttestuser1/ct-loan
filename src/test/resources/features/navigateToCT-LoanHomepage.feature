Feature: navigate to CT-Loan home page

  @SmokeTest
  Scenario: check the system up and running
    Given I am on the home page of "http://cybertekschool.com/ctl.dev"
    When I am on the home page
    Then I should be able to see text CT-Loan
