Feature: Check and click on Add to Cart Button
  @AddToCart
  Scenario: user able to see all Add to cart button and click on selected products of laptops category
    Given user is on homepage
    When user click on laptops and showall laptops
    And user see all Add to cart button of laptops
    And user click on Add to cart button on selected product
    Then user able to see all Add to cart button and click on selected products of laptops category successfully