@CTeckLoan37
Feature:  Test Employment Information mandatory fields

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
		
	Scenario Outline: Testing Title field	
	And the user selects field Department "<department>"
    And the user selects field Duration of Employment "<duration>"
	And the user selects field purpose of Loan of "<purpose_of_loan>"
    And the user selects field Supervisor "<supervisor>"
	And the user clicks on the next button
	Then Error message under Title box should be displayed "Select any choice for this field."
	
Examples:
     |title    |department  |duration   |purpose_of_loan|supervisor        |
  	 |         |Development |  5-10     | Education     | Wiiliam Cranstone|

	
Scenario Outline: Testing Department field	
	And the user select field Title "<title>" 
    And the user selects field Duration of Employment "<duration>"
	And the user selects field purpose of Loan of "<purpose_of_loan>"
    And the user selects field Supervisor "<supervisor>"
	And the user clicks on the next button
	Then Error message under Department box should be displayed "Select any choice for this field."
	
Examples:
     |title    |department  |duration   |purpose_of_loan|supervisor        |
	 |    QA   |            |  5-10     | Education     | Wiiliam Cranstone|
	
Scenario Outline: Testing Duration field	
	And the user select field Title "<title>" 
	And the user selects field Department "<department>"
  	And the user selects field purpose of Loan of "<purpose_of_loan>"
    And the user selects field Supervisor "<supervisor>"
	And the user clicks on the next button
	Then Error message under Duration box should be displayed "Select any choice for this field."
	
Examples:
    |title    |department  |duration   |purpose_of_loan|supervisor        |
	|    QA   |Development |           | Education     | Wiiliam Cranstone|
	
	Scenario Outline: Testing Purpose_of_loan field	
	And the user select field Title "<title>" 
	And the user selects field Department "<department>"
    And the user selects field Duration of Employment "<duration>"
    And the user selects field Supervisor "<supervisor>"
	And the user clicks on the next button
	Then Error message under Purpose box should be displayed "Select any choice for this field."
	
Examples:
     |title    |department  |duration   |purpose_of_loan|supervisor        |
	 |    QA   |Development |  5-10     |               | Wiiliam Cranstone|

	
	
	Scenario Outline: Testing Supervisor field	
	And the user select field Title "<title>" 
	And the user selects field Department "<department>"
    And the user selects field Duration of Employment "<duration>"
	And the user selects field purpose of Loan of "<purpose_of_loan>"
  	And the user clicks on the next button
	Then Error message under Supervisor box should be displayed "Select any choice for this field."
		
Examples:
    |title    |department  |duration   |purpose_of_loan|supervisor        |
	|    QA   |Development |  5-10     | Education     |                  |
	
	Scenario Outline: Selectng all mandatory fields
	And the user select field Title "<title>" 
	And the user selects field Department "<department>"
    And the user selects field Duration of Employment "<duration>"
	And the user selects field purpose of Loan of "<purpose_of_loan>"
    And the user selects field Supervisor "<supervisor>"
	And the user clicks on the next button
	Then the financial information shud be display
	
Examples:
    |title    |department  |duration   |purpose_of_loan|supervisor        |
	|    QA   |Development |  5-10     | Education     | Wiiliam Cranstone|
	

	