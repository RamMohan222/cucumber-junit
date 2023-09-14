@app
Feature: Calculator
  I want to add two numbers

  @test1
  Scenario: Simple add operation
    Given have given a number 2
    And have given a number 3
    When I permform add operation
    Then I got the result 5

  @test2
  Scenario Outline: Simple add operation with multiple values
    Given have given a number <a>
    And have given a number <b>
    When I permform add operation
    Then I got the result <result>

    Examples: 
      | a | b | result |
      | 1 | 5 |      6 |
      | 2 | 7 |      9 |
