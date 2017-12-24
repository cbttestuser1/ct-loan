Feature: Verify personal information 

@CTL_123  
Scenario Outline: verify the data on person table
      Given I connect to the data table 
	  When personal table should contain  "SSN_NR" "FIRST_NAME" "LAST_NAME" "MIDDLE_INIT" "GENDER" and "DATE_OF_BIRTH"
      And personal table should have user's  "<SSN_NR>" ssn number

      And personal table should have user's "<FIRST_NAME>" first name 
      And personal table should have user's "<LAST_NAME>" last name  
      And personal table should have user's "<MIDDLE_INIT>" middle init
      And personal table should have user's "<GENDER>" gender
     Then personal table should have user's "<DATE_OF_BIRTH>" date of birth
       
     Examples: 
     	|SSN_NR	  |FIRST_NAME|LAST_NAME|MIDDLE_INIT|GENDER|DATE_OF_BIRTH|
     	|234346980|Mark      |Jones    |Sam		   |M     |18-OCT-1984  |