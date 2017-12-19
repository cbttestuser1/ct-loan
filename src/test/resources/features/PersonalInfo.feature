Feature: Personal Information Boundry Test

@BoundryTest
Scenario: Boundry Test
Given I go to CT-Loan web page
When I enter First Name and Last Name
Then I should verify it is not null 
