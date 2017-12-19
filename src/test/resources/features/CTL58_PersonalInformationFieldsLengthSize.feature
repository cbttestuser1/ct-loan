Feature: Test Personal Information fields Length/size 

Scenario: verify with min length 
	Given I am on the personal information page of CT-Loan 
	When I enter first name "a" 
	And I enter middle name "" 
	And I enter last name "b" 
	And I select male 
	And I enter date of birth "1/1/1900" 
	And I enter personal file id "0" 
	And I click the next button 
	Then I should be able to see contact information page 
	
Scenario: verify with max length 
	Given I am on the personal information page of CT-Loan 
	When I enter first name "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" 
	And I enter middle name "ccccccccccccccccccccccccccccccccccc" 
	And I enter last name "bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb" 
	And I select male 
	And I enter date of birth "12/12/2000" 
	And I enter personal file id "123456789" 
	And I click the next button 
	Then I should be able to see contact information page 
	
