Feature: Saving personal info to person table

@Smoke
Scenario: Verifying personal information on database
	Given I am on the CT Loan application
	And enter valid personal, contact, employment and financial information from Excel
	When I submit the form
	Then the personal information should be saved in person table 
	