Feature: Test Financial Information fields 

 
Scenario: Happy Path 
	Given I am on the financial information page of CT-Loan 
	When I select first application "Yes" 
	And I enter number of previous applications "0" 
	And I enter annual income "100.000" 
	And I select income type "Yearly" 
	And I click on type of ownership "Own" 
	And I enter monthly rent "2500" 
	And I enter number of dependents "3" 
	And I enter saving amount "2000" 
	And I enter loan term "36 months" 
	And I check the confirmation chechbox 
	And I enter the full name "Mesut Aydin" 
	And I enter single line "" 
	And I enter the date "12/21/2017" 
	And I clicked on the submit button 
	Then I should be able to see confirmation page