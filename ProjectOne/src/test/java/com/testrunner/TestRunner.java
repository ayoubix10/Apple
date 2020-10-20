package com.testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		
		
		features = "CucumberFeature",
		glue = "com.stepdefination"
		
		)

public class TestRunner extends AbstractTestNGCucumberTests{

}

