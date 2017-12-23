Feature: Verify User Information 
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