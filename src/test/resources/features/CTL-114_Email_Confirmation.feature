Feature: Loan Application confirmation email 
@CTL-114
Scenario: Automate creating a new account then verify email confirmaation 



	Given I am on the CT Loan application 
	And enter valid personal, contact, employment and financial information 
	When I submit the form 
	Then I should get an email confirming my application