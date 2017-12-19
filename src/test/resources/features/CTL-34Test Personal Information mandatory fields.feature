@CTL-34
Feature: Test Personal Information mandatory fields

Background:
		  Given User is on homepage 
					
Scenario Outline: AutomateTest scenarios for the firstName mandatory field
	
	And users adds "<firstName>","<Middle Initial>","<lastName>"
	And user picks a Gender
	And user enters date of birth "<MM/DD/YYYY>"
	And user enters SSN/Personal File ID "<0123456789>" 
	And user should click on Next button
	Then user must see firstName Error message.
	
	Examples: 
	| firstName	| Middle Initial	| lastName    | MM/DD/YYYY |  0123456789 |
	|			| S					|Smith		  |02/12/1989  | 123456789	 |
	
Scenario Outline: Test scenario for the lastName mandatory field
	
	And users adds "<firstName>","<Middle Initial>","<lastName>"
	And user picks a Gender
	And user enters date of birth "<MM/DD/YYYY>"
	And user enters SSN/Personal File ID "<0123456789>" 
	And user should click on Next button
	Then user must see lastName Error message.
	
	Examples: 
	| firstName		| Middle Initial	| lastName    | MM/DD/YYYY |  0123456789 |
	|John			| S					|			  |02/12/1989  | 123456789	 |
	


	
Scenario Outline: Test scenario for the Date of Birth mandatory field

	And users adds "<firstName>","<Middle Initial>","<lastName>"
	And user picks a Gender
	And user enters date of birth "<MM/DD/YYYY>"
	And user enters SSN/Personal File ID "<0123456789>" 
	And user should click on Next button
	Then user need to see birthDate error message
	
	Examples: 
	| firstName	| Middle Initial	| lastName    | MM/DD/YYYY |  0123456789 |
	|	John	| S					|Smith		  |     	   | 123456789	 |
	
	
Scenario Outline: Test scenario for the Gender mandatory field

	And users adds "<firstName>","<Middle Initial>","<lastName>"
	And user enters date of birth "<MM/DD/YYYY>"
	And user enters SSN/Personal File ID "<0123456789>" 
	And user should click on Next button
	Then user need to see gender error message
	
	Examples: 
	| firstName	| Middle Initial	| lastName    | MM/DD/YYYY |  0123456789 |
	|	John	| S					|Smith		  | 13/11/1967 | 123456789	 |


Scenario Outline: Test scenarios for the SSN mandatory field

	And users adds "<firstName>","<Middle Initial>","<lastName>"
	And user picks a Gender
	And user enters date of birth "<MM/DD/YYYY>" 
	And user should click on Next button
	Then user need to see Personal File ID error message
	
	Examples: 
	| firstName	| Middle Initial	| lastName    | MM/DD/YYYY |  0123456789 |
	|	Beilul	| 					| 	Samsung	  |02/12/1989  | 			 |
	