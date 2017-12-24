@CTL-140 
Feature: Testing WebService Get Person by SSN 

Scenario:
For this scenario verify person information entered via UI to the information obtained by the rest endpoint 

	Given I am on the home page of CT-Loan home page 
	And enter valid personal, contact, employment and financial information 
	When I submit the form 
	Then I should get person information by ssn via rest get endpoint