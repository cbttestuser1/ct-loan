@A
Feature: contact info page
This page collects contact info for CT Loan application

Scenario: Collect contact information
Given I navigate to the contact information page of CT Loan application
And I enter test data into an Address Line1 field
And I enter test data into an Address Line2 field
And I enter test data into the City field
And I enter test data into the State field
And I enter test data into the Zipcode field
And I choose a test country name frome a Country dropdown list
And I enter personal phone number in three Personal Phone Number fields
And I enter work phone number into three work phone number fields
And I enter Extension test data into an Extension field
And I enter Personal Email into a Personal Email Field
And I enter Work Email into a Work Email field
When I click on the Next button
Then I should be able to move to the next page
