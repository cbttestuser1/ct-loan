@CteckLoan40
Feature: Test Employment Information fields content

Background:
#==== here Adam's code for firts page CTL-31 =============

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
	
#============Darya code	for second page===========
	Scenario:
	
And the user enters acceptable streetAddress "1723 Seminary rd apt 135"
And the user enters  addressLinetwo "507 Emma str"
And the user enters  city "Alexandria"
And the user enters  state "VA"
And the user enters country "United States"
And the user enters  zipCode "22315"
And the user enters  personalPhonePartOne "843"
And the user enters  personalPhonePartTwo "297"
And the user enters  personalPhonePartthree "4523"
And the user enters  workPhonePartOne "703"
And the user enters  workPhonePartTwo "546"
And the user enters  workPhonePartThree "5412"
And the user enters  extension "567"
And the user enters  workEmail "user1@mail.com"
And the user enters  personalEmail "user2@gmail.com"
And the user click on the next button 
Then the employment information should be displayed "Employment Information"
	
	
	
#=== here is  my code starts==============
		
  Scenario: Test Employment Information fields content
  Then user should select Title dropdown box and check all fiels are in alphabetical order
  Then user should select Department dropdown box and check all fiels are in alphabetical order
  Then user should select Duration of Employment dropdown box and check all fiels are in ascending order
  Then user should select Purpose of Loan dropdown box and check all fiels are in alphabetical order
  Then user should select Supervisor  dropdown box and check all fiels are in alphabetical order