Feature: As a user, I need to send a payment

  Scenario: Send Payment
    Given I login with username and password
      | username | password |
      | company  | company  |
    And click on make payment
    When you fill out the form
      | phone      | name    |amount  |country  |
      | 3004153859 | carlos  |31      |USA      |
    And confirm send payment
    Then send payment is successful