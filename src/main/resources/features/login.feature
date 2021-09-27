Feature: Login page scenarios

  Scenario:  Verify login options
    Given  I navigate to LoginPage
    When  I input "Username" as "standard_user"
    And  I input "Password" as "secret_sauce"
    And I click Login button
    Then Title of the page should be Swag Labs

#  @scenarioOutline
#  Scenario Outline: Verify Username and Password open web page
#    When I input "<Username>"
#    When I input "<PassWord>"
#    Then Title of the page should be "<page title>"
#    Examples:
#      | Username     | PassWord     | page title          |
#      | standard_user     | Saucedemo     | Swag Labs           |
#      | E-commerce    | E-commerce    | My Store            |
#      | Shopping Cart | Shopping Cart | React Shopping Cart |