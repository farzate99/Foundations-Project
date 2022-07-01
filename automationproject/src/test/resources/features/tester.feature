Feature: Testers should be able to update defects so they can monitor their progress

  Scenario: update from pending to accepted
    Given   the tester is on the tester homepage
    When    the tester selects accepted from a dropdown list
    When    the tester clicks submit
    Then    the tester receives a popup saying updated

  Scenario: update from pending to declined
    Given   the tester is on the tester homepage
    When    the tester selects declined from a dropdown list
    When    the tester clicks submit
    Then    the tester receives a popup saying updated


  Scenario: update from accepted to fixed
    Given    the tester is on the tester homepage
    When     the tester selects fixed from a dropdown list
    When     the tester clicks submit
    Then     the tester receives a popup saying updated

  Scenario: update status from accepted to rejected
    Given   the tester is on the tester homepage
    When    the tester selects rejected from a dropdown list
    When    the tester clicks submit
    Then    the tester receives a popup saying updated

  Scenario: update status from accepted to shelved
    Given   the tester is on the tester homepage
    When    the tester selects shelved from a dropdown list
    When    the tester clicks submit
    Then    the tester receives a popup saying updated
