@CreateCorporate
Feature: As an End User
  I want to create a Corporate information

  @Create
  Scenario: Create a Corporate
    Given This user can access Operations page
    And User belongs to company that it is set Originator
    When User clicks on CREATE NEW CORPORATE button
    And User inputs all data
    #And user clicks CREATE button
    #Then user sees detail page with inputted data
