@oft
Feature: Calendar Page
  Scenario: Calendar Page Subtitle
    Given the user is on the login page
    And the user enters the store manager information
    When the user navigates to "Activities" "Calendar Events"
    Then the page subtitle should be "All Calendar Events"
