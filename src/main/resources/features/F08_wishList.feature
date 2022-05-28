@smoke
Feature: F08_wishList | guest user could add products to wishList
  Scenario: success message is visible after adding product to wishlist
    When guest user add product to wishlist
    Then wishlist notification success is visible

  Scenario: number of wishlist items in home page is increased
    When guest user add product to wishlist
    Then wishlist notification success is visible
    And guest user get the number of wishlist items after adding product
    Then number of wishlist items increased

  Scenario: added products are displayed on wishlist page
    When guest user add product to wishlist
    Then wishlist notification success is visible
    And guest user get the number of wishlist items after adding product
    And guest user go to wishlist page
#    Then number of quantities are greater than zero in wishlist page

