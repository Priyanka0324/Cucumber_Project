Feature: This feature would be creating a calculator for Add and Subtract

  @sanity
  Scenario: To Add two numbers
    Given I have a calculator
    When I add 4 and 5
    Then I should get the result as 9

Scenario Outline: To Add two numbers
    Given I have a calculator
    When I add <num1> and <num2>
    Then I should get the result as <result>

	#whereas examples is accessible across different steps
    Examples: 
      | num1 | num2 | result |
      |    2 |    3 |      5 |
      |    3 |    4 |      7 |
      |    5 |    6 |     11 |

  Scenario: To Add two numbers
    Given I have a calculator
    When I add below numbers
    #below is the datatable and the purpose of this is because we dont how many numbers we need to add
    #and it is accessible to only this step
    |3| 
    |2|
    |5|
    |4|
    |3|
    Then I should get the result as 17