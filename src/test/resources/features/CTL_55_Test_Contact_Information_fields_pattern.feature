@adress
Feature: Test Contact Information fields pattern
Scenario: Automamation Test for contact information  
Given the user is on the CT-Loan home page
And the user enters acceptable streetAddress "1723 Seminary rd apt 135"
And the user enters  addressLinetwo "507 Emma str"
And the user enters  city "Alexandria"
And the user enters  state "VA"
And the user enters country "United States"
And the user enters  zipCode "22315"
And the user enters  personalPhonePartOne "843"
And the user enters  personalPhonePartTwo "297"
And the user enters  personalPhonePartthree "4523"
And the user enters  workPhonePartOne "703"
And the user enters  workPhonePartTwo "546"
And the user enters  workPhonePartThree "5412"
And the user enters  extension "567"
And the user enters  workEmail "user1@mail.com"
And the user enters  personalEmail "user2@gmail.com"
And the user click on the next button 
Then the employment information should be displayed "Employment Information"