Feature: Test Personal Information mandatory fields 


@CTL_33
Scenario:
Create and automateTest scenarios for the following fields in order to test mandatory/optional fields: 

	#test1
	Given the user is on the personal information page
	When the user does not fill in the fields marked with an *
	And the user scrolls down
	And clicks on the submit button
	Then the user should see an error message to enter a value for those fields