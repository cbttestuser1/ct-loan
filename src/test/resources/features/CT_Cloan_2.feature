@SmokeTest @Smoke @RuskK 
Feature: Create and automateTest scenarios for the following fields in order to test fields pattern(acceptable data type) for Registration Page 2; 

Background: All this steps are same for all scenarios on this feature file 
	Given I am on the home page of CT-Loan home page 
	When I am Enter Personal Information First Name as "Smith" 
	And I am Enter Personal Information Middle Name as "Steve" 
	And I am Enter Personal Information Last Name "Tesla" 
	And I am Select Personal Information Genger as "Male" 
	And I am Enter Personal Information Date of Birth as "05/05/1980" 
	And I am Enter Personal Information Personal File ID as "0123456789" 
	Then I am Click on Next Button 
	
	
@RKTesing0 
Scenario: Positive Test for registration Page Two - Contact Information 
	Given I amd Enter Street Address as "2626 Arlington Blv" 
	When I amd Enter Address Line Second as "apt 36" 
	And I amd Enter City as "Arlington" 
	And I amd Enter State as "VA" 
	And I amd Enter Postal / ZIP Code as "21209" 
	And I amd Enter Country as "United States" 
	And I amd Enter Personal Phone Number as "701-525-4545" 
	And I amd Enter Work Phone Number as "702-525-4546" 
	And I amd Enter Extenstion as "555" 
	And I amd Enter Personal Email as "smith.steve@gmail.com" 
	And I amd Enter Work Email as "smith.steve@companyX.gmail.com" 
	Then I am Click Next Button and verify switch to Employment Information Page 
	
	
@RKTesing1 
Scenario: Negotive with missing StreetAddreess is NULL 
	Given I amd Enter Address Line Second as "apt 36" 
	When I amd Enter City as "Arlington" 
	And I amd Enter State as "VA" 
	And I amd Enter Postal / ZIP Code as "21209" 
	And I amd Enter Country as "United States" 
	And I amd Enter Personal Phone Number as "701-525-4545" 
	And I amd Enter Work Phone Number as "702-525-4546" 
	And I amd Enter Extenstion as "555" 
	And I amd Enter Personal Email as "smith.steve@gmail.com" 
	And I amd Enter Work Email as "smith.steve@companyX.gmail.com" 
	And I am Click Next Button and verify switch to Employment Information Page 
	
@RKTesing2 
Scenario: Negotive with missing Addreess2 is NULL 
	Given I amd Enter Street Address as "2626 Arlington Blv" 
	When I amd Enter City as "Arlington" 
	And I amd Enter State as "VA" 
	And I amd Enter Postal / ZIP Code as "21209" 
	And I amd Enter Country as "United States" 
	And I amd Enter Personal Phone Number as "701-525-4545" 
	And I amd Enter Work Phone Number as "702-525-4546" 
	And I amd Enter Extenstion as "555" 
	And I amd Enter Personal Email as "smith.steve@gmail.com" 
	And I amd Enter Work Email as "smith.steve@companyX.gmail.com" 
	And I am Click Next Button and verify switch to Employment Information Page 
	Then I am verified that Empty Address Field Error is appers 
	
	
@RKTesing3 
Scenario: Negotive with missing City is NULL 
	Given I amd Enter Street Address as "2626 Arlington Blv" 
	When I amd Enter Address Line Second as "apt 36" 
	And I amd Enter State as "VA" 
	And I amd Enter Postal / ZIP Code as "21209" 
	And I amd Enter Country as "United States" 
	And I amd Enter Personal Phone Number as "701-525-4545" 
	And I amd Enter Work Phone Number as "702-525-4546" 
	And I amd Enter Extenstion as "555" 
	And I amd Enter Personal Email as "smith.steve@gmail.com" 
	And I amd Enter Work Email as "smith.steve@companyX.gmail.com" 
	And I am Click Next Button and verify switch to Employment Information Page 
	Then I am verified that Empty Address Field Error is appers 
	
