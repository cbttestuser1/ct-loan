@CTL-52 
Feature: Test Personal Information fields Length/size 


Scenario: Uncorrect first name_1 
	Create and automateTest scenarios for the following fields in order to test field max and min length: 

	Given User on the CTL homePage 
	When user pass uncorrect firstName
	And user pass creadantial "middle name" 
	And user pass creadantial "last name" 
	And user select gender radio button 
	And user select "Date of Birth" 
	And user pass "Personall File ID" 
	And user click next page button 
	Then user should get error message 
	
	
	
	
		