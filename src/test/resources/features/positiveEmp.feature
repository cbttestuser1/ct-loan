Feature: Create and automateTest scenarios for the following fields in order to test mandatory/optional fields
@positiveEmp
Scenario:
Given Employee page
And get the page Title 
Then choose Department
And choose Time of Empoyment
Then choose Loan Type
And choose Supervisor Contact Info
#Test corresponding errors - refer to req documentation
#Positive scenario