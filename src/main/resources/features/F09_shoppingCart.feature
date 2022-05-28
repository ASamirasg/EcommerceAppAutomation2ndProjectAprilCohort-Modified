@smoke
Feature: F09_shoppingCart | guest user could add products to cart
  Background: User navigates to demo.nopcommerce website
  Scenario: guest user choose a product and click on ADD TO CART button
    Given scroll down and choose a random product and click on it
    When click on add to cart button
    Then the product is added to the user's shopping cart and message appears says The product has been added to your shopping cart