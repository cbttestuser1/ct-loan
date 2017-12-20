@CTeckLoan-46 
Feature: Test Contact Information negative 
Background: 
	Given  I am on the home page of CT-Loan 
Scenario: Testing Address field 
	
	When user add his Address having length less and more than expected 
		|Street Address     |Address Line 2     |City       |State|Zip Code|   Work Phone    |PersonalPhone| Ext.  | EmailWork         |EmailPersonal   |
		|122                |5367 crimson sky ct|Centreville|VA   |20120   |   2027659838    |2025438967   | 444   | Marko@cybertek.com|M.prad@gmail.com|
	And user select the country
	Then user should see the error pop up 
	
Scenario: Testing Address Line 2 field 
	When user add his Address Line 2 having length more than expected 
		|Street Address     |Address Line 2     |City       |State|Zip Code|   Work Phone    |PersonalPhone| Ext.  | EmailWork         |EmailPersonal   |
		|122                |12345678912345567  |Centreville|VA   |20120   |   2027659838    |2025438967   | 444   | Marko@cybertek.com|M.prad@gmail.com|
	And user select the country
	Then user should see the error pop up 
	
	
Scenario: Testing City field 
	When user add his City having special length more than expected 
		|Street Address     |Address Line 2     |City              |State|Zip Code|   Work Phone    |PersonalPhone| Ext.  | EmailWork         |EmailPersonal   |
		|5367 Crimson sky ct|5367 Crimson sky ct|qwqwqwqwqwqwqwqwq |VA   |20120   |   2027659838    |2025438967   | 444   | Marko@cybertek.com|M.prad@gmail.com|
		
		And user select the country
	Then user should see the error pop up 
	
	
	
Scenario: Testing Zip Code field 
	When user add his Zip Code having length less and more than expected 
		|Street Address     |Address Line 2     |City       |State|Zip Code|   Work Phone    |PersonalPhone| Ext.  | EmailWork         |EmailPersonal   |
		|5367 Crimson sky ct|5367 Crimson sky ct|CENTREVILLE|VA   |20120000|   2027659838    |2025438967   | 444   | Marko@cybertek.com|M.prad@gmail.com|
	And user select the country
	Then user should see the error pop up 
	
	
Scenario: Testing Ext. field 
	When user add his Ext. having length less and more than expected 
		|Street Address     |Address Line 2     |City       |State|Zip Code|   Work Phone    |PersonalPhone| Ext.  | EmailWork         |EmailPersonal   |
		|5367 Crimson sky ct|5367 Crimson sky ct|CENTREVILLE|VA   |20120000|   2027659838    |2025438967   | 444444| Marko@cybertek.com|M.prad@gmail.com|
	And user select the country
	Then user should see the error pop up 
	
Scenario: Testing Work Phone and Personal Phone field 
	When user add his Phone number having length more than expected 
		|Street Address     |Address Line 2     |City       |State|Zip Code|   Work Phone    |PersonalPhone| Ext.  | EmailWork                             |EmailPersonal                         |
		|5367 Crimson sky ct|5367 Crimson sky ct|CENTREVILLE|VA   |20120000|   2027659838    |2025438967   | 444444| Marko@cybertek.commmmmmmmmmmmmmmmmmmmm|Marko@cybertek.commmmmmmmmmmmmmmmmmmmm|
	And user select the country
	Then user should see the error pop up 
	
