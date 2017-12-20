@CTeckLoan-43 
Feature: Test Contact Information negative 
Background: 
	Given  I am on the home page of CT-Loan 
Scenario: Testing Address field 
	When user add his Address in CT-Loan having special characters 
		|Street Address           |Address Line 2     |City       |State/Region/Province|Postal/Zip Code|Country      |
		|5367 Crimson sky ct@@#@##|5367 crimson sky ct|Centreville|VA                   |20120          |United States|
	And user click on the next page 
	Then user should see the error pop up 
	
Scenario: Testing Address Line 2 field 
	When user add his Address Line 2 in CT-Loan having special characters 
		|Street Address     |Address Line 2                  |City       |State/Region/Province|Postal/Zip Code|Country      |
		|5367 Crimson sky ct|5367 Crimson sky ct@@#@!$^&*^%#@|Centreville|VA                   |20120          |United States|
		
	Then user should see the error pop up 
	
	
Scenario: Testing City field 
	When user add his City in CT-Loan having special characters 
		|Street Address     |Address Line 2     |City              |State/Region/Province|Postal/Zip Code|Country      |
		|5367 Crimson sky ct|5367 Crimson sky ct|CENTREVILLEeeeee@#|VA                   |20120          |United States|
		
		
	Then user should see the error pop up 
	
Scenario: Testing City field 
	When user add his City in CT-Loan having type String 
		|Street Address     |Address Line 2     |City              |State/Region/Province|Postal/Zip Code|Country      |
		|5367 Crimson sky ct|5367 Crimson sky ct|CENTREVILLEeeeee@#|323232               |20120          |United States|
	And user click on the next page 
	Then user should see the error pop up 
	
Scenario: Testing Zip Code field 
	When user add his Zip Code in CT-Loan having type Integer 
		|Street Address     |Address Line 2     |City              |State/Region/Province|Postal/Zip Code|Country      |
		|5367 Crimson sky ct|5367 Crimson sky ct|CENTREVILLEeeeee@#|323232               |ABCDE         |United States|
	And user click on the next page 
	Then user should see the error pop up 
