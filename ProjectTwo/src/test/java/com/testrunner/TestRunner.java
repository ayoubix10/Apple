package com.testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(
		
		features = "Feature", 
		// copy the feature folder
		glue = "com.stepdefination" 
		// copy the step def package
		
		
		)



public class TestRunner extends AbstractTestNGCucumberTests { //first extend AbstractTestNGCucumberTests
	
	

}
