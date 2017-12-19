@CTeckLoan37
Feature:  Test Employment Information mandatory fields

Background:
  Given User is on the Employment Information Page

	Scenario Outline: Selectng all mandatory fields
	And the user select field Title "<title>" 
	And the user selects field Department "<department>"
    And the user selects field Duration of Employment "<duration>"
	And the user selects field purpose of Loan of "<purpose_of_loan>"
    And the user selects field Supervisor "<supervisor>"
	And the user clicks on the next button
	Then the financial information shud be display
	
Examples:
    |title    |department  |duration   |purpose_of_loan|supervisor        |
	|    QA   |Development |  5-10     | Education     | Wiiliam Cranstone|


	
	Scenario Outline: Testing Title field	
	And the user selects field Department "<department>"
    And the user selects field Duration of Employment "<duration>"
	And the user selects field purpose of Loan of "<purpose_of_loan>"
    And the user selects field Supervisor "<supervisor>"
	And the user clicks on the next button
	Then Error message under Title box should be displayed "Select any choice for this field."
	
Examples:
     |title    |department  |duration   |purpose_of_loan|supervisor        |
  	 |         |Development |  5-10     | Education     | Wiiliam Cranstone|

	
Scenario Outline: Testing Title field	
	And the user select field Title "<title>" 
    And the user selects field Duration of Employment "<duration>"
	And the user selects field purpose of Loan of "<purpose_of_loan>"
    And the user selects field Supervisor "<supervisor>"
	And the user clicks on the next button
	Then Error message under Department box should be displayed "Select any choice for this field."
	
Examples:
     |title    |department  |duration   |purpose_of_loan|supervisor        |
	 |    QA   |            |  5-10     | Education     | Wiiliam Cranstone|
	
Scenario Outline: Testing Title field	
	And the user select field Title "<title>" 
	And the user selects field Department "<department>"
  	And the user selects field purpose of Loan of "<purpose_of_loan>"
    And the user selects field Supervisor "<supervisor>"
	And the user clicks on the next button
	Then Error message under Duration box should be displayed "Select any choice for this field."
	
Examples:
    |title    |department  |duration   |purpose_of_loan|supervisor        |
	|    QA   |Development |           | Education     | Wiiliam Cranstone|
	
	Scenario Outline: Testing Title field	
	And the user select field Title "<title>" 
	And the user selects field Department "<department>"
    And the user selects field Duration of Employment "<duration>"
    And the user selects field Supervisor "<supervisor>"
	And the user clicks on the next button
	Then Error message under Purpose box should be displayed "Select any choice for this field."
	
Examples:
     |title    |department  |duration   |purpose_of_loan|supervisor        |
	 |    QA   |Development |  5-10     |               | Wiiliam Cranstone|

	
	
	Scenario Outline: Testing Title field	
	And the user select field Title "<title>" 
	And the user selects field Department "<department>"
    And the user selects field Duration of Employment "<duration>"
	And the user selects field purpose of Loan of "<purpose_of_loan>"
  	And the user clicks on the next button
	Then Error message under Supervisor box should be displayed "Select any choice for this field."
		
Examples:
    |title    |department  |duration   |purpose_of_loan|supervisor        |
	|    QA   |Development |  5-10     | Education     |                  |

	