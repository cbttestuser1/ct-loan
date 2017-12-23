@CTeckLoan-118 
Feature: Loan Application confirmation email 

Background:
	Given User is on homepage 
	And users adds "zami", "Z", "Giuly" 
	And user picks a Gender 
	And user enters date of birth "10/20/1991" 
	And user enters SSN/Personal File ID "987654321" 
	And user should select on Next button 
	And the user enters acceptable streetAddress "13624 Bent Tree cir #202" 
	And the user enters  addressLinetwo "5367 Crimson sky ct" 
	And the user enters  city "Centreville" 
	And the user enters  state "VA" 
	And the user enters country "United States" 
	And the user enters  zipCode "20121" 
	And the user enters  personalPhonePartOne "202" 
	And the user enters  personalPhonePartTwo "234" 
	And the user enters  personalPhonePartthree "4444" 
	And the user enters  workPhonePartOne "202" 
	And the user enters  workPhonePartTwo "423" 
	And the user enters  workPhonePartThree "3333" 
	And the user enters  extension "98765" 
	And the user enters  workEmail "husseinademlena990@gmail.com" 
	And the user enters  personalEmail "husseinademlena990@gmail.com" 
	Then the user click on the next button  
	And the user select field Title "Manager" 
	And the user selects field Department "HR"
    And the user selects field Duration of Employment "3-5"
	And the user selects field purpose of Loan of "Education"
    And the user selects field Supervisor "William Cranston"
	And the user clicks on the next button 
	
	Scenario:
		And the user pick is it the first application to CTLoan "Yes"
		And the user select how many application you submited "0"
		And the user select the annual income "90000"
		And the user select the income type "Yearly"
		And the user select to rent a house "Rent"
		And the user select Monthly rent "2000"
		And the user select Number of dependents "3"
		And the user select Savings amount "50000"
		And the user select Loan term "36 months"
		And the user select the checkbox to confirm all the info
	    And the user enter full name to submit application "zami Z Giuly"
	    And the user enter Single Line "Chase-Bank"
	    And the user the Date "12/12/2017"
		And the user on the submit button 
		Then I should get an email confirming my application