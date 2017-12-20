@personalInfoTest 
Feature: Test Personal Information fields Length/size 

Scenario: 
	Given User navigates to the following url: "http://cybertekschool.com/ctl.qa" 
	And User enters Date of Birth 
	Then Verify field size for MM max 2 digits, can accept number between 1-12; If one digit, add zero to front 
	And Field size for DD: max 2 digits; Can accept number between 1-31, depends on month; If one digit, add zero to front; 
	And Field size YYYY: max 4 digits; Can accept number between 1900 and (current date minus 16 years); 
	And User enters SSN/Personal File ID 
	Then Verify do not accept any other characters other than digits 0-9; Cannot be null; Cannot contain any spaces. 
	
	#Notes: Test corresponding errors - refer to attached req documentation
	#Boundary value analysis: 1 positive and 1 negative scenario