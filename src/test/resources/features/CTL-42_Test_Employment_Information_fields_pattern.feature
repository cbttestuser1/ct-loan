@CTL-42
Feature: Test Employment Information fields pattern 

Scenario: 
	Create and automateTest scenarios for the following fields in order to test fields pattern(acceptable data type):
	
	#test1
	Given I am on the home page of CT-Loan home page
    Then I should be able to see text CT-Loan and user information boxes
	And I filled the Personal Information with valid data
	And I scroll down the page
	When I do not fill the Contact Information fields with acceptable data type
	And I scroll down the page
	And I click the Next button
	Then I should be able to see error messages for the field