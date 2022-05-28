Feature: User Could login with valid Credentials
  Background:guest open browser and navigates to demo.nopcommerce.com
  Scenario: guest user login with valid credentials
    Given guest user click on login tab
    When user set valid email and password
    Then user click on login button

