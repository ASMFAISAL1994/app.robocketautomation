Feature: Create Company
  @smoke
  Scenario Outline: User Will Provide Companies Necessary Information To Create Company
    Given User in the the Contacts menu bar.
    When User will Select from menu Companies
    And User will click to Create Company and a form will open
    And User will provide '<Company name>','<Company domain>','<Company email>','<Company phone number>',Country
    And User will also provide Lead status,'<Number of sister concern>','<Number of decision makers>','<Number of employees>','<Number of times contacted>'and '<Total open deal value>'
    Then User will Successfully Create Company
    Examples:
      | Company name |     Company domain  |    Company email     | Company phone number |  Number of sister concern | Number of decision makers | Number of employees | Number of times contacted | Total open deal value |
      |  Adn Telecom |  www.adntelecom1.com|  adntelecom@gmail.com|    01623928456       |         4                 |           7               |    50                |    20                    |       30              |