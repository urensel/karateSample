Feature: check user by API

  Background:
    * url githubBaseURL

  Scenario Outline: get all info about user
    Given path '/users/<user>'
    When method GET
    And print response
    Then status 200
    Examples:
      |     user      |
      |urensel        |
      |kubracakmak    |
      |ozgurozturknet |


  Scenario Outline: get all repos for user
    Given path '/users/<user>/repos'
    When method GET
    And print response
    Then status 200
    Examples:
      |     user      |
      |urensel        |
      |kubracakmak    |
      |ozgurozturknet |