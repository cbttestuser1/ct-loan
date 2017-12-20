@CTL-31	
Feature: 1 Test Personal Information fields pattern(acceptable data type)  

Background:
			Given User is on homepage

Scenario Outline: 
	And users adds "<firstName>","<Middle Initial>","<lastName>"
	And user picks a Gender
	And user enters date of birth "<MM/DD/YYYY>"
	And user enters SSN/Personal File ID "<0123456789>" 
	And user should click on Next button
	Then user need to assert that he is in Contact Information Page
	
	Examples: 
	| firstName	| Middle Initial	| lastName    | MM/DD/YYYY |  0123456789 |
	|	Beilul	| 			J		| 	Samsung	  | 12/24/1974 |   123456789 |
	
	
Scenario Outline: 
	And users adds "<firstName>","<Middle Initial>","<lastName>"
	And user picks a Gender
	And user enters date of birth "<MM/DD/YYYY>"
	And user enters SSN/Personal File ID "<0123456789>" 
	And user should click on Next button
	Then user need to assert that he is in Contact Information Page
	
	Examples: 
	| firstName	| Middle Initial	| lastName    | MM/DD/YYYY |  0123456789 |
	|	Beilul	| 					| 	Samsung	  | 01/01/1974 |   567891234 |
	