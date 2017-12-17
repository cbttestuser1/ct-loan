Feature: CT Loan Employment Drop Down Test

@homepage
Scenario: navigating to the Employment field homepage
 	Given the user is on CT Loan personal information homepage
 	And I enter the first name "John"
 	And I enter the middle name "A"
 	And I enter the last name "Smith"
 	And I selected a gender "Male"
 	And I entered a date of birth "12/15/1980"
 	And I entered a personal file ID "128549988"
 	And I clicked the next button
 	Then the contact information page should appear
 	
 	Given the user should be on the contact information page
 	And I enter the address "7625 AppleHill Ave Derwood MD 20899"
 	And I enter the personal phone number "3011237896"
 	And I enter the work number "3013216987"
 	And I enter the extension "12"
 	And I enter the personal email "JohnSmith@gmail.com"
 	And I enter the work email "JSmith@cybertek.com"
 	And I clicked the next button
 	Then The employment information page should appear
 	
 	Given the user should be on the employment information page
 	And I enter the title
 	