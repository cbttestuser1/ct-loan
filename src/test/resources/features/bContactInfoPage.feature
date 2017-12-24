Feature: whole flow
#Background: verify with min length 
#    Given I am on the personal information page of CT-Loan 
#    When I enter first name "a" 
#    And I enter middle name "" 
#    And I enter last name "b" 
#    And I select male 
#    And I enter date of birth "1/1/1900" 
#    And I enter personal file id "0" 
#    And I click the next button 
#    Then I should be able to see contact information page 

Scenario Outline: testing inside length/size limit 
    Given currently on CTLoan contacts page 
    And user enters the contact information: 
        |Address1           |<address1>           |
        |Address2           |<address2>           |    
        |City               |<city>               |
        |Region             |<region>         |
        |ZipCode            |<zipCode>            |
        |Country            |<country>            |
        |Cell1              |<cell1>          |
        |Cell2              |<cell2>          |
        |Cell3              |<cell3>          |
        |WorkNum1           |<workNum1>           |
        |WorkNum2           |<workNum2>           |   
        |WorkNum3           |<workNum3>           |
        |Extension          |<extension>      |
        |Email              |<Email>          |
        |WorkEmail          |<workEmail>      |   
    When the user clicks on the next button 
    Then page should navigate to Employment Info page
    Examples:
| address1                                          | address2            |city            |region| zipCode |country      |cell1 |cell2 |cell3  |workNum1|workNum2|workNum3|extension|Email                          | workEmail                    |   
|1234 iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii|12345 aaaaaaaaaaaaaaa|cccccccccccccccc|OH    |123456   |United States|222   |222   |2222   |333     |333     |3333    |12345    |123456789123456789@abcdefg.com |123456789123456789@higklmn.com|


@MySmoke2
Scenario Outline: testing outside length/size limit
    Given currently on CTLoan contacts page 
    And user enters the contact information: 
        |Address1           |<address1>           |
        |Address2           |<address2>           |    
        |City               |<city>               |
        |Region>         |<region>         |
        |ZipCode>            |<zipCode>            |
        |Cell1              |<cell1>          |
        |Cell2              |<cell2>          |
        |Cell3              |<cell3>          |
        |WorkNum1           |<workNum1>           |
        |WorkNum2           |<workNum2>           |   
        |WorkNum3           |<workNum3>           |
        |Extension          |<extension>      |
        |Email              |<email>          |
        |WorkEmail          |<workEmail>      |   
    When the user clicks on the next button 
    Then error message should be thrown 
    And contacts page should be open 
    Examples:
|   address1                                        | address2            |city            |region| zipCode |country      | cell1           | cell2             | cell3|workNum1|workNum2|workNum3  |extension  | email                         | workEmail                     |   
|1234 iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii ii|12345 aaaaaaaaaaa aaa|cccccccccccccccc|OH    |123456   |United States|222              |222                |2222  |333     |333     |3333      |12345      |1234567890123456789@abcdefg.com|1234567890123456789@hijklmn.com|
|123                                                |o                    |o               |o     |12345    |United States|222              |                   |2222  |333     |        |3333      |           |123@a.com                      |456@h.com                      |
|1234 iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii ii |12345 aaaaaaaaaa aaa |ccccccccccccccc |OH    |123      |United States|222              |222                |      |333     |333     |          |12345      |123456789123456789@abcdefg.com |123456789123456789@abcdefg.com |   