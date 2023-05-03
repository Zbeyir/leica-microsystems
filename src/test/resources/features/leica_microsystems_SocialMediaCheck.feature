@wip
Feature: Default


  Scenario: Check Linkedin Links of leica microsystems
    When user is on the leica microsystems Page
    And user accept Cookies
    And user click linkedin Link
    Then check user on the linkedin WebSite


  Scenario: Check instagram Links of leica microsystems
    When user is on the leica microsystems Page
    And user accept Cookies
    And user click instagram Link
    Then check user on the instagram WebSite


  Scenario: Check YouTube Links of leica microsystems
    When user is on the leica microsystems Page
    And user accept Cookies
    And user click YouTube Link
    Then check user on the YouTube WebSite

