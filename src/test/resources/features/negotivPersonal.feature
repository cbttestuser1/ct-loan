Feature: Mandatory/optional fields Personal Information Page 
@CTL78 
Scenario: check the fields with unvalid values 

	Given User navigates to the following url: http://cybertekschool.com/ctl.qa 
	And Enters First Name null and Last Name Smith 
	And User selects the gender as Female 
	And User enters Date of Birth 
	And User enters SSN as 999857561 
	Then Click to next button 
	Then Verify that "Enter a value for this field." shoul be displayed 
	
@CTL78_2 
Scenario Outline: checkin error messages 
	Given User navigates to the following url: http://cybertekschool.com/ctl.qa 
	When User enters firstName as <firstName> and lastName <lastName> 
	And User selects gender <gender> 
	And User enters date <Date> 
	And Userenters ssn <SSN> 
	And Click to next button 
	Then verify the name Error & or lastName error 
	Then verify the gender error 
	Then Verify the date error 
	Then Verify the SSN error 
	
	Examples: 
		|firstName		|lastName  	|gender		|Date			| SSN	  	   |
		|	""			|"smith"	|"F"		| "02/11/1990"	| "123456789"  |
		|"jane"			|   ""		|"M"		| "02/10/1990"	| "458796857"  |
		|"jane"			|	"kate"	|"M"		|"-89"  		| "587875589"  |
		|"kate"			|"elly"		|	""		|"01/01/1980"	|"589632745"   |
		|"ali"			|"eser"		|  "F"		|"12/02/1980"	|	"1254"		   |
		|""				|"	anil"   |   "M"     |"12/02/1980"   |"125478598"   |
		|"aaron564"		|"tgre45"   |"F"        |    "04/08/1978" |""          |