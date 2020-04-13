package com.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"@src\\test\\resources\\rerun\\failedScenarios.txt"}, glue= {"com.stepdefinition"}, monochrome=true)
public class ReRunner {

}
