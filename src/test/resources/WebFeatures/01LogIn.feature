Feature: Apps.Roboket Log In
  @smoke
  Scenario Outline: User will Login
    Given base url
    When User will Enter '<Email>' and '<Password>'
    And User will click Login Button
    Then User will Login Successfully
    Examples:
      | Email                    |  Password |
      |asmfaisal94+adn1@gmail.com|    123456 |