@RKTesing4 
Scenario: Negotive with missing State is NULL 
	Given I amd Enter Street Address as "2626 Arlington Blv" 
	When I amd Enter Address Line Second as "apt 36" 
	And I amd Enter City as "Arlington" 
	And I amd Enter Postal / ZIP Code as "21209" 
	And I amd Enter Country as "United States" 
	And I amd Enter Personal Phone Number as "701-525-4545" 
	And I amd Enter Work Phone Number as "702-525-4546" 
	And I amd Enter Extenstion as "555" 
	And I amd Enter Personal Email as "smith.steve@gmail.com" 
	And I amd Enter Work Email as "smith.steve@companyX.gmail.com" 
	And I am Click Next Button and verify switch to Employment Information Page 
	Then I am verified that Empty Address Field Error is appers 
	
@RKTesing5 
Scenario: Negotive with missing ZIP is NULL 
	Given I amd Enter Street Address as "2626 Arlington Blv" 
	When I amd Enter Address Line Second as "apt 36" 
	And I amd Enter City as "Arlington" 
	And I amd Enter State as "VA" 
	And I amd Enter Country as "United States" 
	And I amd Enter Personal Phone Number as "701-525-4545" 
	And I amd Enter Work Phone Number as "702-525-4546" 
	And I amd Enter Extenstion as "555" 
	And I amd Enter Personal Email as "smith.steve@gmail.com" 
	And I amd Enter Work Email as "smith.steve@companyX.gmail.com" 
	And I am Click Next Button and verify switch to Employment Information Page 
	Then I am verified that Empty Address Field Error is appers 
	
@RKTesing6 
Scenario: Negotive with missing Country is NULL 
	Given I amd Enter Street Address as "2626 Arlington Blv" 
	When I amd Enter Address Line Second as "apt 36" 
	And I amd Enter City as "Arlington" 
	And I amd Enter State as "VA" 
	And I amd Enter Postal / ZIP Code as "21209" 
	And I amd Enter Personal Phone Number as "701-525-4545" 
	And I amd Enter Work Phone Number as "702-525-4546" 
	And I amd Enter Extenstion as "555" 
	And I amd Enter Personal Email as "smith.steve@gmail.com" 
	And I amd Enter Work Email as "smith.steve@companyX.gmail.com" 
	And I am Click Next Button and verify switch to Employment Information Page 
	Then I am verified that Empty Address Field Error is appers 
	
@RKTesting7 
Scenario: Negotive with missing Personal Phone Number is NULL 
	Given I amd Enter Street Address as "2626 Arlington Blv" 
	When I amd Enter Address Line Second as "apt 36" 
	And I amd Enter City as "Arlington" 
	And I amd Enter State as "VA" 
	And I amd Enter Postal / ZIP Code as "21209" 
	And I amd Enter Country as "United States" 
	And I amd Enter Work Phone Number as "702-525-4546" 
	And I amd Enter Extenstion as "555" 
	And I amd Enter Personal Email as "smith.steve@gmail.com" 
	And I amd Enter Work Email as "smith.steve@companyX.gmail.com" 
	And I am Click Next Button and verify switch to Employment Information Page 
	Then I am verified that Error of Empty Personal Phone number is appers 
	
@RKTesing8 
Scenario: Negotive with missing Work Phone Number is NULL 
	Given I amd Enter Street Address as "2626 Arlington Blv" 
	When I amd Enter Address Line Second as "apt 36" 
	And I amd Enter City as "Arlington" 
	And I amd Enter State as "VA" 
	And I amd Enter Postal / ZIP Code as "21209" 
	And I amd Enter Country as "United States" 
	And I amd Enter Personal Phone Number as "701-525-4545" 
	And I amd Enter Extenstion as "555" 
	And I amd Enter Personal Email as "smith.steve@gmail.com" 
	And I amd Enter Work Email as "smith.steve@companyX.gmail.com" 
	And I am Click Next Button and verify switch to Employment Information Page 
	Then I am verified that Error of Empty Work Phone number is appers 
	
