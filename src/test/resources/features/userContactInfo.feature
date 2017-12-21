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
	# Verify Contract TITLE SHOULD BE VISIBLE ON THE TOP OF THE PAGE