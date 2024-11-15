Feature: Facebook Login

  Scenario: User logs in to Facebook with valid credentials
    Given I am on the Facebook login page
    When I enter my username and password
    And I click the login button
    Then I should be redirected to the Facebook home page
