@CreateCorporate
Feature: As an End User
  I want to create a Corporate information

  @Testcase1 @Create
  Scenario: Verify that Originator can create the new Corporate successfully
    Given This user can access Operations page
    And User belongs to company that it is set Originator
    When User clicks on CREATE NEW CORPORATE button
    And User inputs all data for Corporate
      | Internal corporate ID | DUNS number | Legal entity identifier | UK company number | ACRA UEN | Name    | Summary description   | Internal rating   | Private name   | Primary name contact  | Primary email contact | Company registration number |
      | RandomID              |         100 | LegalEntityID101        |               102 | ACRA103  | Name104 | SummaryDescription105 | InternalRating106 | PrivateName107 | PrimaryNameContact108 | soul1@mailinator.com  |                         109 |
    And User inputs all data for Business Address
      | Address 1  | Address 2  | City    | Region    | Postal code   |
      | Address111 | Address112 | City113 | Region114 | PostalCode115 |
    And User clicks on CREATE button
    Then User sees details page with input data


  @Testcase2 @ValidationMsg
  Scenario: Verify displaying the required error message "This field is required." when don't input data into "Internal corporate ID" field
    Given This user can access Operations page
    And User belongs to company that it is set Originator
    When User clicks on CREATE NEW CORPORATE button
    And User clicks on the Internal corporate ID field
    And User does not input any data into this field and clicks other field
    Then An error message is displayed for this field
      | error message           |
      | This field is required. |
