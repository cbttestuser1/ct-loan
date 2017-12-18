Feature: Test Employment Information fields pattern 


@PersonalInfoPositive
Scenario: navigating to the Employment field homepage
 	Given the user is on CT Loan personal information homepage
 	And I enter the valid first name "John"
 	And I enter the valid middle name "A"
 	And I enter the valid last name "Smith"
 	And I selected a gender "Male"
 	And I entered a valid date of birth "12/15/1980"
 	And I entered a valid  personal file ID "128549988"
 	And I clicked the next button
 	Then the contact information page should appears
 	
@PersonalInfoNegative1
 	Scenario: navigating to the Employment field homepage
 	Given the user is on CT Loan personal information homepage
 	And I enter the invalid first name " "
 	And I enter the valid middle name "A"
 	And I enter the valid last name "Smith"
 	And I selected a valid gender "Male"
 	And I entered a valid date of birth "12/15/1980"
 	And I entered a personal file ID "128549988"
 	And I clicked the next button
 	Then the contact information page should appears
 	
 	@PersonalInfoNegative2
 	Scenario: navigating to the Employment field homepage
 	Given the user is on CT Loan personal information homepage
 	And I enter the invalid first name "qwertyuiopasdfghjklzxcvbnmlkjhgfdsaqwer"
 	And I enter the valid middle name "A"
 	And I enter the valid last name "Smith"
 	And I selected a valid gender "Male"
 	And I entered a valid date of birth "12/15/1980"
 	And I entered a personal file ID "128549988"
 	And I clicked the next button
 	Then the contact information page should appears
 	
 	@PersonalInfoNegative3
 	Scenario: navigating to the Employment field homepage
 	Given the user is on CT Loan personal information homepage
 	And I enter the invalid first name "234567"
 	And I enter the valid middle name "A"
 	And I enter the valid last name "Smith"
 	And I selected a valid gender "Male"
 	And I entered a valid date of birth "12/15/1980"
 	And I entered a personal file ID "128549988"
 	And I clicked the next button
 	Then the contact information page should appears
 	
 	@PersonalInfoNegative4
 	Scenario: navigating to the Employment field homepage
 	Given the user is on CT Loan personal information homepage
 	And I enter the valid first name "John"
 	And I enter the invalid middle name "152"
 	And I enter the valid last name "Smith"
 	And I selected a valid gender "Male"
 	And I entered a valid date of birth "12/15/1980"
 	And I entered a personal file ID "128549988"
 	And I clicked the next button
 	Then the contact information page should appears
 	
 	@PersonalInfoNegative5
 	Scenario: navigating to the Employment field homepage
 	Given the user is on CT Loan personal information homepage
 	And I enter the valid first name "John"
 	And I enter the valid middle name "A"
 	And I enter the invalid last name "54678"
 	And I selected a valid gender "Male"
 	And I entered a valid date of birth "12/15/1980"
 	And I entered a personal file ID "128549988"
 	And I clicked the next button
 	Then the contact information page should appears
 	
 	@PersonalInfoNegative5
 	Scenario: navigating to the Employment field homepage
 	Given the user is on CT Loan personal information homepage
 	And I enter the valid first name "John"
 	And I enter the valid middle name "A"
 	And I enter the invalid last name " "
 	And I selected a valid gender "Male"
 	And I entered a valid date of birth "12/15/1980"
 	And I entered a personal file ID "128549988"
 	And I clicked the next button
 	Then the contact information page should appears
 	
 	@PersonalInfoNegative6
 	Scenario: navigating to the Employment field homepage
 	Given the user is on CT Loan personal information homepage
 	And I enter the valid first name "John"
 	And I enter the valid middle name "A"
 	And I enter the invalid last name "qwertyuiopasdfghjklzxcvbnmlkjhgfdsaqwer"
 	And I selected a valid gender "Male"
 	And I entered a valid date of birth "12/15/1980"
 	And I entered a personal file ID "128549988"
 	And I clicked the next button
 	Then the contact information page should appears
 	
 	@PersonalInfoNegative7
 	Scenario: navigating to the Employment field homepage
 	Given the user is on CT Loan personal information homepage
 	And I enter the valid first name "John"
 	And I enter the valid middle name "A"
 	And I enter the valid last name "Smith"
 	And I selected a gender "Male"
 	And I entered a invalid date of birth "01/15/2019"
 	And I entered a valid  personal file ID "128549988"
 	And I clicked the next button
 	Then the contact information page should appears
 	
 	@PersonalInfoNegative8
 	Scenario: navigating to the Employment field homepage
 	Given the user is on CT Loan personal information homepage
 	And I enter the valid first name "John"
 	And I enter the valid middle name "A"
 	And I enter the valid last name "Smith"
 	And I selected a gender "Male"
 	And I entered a invalid date of birth " "
 	And I entered a valid  personal file ID "128549988"
 	And I clicked the next button
 	Then the contact information page should appears
 	
 	@PersonalInfoNegative9
 	Scenario: navigating to the Employment field homepage
 	Given the user is on CT Loan personal information homepage
 	And I enter the valid first name "John"
 	And I enter the valid middle name "A"
 	And I enter the valid last name "Smith"
 	And I selected a gender "Male"
 	And I entered a invalid date of birth "12/15/1980"
 	And I entered a valid  personal file ID "128549988"
 	And I clicked the next button
 	Then the contact information page should appears
 	
 	@PersonalInfoNegative11
 	Scenario: navigating to the Employment field homepage
 	Given the user is on CT Loan personal information homepage
 	And I enter the valid first name "John"
 	And I enter the valid middle name "A"
 	And I enter the valid last name "Smith"
 	And I selected a gender "Male"
 	And I entered a valid date of birth "12/15/1980"
 	And I entered a invalid  personal file ID "12 854 99 88"
 	And I clicked the next button
 	Then the contact information page should appears
 	
 	@PersonalInfoNegative12
 	Scenario: navigating to the Employment field homepage
 	Given the user is on CT Loan personal information homepage
 	And I enter the valid first name "John"
 	And I enter the valid middle name "A"
 	And I enter the valid last name "Smith"
 	And I selected a gender "Male"
 	And I entered a valid date of birth "12/15/1980"
 	And I entered a invalid  personal file ID "Smith"
 	And I clicked the next button
 	Then the contact information page should appears
 	
 	