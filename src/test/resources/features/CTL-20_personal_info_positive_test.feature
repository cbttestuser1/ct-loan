Feature: As a user, when I go to CT-Loan page, 
	I should able to add information into all fields.		
@Test1
Scenario Outline: Test Personal Information fields pattern 
	Given I am on the home page of CT-Loan 
	Then I add first name  "<FirstName>" 
	And I add middle name "<MiddleName>" 
	And I add last name "<LastName>" 
	And I choose my gender 
	And I add date of birth "<DateOfBirth>" 
	And I  add SSN "<SSN>" 
	When I click on Next button 
	Then I have to end up in contact information page. 
	Examples: 
		|FirstName  | MiddleName  |LastName    |DateOfBirth  |   SSN          |
		|Mark	     |	Sam        |Jones	    |10/18/1984   |   234346980    |
		