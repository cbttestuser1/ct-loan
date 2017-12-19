@CteckLoan40
Feature: Test Employment Information fields content

Background:
  Given User is on the Employment Information Page
  
  Scenario: Test Employment Information fields content
  Then user should select Title dropdown box and check all fiels are in alphabetical order
  Then user should select Department dropdown box and check all fiels are in alphabetical order
  Then user should select Duration of Employment dropdown box and check all fiels are in ascending order
  Then user should select Purpose of Loan dropdown box and check all fiels are in alphabetical order
  Then user should select Supervisor  dropdown box and check all fiels are in alphabetical order