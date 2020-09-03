Feature: Registration feature
  @Registration
  Scenario: User should able to register successfully,so that user can use all
  functionality on my website

    Given user is on homepage
    When user clicks on MyAccount and register button
    And user enters all required registration details
    Then user should able to register successfully