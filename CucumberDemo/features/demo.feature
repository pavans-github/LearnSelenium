
Feature: Testlogin functionality for demowebshop

  @validlogin
  Scenario: Test demowebshope with credentials
    Given open chrome and start application  
    When I enter valid username and password
    Then user should be able to login
 
 	@invalidlogin
 	Scenario: Test demowebshope with invalid credentials
    Given start application  
    When I enter invalid username and password
    Then user should not be able to login