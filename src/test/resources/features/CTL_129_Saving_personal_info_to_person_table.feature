Feature: Saving personal info to person table
@TCL_129
Scenario Outline: Verify personal information in database 
Given User on the CT Loan application to complete personal information
And I enter valid personal, contact, employment and financial information "<firstName>" "<middleName>" "<lastName>" "<dateOfBirth>" "<sSN>"
When User submit the personal information form 
Then The personal information should be saved in person table 

Examples:

| firstName | | middleName | | lastName |  | dateOfBirth | | sSN        | 
| Suleyman  | | K          | | Sultan   |  | 01/01/1980  | | 0123456789 |

	