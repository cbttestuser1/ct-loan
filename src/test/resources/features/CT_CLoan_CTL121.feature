@Bibek1
Feature: Currently gender fields labels are Male and Female. These label should be changed to F and M respectively;


Background:
		Given the customer is on the personal information form


Scenario: Gender field label Change
  Given Verify M is in radio button
   Then  Verify F is in radio buton