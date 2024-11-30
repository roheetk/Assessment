Feature: Software Testing Board

  @SignUpSignIn
  Scenario: User should be able to create an account successfully
    Given User navigates to software testing board website "https://magento.softwaretestingboard.com/"
    When User clicks "Create an Account" link
    And Adds "First Name"
    And Adds "Last Name"
    And Adds "Email"
    And Adds "Password"
    And Adds "Confirm Password"
    And Clicks button "Create an Account"
    Then User should see the text "Thank you for registering with Main Website Store."
    When User logs out
    And User clicks "Sign In" link
    And Adds user id "Email"
    And Adds "Password"
    And Signs in
    Then User should see the text "Welcome"
