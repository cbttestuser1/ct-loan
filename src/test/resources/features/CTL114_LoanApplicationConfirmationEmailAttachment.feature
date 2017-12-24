Feature: Loan Application Confirmation E-mail Attachement 

@Sprint3
Scenario Outline: Verifying personal information on database
	Given I am on the CT Loan application
	And enter valid personal, contact, employment and financial information by sending "<fName>" "<mName>" "<lName>" "<dob>" "<gender>" "<personalId>"
	When I submit the form
	Then Then I should get an email with an attachment
	
	Examples:
	| fName  | mName | lName    | dob         | gender | personalId |
	| Cyber6 | Peka  | Zulfuqar | 01/08/1975  | m      | 613348667  |
	