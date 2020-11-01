@surname
Feature: Contacts Page
  Scenario: Get name and surname by email
    Given the user is on the login page
    And  the user enters the store manager information
    When the user navigates to "Customers" "Contacts"
    Then the user takes name and surname by using "mbrackstone9@example.com"
