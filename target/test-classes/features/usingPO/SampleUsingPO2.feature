@regression
Feature: Introduction to cucumber part 2
  As a test engineer
  I want to be able to write and execute a scenario with parameters

  Scenario: a new scenario 1 with regex
    Given I am on age page using PO
    When I enter name: "Ann" using PO
    And I enter age: 5 using PO
    And I click submit age using PO
    Then I see message: "Hello, Ann, you are a kid" using PO

  Scenario: a new scenario 2 with regex
    Given I open age page using PO
    When I enter name: "Bob" using PO
    And I enter age: 61 using PO
    And I click submit age using PO
    Then I see message: "Hello, Bob, you are an adult" using PO
