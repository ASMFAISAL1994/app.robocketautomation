Feature: Create Contact
  @smoke
  Scenario Outline: User will provide Contact Information Form to Create Contact
    Given User in the Contacts menu table
    When User will select Contact from menu
    And User will click to Create Contact and a form will open
    And User will provide Contact '<Name>','<Email>','<Phone number>','<Job title>','<Department>'
    And User will  provide Buying role
    And User will  provide Contact owner
    And User will select Gender
    And User will provide how he get the contact information
    And User will provide Lead status
    And User will select his Preferred language
    And User will select Company
    Then User will Successfully Create Contact
    Examples:
      | Name  |        Email         | Phone number |        Job title                  | Department |
      | Faisal|faisal@adndiginet.com | 01329665853  | Test Automation Engineer          |  IT        |