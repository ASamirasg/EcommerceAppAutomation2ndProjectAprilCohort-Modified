Feature: guest user could register with valid data successfully
  Background:guest open browser and navigates to demo.nopcommerce.com
  Scenario: guest user register wih valid data
    Given guest user click on register
    When guest user fill personal valid data
    And guest user fill password
    And guest user click on register button
    Then guest user get success message




