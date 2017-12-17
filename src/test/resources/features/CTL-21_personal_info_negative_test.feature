Feature: Test Personal Information negative 
Background: 
	Given I am on the home page of CT-Loan home page 
Scenario: Testing First name field 
	Then User adds personal information data in CTL with first name longer then expected charachters 
		|First Name                                |Last Name|Date of Birth|Personal File ID|
		|Awqwqwqwqwqwqwqwqwqwqwqwqwqwqwqwqwqw	  |	Smith	 |12/08/1994   |   234566980    |
	And I choose gender 
	When I click on 	next button 
	Then I should see the error pop-up 
	
Scenario: Testing Last name field 
	Then User adds personal information data in CTL with last name longer then expected charachters 
		|First Name|Last Name 							 |Date of Birth|Personal File ID|
		|John	   |	Awqwqwqwqwqwqwqwqwqwqwqwqwqwqwqwqwqw	 |12/08/1994   |   234566980    |
	And I choose gender 
	When I click on 	next button 
	Then I should see the error pop-up 
	
Scenario: Testing Last name field 
	Then User adds personal information data in CTL with last name empty 
		|First Name|Last Name |Date of Birth|Personal File ID|
		|John	   |	          |12/08/1994   |   234566980    |
	And I choose gender 
	When I click on 	next button 
	Then I should see the error pop-up 

Scenario: Testing date field 
	Then User adds personal information data in CTL with invalid year 
		|First Name|Last Name |Date of Birth|Personal File ID|
		|John	   |	Smith     |12/08/1894   |   234566980    |
	And I choose gender 
	When I click on 	next button 
	Then I should see the error pop-up 	
	
Scenario: Testing date field 
	Then User adds personal information data in CTL with invalid year 
		|First Name|Last Name |Date of Birth|Personal File ID|
		|John	   |	Smith     |12/08/qw   |   234566980    |
	And I choose gender 
	When I click on 	next button 
	Then I should see the error pop-up 		
	
Scenario: Testing gender 
	Then User adds personal information data in CTL without choosing gender
		|First Name|Last Name |Date of Birth|Personal File ID|
		|John	   |	Smith     |12/08/1993   |   234566980    |
	When I click on 	next button 
	Then I should see the error pop-up 	
	
	Scenario: Testing Personal File ID field 
	Then User adds personal information data in CTL with invalid Personal File ID
		|First Name|Last Name |Date of Birth|Personal File ID|
		|John	   |	Smith     |12/08/1993   |   6980    |
	When I click on 	next button 
	Then I should see the error pop-up 			
	
	