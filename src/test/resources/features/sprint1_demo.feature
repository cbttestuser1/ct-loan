@CTL-Demo
Feature:  Test of the CT Loan Application.

Background:

	Given User is on homepage
	And users adds "Beilul", "J", "Samsung"
	And user picks a Gender
	And user enters date of birth "12/24/2017"
	And user enters SSN/Personal File ID "0123456789" 
	And user should click on Next button
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
	Then the user click on the next button  
	
	
Scenario Outline: Selectng all mandatory fields
	And the user select field Title "<title>" 
	And the user selects field Department "<department>"
    And the user selects field Duration of Employment "<duration>"
	And the user selects field purpose of Loan of "<purpose_of_loan>"
    And the user selects field Supervisor "<supervisor>"
	And the user clicks on the next button
	Then the financial information shud be display
	
Examples:
    |title    |department  | duration  | purpose_of_loan |supervisor        |
	|    QA   |Development |  5-10     | Education       | Zachary Taylor   |
	
	
