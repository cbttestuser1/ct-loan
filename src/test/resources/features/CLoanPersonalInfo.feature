#@NegativeAndPostivieTesting
Feature: personal information form


Background:
		Given the customer is on the personal information form
	


#@PositiveTesting
Scenario Outline: Customer fills out the personal information form for valid credentials
	And the customer selects the gender
	And the customer enters "<firstName>" "<middleName>" "<lastName>" "<dateOfBirth>" "<personalFileID>"
	
	Examples:
	|firstName		|middleName		|lastName		|dateOfBirth		|personalFileID		|
	|John 			|Regular			|Doe				|12/20/2001		|123456789			|
	|John' 			|Regular			|Doe				|12/20/2001		|123456789			|
	|John-			|Regular			|Doe				|12/20/2001		|123456789			|
	|John 			|Regular'		|Doe				|12/20/2001		|123456789			|
	|John			|Regular	-		|Doe				|12/20/2001		|123456789			|
	|John 			|Regular			|Doe	'			|12/20/2001		|123456789			|
	|John			|Regular			|Doe	-			|12/20/2001		|123456789			|
	|John			|Regular			|Doe	-			|01/20/2000		|123456789			|
	|John			|				|Doe				|01/20/2000		|123456789			|
	
	
	
#@NegativeTesting
Scenario Outline: Customer fills out the personal information form for invalid credentials
	And the customer enters "<firstName>" "<middleName>" "<lastName>" "<dateOfBirth>" "<personalFileID>"
	And the customer clicks on the next button
	
	Examples:
	|firstName		|middleName		|lastName		|dateOfBirth		|personalFileID		|
	|				|				|				|				|					|
	
	