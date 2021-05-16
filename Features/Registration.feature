Feature: Registration

  Scenario: Positive login case
    Given User is on imdbpage
    And User clicks on create account link
    When User enters the "abc" "so123@gmail.com" "123456" "123456"
    And User enters signup button
    And User enters the captacha
    And clicks on Continue
    And User enters the OTP and clicks on create
    Then User is directed to homepage
