@Mandatory
Feature: Submit invalid data for Employment Infor Fields

Scenario: Submit invalid data for all fiels 

	Given User submits form with each mandatory fields empty 
	When User should end up on the same page 
	And page throws error message for the empty fields 