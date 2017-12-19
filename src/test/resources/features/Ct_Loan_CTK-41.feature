Feature:  Create and automateTest scenarios for the following fields in order to test dropdown fields content for page 3; 



Background: All this steps are same for all scenarios on this feature file 

	Given I am on the home page of CT-Loan home page 
	
	When I am Enter Personal Information First Name as "Smith" 
	
	And I am Enter Personal Information Middle Name as "Steve" 
	
	And I am Enter Personal Information Last Name "Tesla" 
	
	And I am Select Personal Information Genger as "Male" 
	
	And I am Enter Personal Information Date of Birth as "05/05/1980" 
	
	And I am Enter Personal Information Personal File ID as "0123456789" 
	
	Then I am Click on Next Button 
	
	And I amd Enter Street Address as "2626 Arlington Blv" 
	
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
	
	
	
@Bibek 
Scenario: Test for content inside dropdown menu 

	Given I click select Title option and see content inside the titleOption 
	
	And I click select Department option and see content inside Department 
	
	And I click select Duration of Employment and see content inside it 
	
	And I click Purpose of Loan and see content inside it 
	
	And I click Supervisor and see content inside it 
	
	Then I click on next option 