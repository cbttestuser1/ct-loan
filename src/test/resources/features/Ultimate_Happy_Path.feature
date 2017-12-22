@page1 
Feature:  In order to apply to CT loan User will enter personal information in this page 

Scenario Outline: User will enter personal information 
	Given as User is on CTLoan home page 
	And User select gender as gender
	When User enter name as "<name>" "<middle_name>" "<lastname>" "<dob>" "<ssn>" 
	And User click to next
	
	Examples: 
	
		| name | middle_name 	| lastname 	| gender 	| dob 			| ssn |
		| Emma | Watson 		| Douglas 	| M 		| 12/23/1980 	| 876567439 |
		
		
Scenario Outline: User will enter contact information 
	Given User enter address "<address>", "<address1>" "<city>" "<state>" "<zipcode>" "<country>" "<ppnumber>" "<wpnumber>" "<extantion>" "<personal_email>"  "<work_email>" 
	And User click next  
 
	
	Examples: 
		| address 		  | address1 | city | state | zipcode | country       | ppnumber     | wpnumber     | extantion | personal_email 		| work_email |
		| 123 Main street | apt 15   | Main | Maine | 22450   | United States | 234-678-4394 | 534-261-4975 | 23745     | anypersonal@mail.com  | anywork@mail.com |
		
		
		
Scenario Outline: User will enter employment information 
	Given as User select title "<title>" "<department>"  "<doe>" "<pol>" "<supervisor>" 
	And User click next button 

	
	Examples: 
		| title | department  | doe | pol       | supervisor |
		| QA 	| Development | 3-5 | Education | Zachary Taylor |	
		
Scenario Outline: User will enter financial information 
	Given as User select option "<app_option>" "<annual_income>"  "<income_type>" "<house_option>"  "<spend_option>" "<dep_count>" "<count_of_savings>" "<term_option>"
	And User clicks on agreement checkbox 
	And User enters "<full_name>" "<date>"
	And User click submit 
	Then CTLoan should contain text loan application ID 
	
	Examples: 
		| app_option | annual_income   | income_type | house_option | spend_option | dep_count | count_of_savings | term_option    | full_name 	| date |  
		| YES 		  | 120000 			| Yearly 	  | Rent 		 | 3000 		| 4         | 2                | 18 months 		| Jack Douglas  | 12/20/2017 |