@RKTesing9 
Scenario: Negotive with missing Person Email is NULL 
	Given I amd Enter Street Address as "2626 Arlington Blv" 
	When I amd Enter Address Line Second as "apt 36" 
	And I amd Enter City as "Arlington" 
	And I amd Enter State as "VA" 
	And I amd Enter Postal / ZIP Code as "21209" 
	And I amd Enter Country as "United States" 
	And I amd Enter Personal Phone Number as "701-525-4545" 
	And I amd Enter Work Phone Number as "702-525-4546" 
	And I amd Enter Extenstion as "555" 
	And I amd Enter Work Email as "smith.steve@companyX.gmail.com" 
	And I am Click Next Button and verify switch to Employment Information Page 
	Then I am verified that Error of Person Email is appers 
	
@RKTesing10 
Scenario: Negotive with missing Work Email is NULL 
	Given I amd Enter Street Address as "2626 Arlington Blv" 
	When I amd Enter Address Line Second as "apt 36" 
	And I amd Enter City as "Arlington" 
	And I amd Enter State as "VA" 
	And I amd Enter Postal / ZIP Code as "21209" 
	And I amd Enter Country as "United States" 
	And I amd Enter Personal Phone Number as "701-525-4545" 
	And I amd Enter Work Phone Number as "702-525-4546" 
	And I amd Enter Extenstion as "555" 
	And I amd Enter Personal Email as "smith.steve@gmail.com" 
	And I am Click Next Button and verify switch to Employment Information Page 
	Then I am verified that Error of Work Email is appers 
	
	
	
@RKTesting122 
Scenario Outline: : Negotive with Not allows charger for Address1 
	Given I amd Enter Street Address as "2626 Arlington Blv <charter>" 
	When I amd Enter Address Line Second as "apt 36" 
	And I amd Enter City as "Arlington" 
	And I amd Enter State as "VA" 
	And I amd Enter Postal / ZIP Code as "21209" 
	And I amd Enter Country as "United States" 
	And I amd Enter Personal Phone Number as "701-525-4545" 
	And I amd Enter Work Phone Number as "702-525-4546" 
	And I amd Enter Extenstion as "555" 
	And I amd Enter Personal Email as "smith.steve@gmail.com" 
	And I amd Enter Work Email as "smith.steve@companyX.gmail.com" 
	And I am Click Next Button and verify switch to Employment Information Page 
	Then I am verified that empty Street Address input box shows Error 
	
	Examples: 
		| charter 	| 
		| 	*		| 
		| 	$		| 
		| 	%		| 
		| 	@		| 
		| 	#		| 
		#	| 	"		| 
		| 	+		| 
		| 	=		| 
		| 	&		| 
		| 	^0		| 
		
		@RKTesting114 
		Scenario Outline: : Negotive with Not allows charger for AddressTwo 
			Given I amd Enter Street Address as "2626 Arlington Blv" 
			When I amd Enter Address Line Second as "apt 36  <charter>" 
			And I amd Enter City as "Arlington" 
			And I amd Enter State as "VA" 
			And I amd Enter Postal / ZIP Code as "21209" 
			And I amd Enter Country as "United States" 
			And I amd Enter Personal Phone Number as "701-525-4545" 
			And I amd Enter Work Phone Number as "702-525-4546" 
			And I amd Enter Extenstion as "555" 
			And I amd Enter Personal Email as "smith.steve@gmail.com" 
			And I amd Enter Work Email as "smith.steve@companyX.gmail.com" 
			And I am Click Next Button and verify switch to Employment Information Page 
			Then I am verified that empty Street AddressTwo input box shows Error 
			
			Examples: 
				| charter 	| 
				| 	*		| 
				| 	$		| 
				| 	%		| 
				| 	@		| 
				| 	#		| 
				#	| 	"		| 
				| 	+		| 
				| 	=		| 
				| 	&		| 
				| 	^0		| 