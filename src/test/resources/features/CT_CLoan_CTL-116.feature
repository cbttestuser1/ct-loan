@SmokeTest @Ruslan @Cloan_Spring-3
Feature: CLT-113, CTL-116, Loan Application confirmation email 
	
	Background:
	Given I am on the home page of CT-Loan home page 
	And enter valid personal, contact, employment and financial information 
	When I submit the form 
	
@CTL-116
Scenario: Loan Application confirmation email
	
	Then I should get an email confirming my application
	
@CTL-113
Scenario: Attachment name must be CTLoanDev.pdf. The attachment name will be changed in the future. This story only tests if attachment exists
	Then I should get an email with an attachment
