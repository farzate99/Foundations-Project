package com.automation.steps;

import com.automation.runner.TestRunner;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.junit.Test;

public class TesterSteps {
    @Given("the tester is on the tester homepage")
    public void the_tester_is_on_the_tester_homepage() {
        TestRunner.driver.get(
                "File://C:/Users/Dulce/Desktop/Revature/Week4/Login-Automation/Foundations-Project/src/test/resources/tester-page.html");
    }

    @Then("the tester selects accepted from a dropdown list")
    public void the_tester_selects_accepted_from_a_dropdown_list() {
        
        TestRunner.tester.selectPending();
    }

    // @When("the tester clicks submit")
    // public void the_tester_clicks_submit() {
    //     TestRunner.tester.clickSubmitButton();
    // }

    // @Then("the tester receives a popup saying updated")
    // public void the_tester_receives_a_popup_saying_updated() {
    //     // Write code here that turns the phrase above into concrete actions
    //     waitFor(3);
    //     throw new io.cucumber.java.PendingException();
    // }
    // @When("the tester selects accepted from a dropdown list")
    // public void the_tester_selects_accepted_from_a_dropdown_list() {
    // TestRunner.tester.selectPending();
    // }

    // @When("the tester selects declined from a dropdown list")
    // public void the_tester_selects_declined_from_a_dropdown_list() {
    // // Write code here that turns the phrase above into concrete actions
    // throw new io.cucumber.java.PendingException();
    // }

    // @When("the tester selects rejected from a dropdown list")
    // public void the_tester_selects_rejected_from_a_dropdown_list() {
    // // Write code here that turns the phrase above into concrete actions
    // throw new io.cucumber.java.PendingException();
    // }

    // @When("the tester selects shelved from a dropdown list")
    // public void the_tester_selects_shelved_from_a_dropdown_list() {
    // // Write code here that turns the phrase above into concrete actions
    // throw new io.cucumber.java.PendingException();
    // }

    // @When("the tester selects fixed from a dropdown list")
    // public void the_tester_selects_fixed_from_a_dropdown_list() {
    // // Write code here that turns the phrase above into concrete actions
    // throw new io.cucumber.java.PendingException();
    // }
}
