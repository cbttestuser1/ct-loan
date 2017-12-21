Feature: As a user, when I go to CT-Loan page, 
	I should able to add contact information into all fields
@Test1
Scenario Outline: Test Contact Information fields pattern 
	Given I am on the home page of CT-Loan 
	Then I add first name  "<FirstName>" 
	And I add middle name "<MiddleName>" 
	And I add last name "<LastName>" 
	And I choose my gender 
	And I add date of birth "<DateOfBirth>" 
	And I  add SSN "<SSN>" 
	When I click on Next button 
	Then I add Address Line first  "<AddressLine1>" 
	And I add Address Line second  "<AddressLine2>" 
	And I add City "<City>" 
	And I add State "<State>" 
	And I  add Zipcode "<Zipcode>" 
	And I select country 
	And I  add Personal Phone "<PersonalPhone>" 
	And I  add Work Phone "<WorkPhone>" 
	And I add an Ext. "<Ext.>"
	And I  add Email_Work "<EmailWork>" 
	And I  add Email_Personal "<EmailPersonal>" 
	When I click on Next button contact page 
	Then I have to end up in employment information page.
	Examples: 
		|AddressLine1 | AddressLine2   |City       |State    |Zipcode  |   WorkPhone     |PersonalPhone| Ext.  | EmailWork               |EmailPersonal     | FirstName |MiddleName  |LastName    | DateOfBirth       |  SSN           |
		|51 Main st   |	apt 3          |New York   |New York |11107    |   5564567898     |4566574637   | 23334   | MarkJones@cybertek.com|MJones@gmail.com  | Mark	    |	Sam      |Jones	     |10/18/1984          |   234346980    |
		
		
		
		
