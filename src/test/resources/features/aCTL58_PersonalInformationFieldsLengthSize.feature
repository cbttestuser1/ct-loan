Feature: Test Personal Information fields Length/size 

@SmokeTest
Scenario: verify with min length 
	Given I am on the personal information page of CT-Loan 
	When I enter first name "adhyhyd" 
	And I enter middle name "" 
	And I enter last name "b" 
	And I select male 
	And I enter date of birth "01/08/1975" 
	And I enter personal file id "212345678" 
	And I click the next button 
	Then I should be able to see contact information page 
	
Scenario: verify with max length 
	Given I am on the personal information page of CT-Loan 
	When I enter first name "aaaaaaaaaaaaaaaaaaaaaaaaaaaaa" 
	And I enter middle name "ccccccccccccccccccccccccccccccccccc" 
	And I enter last name "bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb" 
	And I select male 
	And I enter date of birth "12/12/2000" 
	And I enter personal file id "123456789" 
	And I click the next button 
	Then I should be able to see contact information page 
	
