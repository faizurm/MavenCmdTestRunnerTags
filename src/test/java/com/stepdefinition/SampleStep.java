package com.stepdefinition;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SampleStep {

	

@Given("I want to write a step with precondition")
public void i_want_to_write_a_step_with_precondition() {

	System.out.println("tag1");
}

@Given("some other precondition")
public void some_other_precondition() {
    // Write code here that turns the phrase above into concrete actions
	Assert.assertTrue("precondition ", false);
}

@When("I complete action")
public void i_complete_action() {
    // Write code here that turns the phrase above into concrete actions
    
}

@When("some other action")
public void some_other_action() {
    // Write code here that turns the phrase above into concrete actions
    
}

@When("yet another action")
public void yet_another_action() {
    // Write code here that turns the phrase above into concrete actions
    
}

@Then("I validate the outcomes")
public void i_validate_the_outcomes() {
    // Write code here that turns the phrase above into concrete actions
    
}

@Then("check more outcomes")
public void check_more_outcomes() {
    // Write code here that turns the phrase above into concrete actions
    
}

@Given("I want to write a step with {string}")
public void i_want_to_write_a_step_with(String string) {
    // Write code here that turns the phrase above into concrete actions
    System.out.println("tag2 and 1");
}

@When("I check for the {string} in step")
public void i_check_for_the_in_step(String string) {
    // Write code here that turns the phrase above into concrete actions
    
}

@Then("I verify the {string} in step")
public void i_verify_the_in_step(String string) {
    // Write code here that turns the phrase above into concrete actions
 System.out.println("jim");   
}
}
