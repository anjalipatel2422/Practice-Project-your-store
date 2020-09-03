Feature:Add product to Basket
  @Product
  Scenario: User should be able to add products to basket and see products in shopping cart successfully
    Given user is on HomePage
    When user click on Phone&PDAs
    And user add HTC Product in to cart
    And user add iphone product into cart
    And user can able to click on shopping cart button
    Then user should able see products in shopping cart successfully