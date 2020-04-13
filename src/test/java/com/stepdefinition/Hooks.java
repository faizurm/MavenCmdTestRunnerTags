package com.stepdefinition;

import com.base.LibGlobal;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends LibGlobal {

	@Before
	public void beforeScenario() {
		getDriver();

	}

	@After
	public void afterScenario() {

	}

}
