@NegativeAndPostivieTesting
Feature: personal information form


Background:
		Given the customer is on the personal information form
	


#@PositiveTesting
Scenario Outline: Customer fills out the personal information form for valid credentials
	And the customer enters "<firstName>" "<middleName>" "<lastName>" "<dateOfBirth>" "<personalFileID>"
	And the customer selects the gender
	And the customer clicks on the next button
	
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
	
	
	
#@NegativeTesting
Scenario Outline: Customer fills out the personal information form for invalid credentials
	And the customer enters "<firstName>" "<middleName>" "<lastName>" "<dateOfBirth>" "<personalFileID>"
	And the customer clicks on the next button
	
	Examples:
	|firstName		|middleName		|lastName		|dateOfBirth		|personalFileID		|
	|				|Regular			|Doe				|12/20/2001		|123456789			|
	|John 			|Regular			|				|12/20/2001		|123456789			|
	|John 			|Regular			|Doe				|12/  /2001		|123456789			|
	|John 			|Regular			|Doe				|13/20/2001		|123456789			|
	|John 			|Regular			|Doe				|  /20/2001		|123456789			|
	|John 			|Regular			|Doe				|12/32/2001		|123456789			|
	|John 			|Regular			|Doe				|12/20/			|123456789			|
	|John 			|Regular			|Doe				|12/21/2001		|123456789			|
	|John 			|Regular			|Doe				|0/20/2001		|123456789			|
	|John 			|Regular			|Doe				|12/0/2001		|123456789			|
	|John 			|Regular			|Doe				|12/20/0			|123456789			|
	|John 			|Regular			|Doe				|-12/20/2001		|123456789			|
	|John 			|Regular			|Doe				|12/-20/2001		|123456789			|
	|John 			|Regular			|Doe				|12/20/-2001		|123456789			|
	|John 			|Regular			|Doe				|123/20/2001		|123456789			|
	|John 			|Regular			|Doe				|12/203/2001		|123456789			|
	|John 			|Regular			|Doe				|12/20/20015		|123456789			|
	|John 			|Regular			|Doe				|12/01/2000		|123456789			|
	|John 			|Regular			|Doe				|12/31/1899		|123456789			|
	|John 			|Regular			|Doe				|12/20/2001		|1234567890			|
	|John 			|Regular			|Doe				|12/20/2001		|123456789&			|
	|John 			|Regular			|Doe				|12/20/2001		|123456789+			|
	|John 			|Regular			|Doe				|12/20/2001		|123456789,			|
	|John 			|Regular			|Doe				|12/20/2001		|123456789[			|
	|John/ 			|Regular			|Doe				|12/20/2001		|123456789			|
	|John* 			|Regular			|Doe				|12/20/2001		|123456789			|
	|John- 			|Regular			|Doe				|12/20/2001		|123456789			|
	|John+ 			|Regular			|Doe				|12/20/2001		|123456789			|
	|John2 			|Regular			|Doe				|12/20/2001		|123456789			|
	|John3 			|Regular			|Doe				|12/20/2001		|123456789			|
	|John, 			|Regular			|Doe				|12/20/2001		|123456789			|
	|John@ 			|Regular			|Doe				|12/20/2001		|123456789			|
	|John& 			|Regular			|Doe				|12/20/2001		|123456789			|
	|John} 			|Regular			|Doe				|12/20/2001		|123456789			|
	|John]			|Regular			|Doe				|12/20/2001		|123456789			|
	
	