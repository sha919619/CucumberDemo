Feature: login feature

  Background:
    Given user already on homepage
    When user clicked on login link

  @First
    @End2EndTest
  @SmokeTest
    Scenario: login scenario with right username and wrong password
      Then user put right username
      And put wrong password
      Then user try to login
      But user failed to login
  @Second
    @SmokeTest
  @SanityTest
      Scenario: login scenario with wrong username and wrong password
        Then user enters credentials using dataTable
        |sha | 111111 |
        Then user attempts to login
        But user cannot login
  @Third
    @End2EndTest
    @SanityTest
  Scenario Outline: login scenario with wrong username and right password
    Then user provides "<username>"
    And provides "<password>"
    Then user want to login
    But  user is fail to login
    Examples:
      |username|password|
      |sha1    |12345   |
      |sha2    |13579   |
  @Fourth
    @RegressionTest
        Scenario: login scenario with right username and right password
          Then user gives right username
          And gives right password
          Then user press on login button
          And user logged in successfully



