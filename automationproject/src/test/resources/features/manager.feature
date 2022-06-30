Feature: Users should be able to assign defects to testers

    Scenario: As a manager I want to assign bugs to testers so the bugs are checked

        Given   the manager is on the manager page
        When    the manager enters the defect
        And     the manager selects a tester
        And     the manager clicks the assign button
        Then    the manager receives a popup stating that the bug was assigned