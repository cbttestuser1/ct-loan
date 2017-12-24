Feature: Saving personal info to person table

@Sprint3
Scenario Outline: Verifying personal information on database
	Given I am on the CT Loan application
	And enter valid personal, contact, employment and financial information by sending "<fName>" "<mName>" "<lName>" "<dob>" "<gender>" "<personalId>"
	When I submit the form
	Then the personal information should be saved in person table "<fName>" "<mName>" "<lName>" "<dob>" "<gender>" "<personalId>"
	
	Examples:
	| fName  | mName | lName    | dob         | gender | personalId |
	| Cyber7  | Peka  | Zulfuqar | 01/08/1975  | m      | 619837968  |
	
