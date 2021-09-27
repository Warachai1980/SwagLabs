Feature: Home page scenarios

  Background:
    Given  I navigate to LoginPage
    When  I input "Username" as "standard_user"
    And  I input "Password" as "secret_sauce"
    And I click Login button

  Scenario: Verify there are total of 6 items on the page
    When I open Home page I should see 6 items on the page

  Scenario: Verify Add to Cart button toggles to Remove when clicked
    When I click Add to Cart button toggle should change Remove

  Scenario: Verify social media buttons are working
    When I click "FaceBook" button
    Then Title of the page should contain "Facebook"
    When I click "LinkedIn" button
    Then Title of the page should contain "LinkedIn"
    When I click "Twitter" button
    Then Title of the page should contain "Twitter"
#  @scenarioOutline
#  Scenario Outline: Verify social media buttons are working
#    When I click "<link page>" button
#    Then Title of the page should contain "<page title>"
#    Examples:
#      | link page | page title |
#      | FaceBook  | Facebook   |
#      | LinkedIn  | LinkedIn   |
#      | Twitter   | Twitter    |