@FieldSize
Feature: As a user, when I go to CT-Loan home page,
         I should be able to enter my personal informations given field size.
Background:
   Given  I am on the home page of CT-Loan          
#=================== First Name ==============================================
Scenario: user should be able to enter data into FirstName field no more than 
          thirty five characters and cannot leave empty 
        And user enters valid data into FirstName field on Personal Info page         
       |  First Name    | Middle Name | Last Name | Gender | Data of Birth | Personal File ID |
	   |  ddnabcdefghij |	Sam       | Jones	  | Male   | 10/18/1984    |   234346980      |
	    When I click on Next button
	    Then user should be able to move to the next page successfully 
	    
#================== Middle name ==============================================
Scenario: user should able to enter data into MiddleName field no more than 
          thirty five characters or can liave empty
       And user entrs valid data into MiddleName field on Personal info page
          | First Name | Middle Name | Last Name | Gender | Data of Birth | Personal File ID |
          |    Mike    |             |  Tyson    |  Male  |   15/04/1950  |  987654321       |     
       When I click on Next button
       Then user should be able to move to the next page successfully
       
#================== Last Name =================================================
Scenario: user should able to enter data into LastName field no more than
          thirty five characters and cannot leave empty
       And user entrs valid data into LastName field Personal Info page
         | First Name | Middle Name |    Last Name   | Gender | Data of Birth | Personal File ID |
         |   Mike     |             | sncsdcsdcoivcj |  Male  |  12/10/2001   |    567894321     | 
       When I click on Next button
       Then user should be able to move to the next page successfully 
       
#================== Gender =====================================================
Scenario: user should able to check gender from Gender radio button and cannot leave uncheck
       And user checks the Gender from checkbox
       | First Name | Middle Name | Last Name | Gender | Data of Birth | Personal File ID |
       |    Mike    |    Iron     |   Tyson   |   Male |  09/01/1996   |     352663446    |
      When I click on Next button
      Then user should be able to move to the next page successfully
      
#================== Data of Birth =============================================   
Scenario: user should able to enetr into DataOfBirth filed no more than 
          twelf watermark format numbers and cannot be 0 or negative numbers
       And user enters valid data into DataOfBirth field Personal Info page
       | First Name | Middle Name | Last Name | Gender | Data of Birth | Personal File ID |
       |    Mike    |    Iron     |   Tyson   |   Male |  09/01/1996   |     352663446    |
      When I click on Next button
      Then user should be able to move to the next page successfully

#================== Personal File ID ===========================================

Scenario: user should able to enetr into PersonalFileID filed no more than 
          nine numbers only and cannot be 0 or negative numbers
       And user enters valid data into PersonalFileID field Personal Info page
       | First Name | Middle Name | Last Name | Gender | Data of Birth | Personal File ID |
       |    Mike    |    Iron     |   Tyson   |   Male |  09/01/1996   |     352663446    |
      When I click on Next button
      Then user should be able to move to the next page successfully
      
                    
           	    
