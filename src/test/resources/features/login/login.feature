Feature: Login
  As a Bookstore Web API
  I want to see my timeline
  So that I can see bookstore

  @LoginSukses
  Scenario: Login Success
    Given I am on the login page
    When I enter my username and password correctly
    Then I am taken to the timeline

  @LoginFailed_1
  Scenario: Login Failed_1
    Given I am Login Page
    When I enter my invalid username and valid password
    Then I am not success login

  @LoginFailed_2
  Scenario: Login Failed_2
    Given I am the Login Page
    When I enter my valid username and invalid password
    Then I am not success on the page login

  @LoginFailed_3
  Scenario: Login Failed_3
    Given I am on the Login Page
    When I enter my invalid username and password
    Then I am not login