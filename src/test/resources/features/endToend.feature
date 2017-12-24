@endToEnd
Feature: End to end Ct loan

Scenario Outline: personal info
Given User navigates to the following url: http://cybertekschool.com/ctl.qa 
When User enters firstName as pos <firstName> and lastName <lastName>
And User selects gender pos <gender>
And User enters date pos <Date>
And Userenters ssn pos <SSN>
And Click to next button
	
	Examples: 
		|firstName		|lastName  	    |gender		|Date			| SSN	  	   |
		|	"ellena"		|"smitha"	    |"F"		| "02/11/1990"	| "123456789"  |
	
		
Scenario Outline:Contact information
Given I am on the contactPage
When I fill addressline1 <Address>
And I fill city <city>
And I fill State <state>
And I fill ZipCode <zipcode>
And I select country <country>
And I enter personal phone number<phonenumber>
And I enter personal email <persEmail>
And I enter work email <workEmail>
Then I click next button in contactpage

Examples: 
	|adddress		|city 		|state	|zipcode	| country	  	   |phonenumber |persEmail       |workEmail         |
	|	"blueberry "|"newyork"	|"NJ"	| "23564"	| "United States"  |"85758"|"abc@gmail.com" |"fgt@hotmail.com" |
	
Scenario Outline:Employment Information
Given I am on employment page
When I fill title <title>
And I fill department <department>
And I fill duration <duration>
And I fill purposeLoan <purposeLoan>
And I select supervisor <supervisor>
Then I click next button in employmentpage

Examples: 
|title		    |department		     |duration	|purposeLoan| supervisor  	          |
|	"Engineer " |"Development"	     |"3-5"	    | "Education"	| "William Cranston"  |

Scenario: Positive Financial
Given The user should be in financial information page
When The user should choose Ct Loan "no"
And The user should fill annual income
And The user should choose income type
And The user should choose house own or rent
And The user should fill spent in one month
And The user should fill number of dependents
But The user should fill savings
When The user choose the desired loan term
And The user should check confirm box
And The user should enter full name to submit application
And the user should type date
Then the user should click submit on finanpage
Then assert thank you message is displayed