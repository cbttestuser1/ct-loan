Feature: Saving personal info to person table

@NewTest	
Scenario Outline: Verifying personal information on database
	Given I am on the CT Loan application
	And enter valid personal, contact, employment and financial information by sending "<fName>" "<mName>" "<lName>" "<dob>" "<gender>" "<personalId>"
	When I submit the form
	Then the personal information should be saved in person table "<fName>" "<mName>" "<lName>" "<dob>" "<gender>" "<personalId>"
	
	Examples:
	| fName  | mName | lName    | dob         | gender | personalId |
	| Brad14  | Peka  | Zulfuqar | 01/08/1975 | m      | 619834681 |
	
	
	#Scenario: Verifying personal information on database
#	Given I am on the CT Loan application
#	And enter valid personal, contact, employment and financial information by sending "Aydin" "Peka" "Zulfuqar" "12/30/1999" "m" "123456789"
#	When I submit the form
#	Then the personal information should be saved in person table "Aydin" "Peka" "Zulfuqar" "12/30/1999" "m" "619834675"
#	