Feature: Login Feature Scenario

  Background: 
    Given I have launched the application
    And I click on the Login Link

  Scenario: This scenario is to define the login happy path
    When I enter the correct username and password
    And I click on Login Button
    Then I should land on the home page
    
	@regression
  Scenario: This scenario is to define the failure path
    When I enter the incorrect username and password
    And I click on Login Button
    Then I should get the error message "The email or password you have entered is invalid."

  @sanity
  Scenario: This scenario is to define the failure path
    #And I click on the Login Link // comment any step using #
    When I enter the username as "piya@gmail.com" and password as "pomKabcde1"
    And I click on Login Button
    Then I should get the error message "The email or password you have entered is invalid."

  Scenario Outline: This scenario is to define the failure path
    When I enter the username as "<UserName>" and password as "<Password>"
    And I click on Login Button
    Then I should get the error message "The email or password you have entered is invalid."

    Examples: 
      | UserName       | Password     |
      | piya@gmail.com | pomKabcde1   |
      | pqr@xyz.com    | abcdEfg12434 |
