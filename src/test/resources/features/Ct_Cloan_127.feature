@Cloan127 
Feature: Loan Application confirmation Application ID 

Scenario: 
	Given I am on the home page of CT-Loan home page 
	And enter valid personal,contact,employment and financial information 
#	When I submit the application form 
#	Then I should get an Application ID confirming my application
	And User should have personal information in DataBase as required
   	Then verify information from DataBase