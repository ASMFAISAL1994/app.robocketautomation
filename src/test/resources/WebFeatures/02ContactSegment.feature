Feature: Contact Segment
  @smoke
  Scenario Outline: User will go to Contacts menu and will Create Contact Segment
    Given User has the Contacts menu bar
    When User will click Contact Segment
    And User will click to Create Segments
    And User will provide Details of '<Segment name>','<Segment description>' and click to Next
    And User will select Filter Attribute
    And User will set conditional operators
    And User will set conditional value
    Then User will successfully create Segments
    Examples:
      | Segment name                    | Segment description            |
      | Business Analytics Hub          | Foster learning and innovation |