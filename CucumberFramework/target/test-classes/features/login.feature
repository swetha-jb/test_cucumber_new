Feature: User Login

  As a user
  I want to login to the system
  So that I can access my dashboard

  @smoke @login
  Scenario: Successful login with valid credentials
    Given I am on the login page
    When I enter a valid username and password
    Then I should be redirected to the dashboard

  @regression @login
  Scenario: Unsuccessful login with invalid credentials
    Given I am on the login page
    When I enter an invalid username and password
    Then I should see an error message

  @regression @login
  Scenario: Login with empty credentials
    Given I am on the login page
    When I do not enter any username or password
    Then I should see a "fields are required" message
