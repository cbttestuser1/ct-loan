Feature: personal information form

@Regression
Scenario Outline: Customer fills out the personal information form
	Given the customer is on the personal information form
	And the customer enters "<firstName>" "<middleName>" "<lastName>" "<dateOfBirth>" "<personalFileID>"
	And the customer selects the gender
	
	Examples:
	|firstName		|middleName		|lastName		|dateOfBirth		|personalFileID		|
	|John 			|N/A				|Doe				|12/20/1999		|123456789			|
	
	