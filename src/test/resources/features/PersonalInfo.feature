Feature: As a user, when I go to CT-Loan page,
		 I should able to add information into all fields.		

  Scenario: Test Personal Information fields pattern
    Given I am on the home page of CT-Loan 
    Then I add personal information data in CT-Loan personal info page 
		 |First Name | Middle Name |Last Name   |Date of Birth|Personal File ID|
		 |Mark	    |	Sam       |Jones	   |10/18/1984   |   234346980    |
	And I choose my gender 
	When I click on Next button
	Then I have to end up in contact information page.