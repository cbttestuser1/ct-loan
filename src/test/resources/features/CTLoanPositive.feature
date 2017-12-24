@positiveInfoTest 
Feature: Positive test 
Scenario: 

	Given User navigates to the following url: "http://cybertekschool.com/ctl.qa" 
	And Enters First Name and Last Name 
	Then Verify Data type: String characters a-Z 
	And Field type: text box 
	And Accepted special characters (apostrophe, hyphen) 
	And User selects the gender 
	Then Verify field input 2 options, F, M 
	And User enters Date of Birth 
	Then Verify Watermark format is MM/DD/YYYY 
	And Data type: integer 
	And User enters SSN 
	Then Verify Data type integer only 
	And Watermark format "0123456789" . 
	
	
	#Test corresponding errors - refer to req documentation 
	#Please follow Requirement Document 
	#Positive Scenarios
	
	
@contact 
Scenario: 
	Given the user enters the address line one 
	And the user enters address line two 
	And the user enter city 
	And the user enter state 
	And the user enters zipcode 
	And the user enters work phone 
	And the user enters Country 
	And the user enters Extension 
	And the user enters Email 
	And the user enters Personal email 
	
@cantactInfo 
Scenario: 
	Given User is on Contact Information Page 
	And User enters Work Phone number 
	Then Verify the Size:10 digits 
	And User enters Extension 
	Then Verify the Size:5 digits 
	And User enters Email (work) 
	Then Verify Size:10-30 digits 
	And User enters Personal (email) 
	Then Verify Size:10-30 digits 
	But verify one more time  Size:10-30 digits 
	And the user clicks next 
	# Verify Contract TITLE SHOULD BE VISIBLE ON THE TOP OF THE PAGE
	
@positiveEmp 
Scenario: 
	Given get the page Logo 
	Then choose the Title 
	Then choose Department 
	And choose Time of Empoyment 
	Then choose Loan Type 
	And choose Supervisor Contact Info 
	
@financialInfoPos 
Scenario: Positive 
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
	
		@confirmation
Scenario: Confirm Email 
	Given I am on the CT Loan application 
	And enter valid personal, contact, employment and financial information 
	When I submit the form 
	Then I should get an email with an attachment 
	
	
	
	
	
	