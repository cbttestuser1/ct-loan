Feature: Mandatory fields in Personal Info

  @VerifyFields
  Scenario: User can not leave mandatory fields null but optional fields can be null: 
    Given the user is on the personal information page
    When the user leaves any field marked with an "*" blank
    Then the user should get an error message by that field "Enter a value for this field"