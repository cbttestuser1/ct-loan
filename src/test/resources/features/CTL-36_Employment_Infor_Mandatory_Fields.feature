Feature: Employment Information mandatory fields

Scenario: Submit valid data

	Given User submits from with all drop down options selected 
	Then User should be able to navigate to the next page 
	
#Scenario: Submit invalid data 
#
#	Given User submits form with all mandatory fields empty 
#	When User should end up on the same page 
#	And page throws error message for the empty fields 
	
#Scenario: User leaves first mandatory field empty 
#
#	Given User leaves first drop down field empty 
#	When User submit form with valid data in all other fields 
#	Then page thows error message for the empty field 
#	And User ends up on the same page 
#	
#Scenario: User leaves second mandatory field empty 
#
#	Given User leaves second drop down field empty 
#	When User submit form with valid data in all other fields 
#	Then page thows error message for the empty field 
#	And User ends up on the same page 
#	
#Scenario: User leaves third mandatory field empty 
#
#	Given User leaves third drop down field empty 
#	When User submit form with valid data in all other fields 
#	Then page thows error message for the empty field 
#	And User ends up on the same page 
#	
#Scenario: User leaves fourth mandatory field empty 
#
#	Given User leaves fourth drop down field empty 
#	When User submit form with valid data in all other fields 
#	Then page thows error message for the empty field 
#	And User ends up on the same page 
#	
#Scenario: User leaves fifth mandatory field empty 
#
#	Given User leaves fifth drop down field empty 
#	When User submit form with valid data in all other fields 
#	Then page thows error message for the empty field 
#	And User ends up on the same page 