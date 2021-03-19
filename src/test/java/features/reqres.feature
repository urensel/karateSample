Feature: check returned users by API

  Background:
    * url reqresBaseURL

  Scenario: get list of all users
    Given path '/api/users'
    * header per_page = 20
    When method GET
    Then status 200