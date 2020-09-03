Feature: Category feature
  @Category
  Scenario Outline: User should be able to navigate correct category so that he can use all product feature
    Given user is on homepage
    When user click on "<category>" link from top menu
    Then user should able to navigate to "<related category page>"
    Examples:
    |category |related category page|
    |Tablets  |http://tutorialsninja.com/demo/index.php?route=product/category&path=57|
#    |Desktops |http://tutorialsninja.com/demo/index.php?route=product/category&path=20|
#    |Laptops&Notebooks|http://tutorialsninja.com/demo/index.php?route=product/category&path=18|
#    |Components       |http://tutorialsninja.com/demo/index.php?route=product/category&path=25|