@CreateCorporate
Feature: As an End User
  I want to create a Corporate information

  Background: 
    Given User logins to Homepage

  @Testcase1 @Create
  Scenario: Verify that Originator can create the new Corporate successfully
    And This user can access Operations page
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
    And This user can access Operations page
    And User belongs to company that it is set Originator
    When User clicks on CREATE NEW CORPORATE button
    And User clicks on the Internal corporate ID field
    And User does not input any data into this field and clicks other field
    Then An error message is displayed for this field
      | error message           |
      | This field is required. |

  @Testcase3 @NavigateMenus_SubMenus
  Scenario: Verify that user can navigate some pages when clicking on Main and Sub menu of Left Menu
    When User clicks on the list of Main and Sub menu then assert the Text in Page correctly
      #| Menu              | Assertion          |
      #| Marketplace       | Marketplace        |
      #| Create deal       | Create a deal      |
      #| Operations        | Corporates / Banks |
      #| Import corporates | Import corporates  |
      | MenuLink                                                                     | Assertion          |
      | /deals                                                                       | Marketplace        |
      | /deals/create                                                                | Create a deal      |
      | /operations/88c40ac6-1136-4e8f-94fb-a1aee76b3910/corporate/corporates-banks  | Corporates / Banks |
      | /operations/88c40ac6-1136-4e8f-94fb-a1aee76b3910/corporate/import-corporates | Import corporates  |

  @Testcase4 @NavigateMenus_SubMenus
  Scenario: Verify that user can navigate some pages when hovering and clicking on Main and Sub menu of Left Menu
    When User hovers on the list of Main and clicks on the list of Sub-menu then assert the Text in Page correctly
      #| Menu       | Submenu                  | Assertion                                   |
      #| Trade      | Manage letters of credit | Letters of Credit - Participation Agreement |
      #| My Company | Automation POC profile   | Company info                                |
      | MenuLink                                           | Submenu                  | Assertion                                   |
      | /manage-receivables                                | Manage letters of credit | Letters of Credit - Participation Agreement |
      | /company/88c40ac6-1136-4e8f-94fb-a1aee76b3910/view | Automation POC profile   | Company info                                |
