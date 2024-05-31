package org.stepdefinition;

import org.base.BaseClass;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HooksClass extends BaseClass {
	
	@Before
	//precondition
	private void precondition() {
		launchBrowser();
		WindowMaximize();
	}
	
	@After
	//postcondition
	private void postCondition() {
		closeEntireBrowser();

	}
}
