Feature: Assign Books Feature API Tests

  Scenario Outline: Execute AssignBooks API and verify Response
    Given I prepare the Assign books Request payload with ISBN "<ISBN>"
    When I send the Assign book Post request
    Then I verify Assign book Request Respone has below Expected status code as "<expectedStatusCode>" and Response Message as "<ResponseMessage>"

    Examples: 
      | expectedStatusCode | ISBN          | ResponseMessage                                |
      |                400 | 9781449365035 | ISBN already present in the User's Collection! |
