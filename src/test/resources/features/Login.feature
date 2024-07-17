Feature: Login function

  As a user
  I want to login site

  Scenario: Verify user cannot login with invalid username and password
    Given user is in login page
    When user login with username and password
    Then user sees the error message displays correct