Feature: Navigating to CT-Loan employment page 


Scenario: Choosing from the dropdown menues 
	Given I am on the home page of CT-Loan employment page 
	When I am choosing Title as a QA 
	And I am choosing Department as a Development 
	And I am choosing Duration as 3-5 
	And I am choosing Purpose as a Morgage 
	And I am choosing Superviseras as a Zachary Taylor 
	And I click on the Next button 
	Then I will be able to see the financial page 
