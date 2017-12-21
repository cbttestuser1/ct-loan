package com.ct.runners;

import org.junit.runner.RunWith;

/*
    * Please do not make changes to cucumber options without devUp's notice
    * Please follow naming convention
    */

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "./src/test/resources/features",
//tags = "@SmokeTest", //
tags = "@CTL_30", 
		glue = "com.ct.stepDefinitions", plugin = { "html:target/cucumber-reports",
				"json:target/cucumber.json" }, dryRun = false)

public class CukesRunner {

}
