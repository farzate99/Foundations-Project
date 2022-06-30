package com.automation.steps;

import com.automation.runner.TestRunner;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ManagerSteps {
    /*
        User agnostic steps below
     */

    @Given("the manager is on the manager page")
    public void the_manager_is_on_the_manager_page() {
        // when telling selenium to get a local file you have to add File:// to the start of the url
        TestRunner.driver.get("File://C:/Users/Dulce/Desktop/Revature/Week4/Login-Automation/Foundations-Project/automationproject/src/test/resources/manager-page.html");
    }
   

    @When("the manager enters the defect")
    public void the_manager_enters_the_defect() {
        TestRunner.manager.enterDefect("App will not load!");
    }

    @And("the manager selects a tester")
    public void the_manager_selects_a_tester() {
        TestRunner.manager.selectTester();
    }

    @And("the manager clicks the assign button")
    public void the_manager_clicks_the_assign_button() {
        TestRunner.manager.clickAssignButton();
    }

    @Then("the manager receives a popup stating that the bug was assigned")
    public void the_manager_receives_a_popup_stating_bug_was_assigned() {
        // String popupText = TestRunner.manager.getPopupText();

        // Assert.assertEquals("data submitted successfully", popupText);
    }
}
