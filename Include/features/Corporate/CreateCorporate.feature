@CreateCorporate
Feature: As an End User
  I want to create a Corporate information

  @Testcase1 @Create
  Scenario: Verify that Originator can create the new Corporate successfully
    Given This user can access Operations page
    And User belongs to company that it is set Originator
    When User clicks on CREATE NEW CORPORATE button
    And User inputs all data
    And User clicks on CREATE button
    Then User sees details page with input data

  @Testcase2 @ValidationMsg
  Scenario: Verify displaying the required error message "This field is required." when don't input data into "Internal corporate ID" field
    Given This user can access Operations page
    And User belongs to company that it is set Originator
    When User clicks on CREATE NEW CORPORATE button
    And User clicks on the Internal corporate ID field
    And User does not input any data into this field and clicks other field
    Then An error message is displayed "This field is required." for this field
