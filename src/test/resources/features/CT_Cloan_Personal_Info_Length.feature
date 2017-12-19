Feature: testing length of personal information
@Length
Scenario Outline: Testing the length of Personal Information Page

	Given the customer is on the personal information form
	And the customer enters "<firstName>" "<middleName>" "<lastName>" "<dateOfBirth>" "<personalFileID>"
	
	Examples:
	
	|firstName									|middleName									|lastName											|dateOfBirth		|personalFileID			|
	|qwertyuiopasdfghjklmnbvcxzasdfghjkaslouy	|N/A										|Bibek												|12/20/1999			|123456789				|
	|Serdar										|qwertyuiopasdfghjklmnbvcxzasdfghjkllouywa	|Bibek												|12/20/1999			|123456789				|
	|Serdar 									|N/A										|qwertyuiopasdfghjklmnbvcxzasdfghjkllouywa			|12/20/1999			|123456789		 		|
	|Serdar										|N/A										|Bibek												|127/20/1999		|123456789		 		|
	|Serdar										|N/A										|Bibek												|12/202/1999		|123456789		 		|
	|Serdar										|N/A										|Bibek												|12/20/19976		|123456789		 		|
	|Serdar										|N/A										|Bibek												|12/20/1999			|123456789231	 		|
			 		