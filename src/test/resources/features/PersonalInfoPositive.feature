Feature: Positive test 
@positiveInfoTest 
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
	
	