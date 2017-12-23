Feature: Test Personal Information fields pattern
#Create and automateTest scenarios for the following fields in order to test fields pattern(acceptable data type):
#CTL_30 positive test scenario
@CTL_30 
Scenario: Navigate to Personal Information page

	Given I am on the CT Loan personal information homepage
	When I enter the applicant First Name as "Fatih"
	And I enter the applicant Middle Initial as "S"
	And I enter the applicant Last Name as "Mehmet"
	And I select the applicant gender as male
	And I select the applicant gender as female
	And I select the applicant DOB as "01/01/2000"
	And I enter the applicant SSN/Personal File ID as "0123456789"
	And I click on the Next button
	Then the contact information page should appear
	
@CTL_30_Negative
Scenario: Navigate to Personal Information Page for Negative Test	
	
	Given I am on the CT Loan personal information homepage for Negative Test
	When I enter the applicant First Name for negative test as "01456789fatih}-'!@#$%^&* 7898more than 35"
	And I leave the applicant Name empty as ""
	And I enter the applicant Middle Initial for negative test as "01456789fatih}-'!@#$%^&* 8975more than 35"
	And I enter the applicant Last Name for negative test as "01456789fatih}-'!@#$%^&* 7890more than 35"
	And I leave the applicant Last Name empty as ""
	And I select the applicant gender as male for negative test 
	And I enter the applicant DOB for negative testas "13/1/1886"
	And I leave the applicant DOB empty for negative test as ""
	And I enter the applicant DOB for negative test as "1/1/2099"
	And I leave the applicant SSN/Personal File ID empty for negative test as ""
	And I enter the applicant SSN/Personal File ID for negative test as "01234567891234ABC" 
#	Then I shoule be in the Contact Information page