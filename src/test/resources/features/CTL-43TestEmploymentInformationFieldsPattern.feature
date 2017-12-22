@CTeckLoan-43 
Feature: Test Contact Information fields pattern(acceptable data type) 
Background: 
	Given  user on the homepage of CT-Loan 
Scenario Outline: 
	And  users adds "<Street Address>","<Address Line2>","<City>","<State>","<Zip Code>" 
	And  user picks a Country 
	And  user enters Personal Phone Number "<###-###-####>" 
	And  user enters Work Phone Number "<###-###-####>" 
	And  user enters Extension "<#####>" 
	And  user enters Personal Email "<Personal Email>" 
	And  user enters Work Email "<Work Email>" 
	And user should click on Next button 
	Then user need to assert that he is in Employment Information Page 
	
	Examples: 
		|Street Address|Address Line 2|City   |State|Zip Code|Country      |PPNumber  |WPNumber  |Ext. |PEmail        |WEmail           |
		|@@#@! Crimson  |Apt203       |Fairfax|VA   |20120   |United States|2023455566|2023333456|22222|mark@gmail.com|mark@cybertek.com|
		

		Scenario Outline: 
	And  users adds "<Street Address>","<Address Line2>","<City>","<State>","<Zip Code>" 
	And  user picks a Country 
	And  user enters Personal Phone Number "<###-###-####>" 
	And  user enters Work Phone Number "<###-###-####>" 
	And  user enters Extension "<#####>" 
	And  user enters Personal Email "<Personal Email>" 
	And  user enters Work Email "<Work Email>" 
	And user should click on Next button 
	Then user need to assert that he is in Employment Information Page 
	
	Examples: 
		|Street Address|Address Line 2|City   |State|Zip Code|Country      |PPNumber  |WPNumber  |Ext. |PEmail        |WEmail           |
		|5367 Crimson  |              |Fairfax|VA   |20120   |United States|2023455566|2023333456|22222|mark@gmail.com|mark@cybertek.com|
		
		