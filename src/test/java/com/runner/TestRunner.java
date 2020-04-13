package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.base.JVMReport;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src\\test\\resources\\features\\tags.feature" }, glue = {
		"com.stepdefinition" }, monochrome = true, dryRun = false, plugin = {
				"json:src\\test\\resources\\reports\\Cucumber.json",
				"rerun:src\\test\\resources\\rerun\\failedScenarios.txt" }, tags= {"@tag1"})
public class TestRunner {

	@AfterClass
	public static void reports() {

		JVMReport.generateJVMReports(System.getProperty("user.dir") + "\\src\\test\\resources\\reports\\Cucumber.json");

	}

}
