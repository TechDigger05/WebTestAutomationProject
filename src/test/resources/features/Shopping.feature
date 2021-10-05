@test
Feature: To verify the Wishlist and Shopping cart functionality of shopping site.

  Scenario: 1. Verify the Wishlist page
    Given User is on Homepage of the application
    When I add four different products to my wish list
    And I view my wishlist table
    Then I find total four products in my Wishlist

  Scenario: 2. Add and verify lowest price item to the cart
    Given User is on Homepage of the application
    When I Search for lowest price product
    And I am able to add the lowest price item to my cart
    Then I am able to verify the item in my cart

