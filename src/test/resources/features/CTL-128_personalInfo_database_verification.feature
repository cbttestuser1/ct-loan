Feature: Verify personal information 
@Test128 
Scenario Outline: verify the data on person table 
	Given I connect to the data table 
	When personal table should contain  "SSN_NR" "FIRST_NAME" "LAST_NAME" "MIDDLE_INIT" "GENDER" and "DATE_OF_BIRTH" 
	And personal table should has user's  "<SSN_NR>" ssn number 
	And personal table should has user's "<FIRST_NAME>" first name 
	And personal table should has user's "<LAST_NAME>" last name 
	And personal table should has user's "<MIDDLE_INIT>" middle init 
	And personal table should has user's "<GENDER>" gender 
	Then personal table should has user's "<DATE_OF_BIRTH>" date of birth 
	And gender should be indicated by M and F characters
	And DOB table must have the date in "dd-MM-yyyy" format
	When the user does not enter middle name, the field value should be blank
	
	
	Examples: 
		|SSN_NR	  |FIRST_NAME|LAST_NAME|MIDDLE_INIT|GENDER|DATE_OF_BIRTH|
		|234346980|Mark      |Jones    |Sam        |M     |10/18/1984   |