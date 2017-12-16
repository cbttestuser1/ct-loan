Feature: navigate to CT-Loan home page

  @SmokeTest
  Scenario: check the system up and running
    Given I set up the URL
    When I navigate to "http://cybertekschool.com/ctl.dev"
    Then I should be able to see text CT-Loan
