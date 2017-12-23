@Ruslan
Feature: Loan Application confirmation email 

Scenario: 
	Given I am on the home page of CT-Loan home page 
	And enter valid personal, contact, employment and financial information 
	When I submit the form 
	Then I should get an email confirming my application