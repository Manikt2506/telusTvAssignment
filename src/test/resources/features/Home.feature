Feature: This is home page


  Scenario: Open TelusTv website and open Animated option with rating E and validate the details page
    Given User launches the TelusTv website
    And User closes the welcome popup
    When User clicks on On Demand tab
    And User scroll to Movies section and clicks on View All
    And User clicks on Filter and select Animated section
    Then User find and selects an asset with rating E

