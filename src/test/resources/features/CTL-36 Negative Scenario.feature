Feature: Employment Information Mandatory Fields Left Blank

Scenario: User leaves some mandatory field empty 

Given User leaves some drop down field empty 
When User submit form with valid data in all other fields 
Then page thows error message for the empty field 
And User ends up on the same page 