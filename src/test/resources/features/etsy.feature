Feature: Etsy Title Verification and Search Functionality Title Verification
  with/without Parameterization

  Scenario: Etsy Title Verification
    When User is on etsy
    Then User sees title is as expected.

    Scenario: Etsy Search Functionality Title Verification (without parameterization)
    Given User is on etsy
    When User types Wooden Spoon in the search box
    And User clicks search button
    Then User sees Wooden Spoon is in the title

    Scenario: Etsy Search Functionality Title Verification (with parameterization)
    Given User is on etsy
    When User types Wooden Spoon in the search box
    And User clicks search button
    Then User sees Wooden Spoon is in the title
