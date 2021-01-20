#Author: f.pagn24@gmail.com


Feature: Calculator tester

  Background: Calculator
    Given that the Calculator app is running and in focus
    And there is no current value in the calculator


  Scenario: Add two numbers on the Calculator app
  When you add 3 and 5
  Then the value displayed should be 8



  Scenario Outline: check multiplication function on Calculator app
    When  I multiply <Number1> by <Number2> in the calculator app
    Then  the app displays the correct <Answer>
    Examples:
      | Number1 | Number2 | Answer  |
      |    5    |    9    |   45    |
      |    5    |    10   |   50    |
      |    5    |    11   |   55    |
      |    5    |    12   |   60    |