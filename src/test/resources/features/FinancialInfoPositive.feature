@financialInfoPos
Feature: Financial Information Page verification

Scenario: Positive Financial
Given The user should be in financial information page
When The user should choose Ct Loan "no"
And The user should fill annual income
And The user should choose income type
And The user should choose house own or rent
And The user should fill spent in one month
And The user should fill number of dependents
But The user should fill savings
When The user choose the desired loan term
And The user should check confirm box
And The user should enter full name to submit application
And the user should type date
Then the user should click submit on finanpage
Then assert thank you message is displayed

#change in dilekkkkkkkk