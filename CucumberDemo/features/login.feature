
Feature: Testlogin functionality for demowebshop

  @validlogin
  Scenario: Test demowebshope with credentials
    Given open chrome and start application  
    When I enter valid username and password
    Then user should be able to login
 
 	