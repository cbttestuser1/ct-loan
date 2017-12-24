package com.ct.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/*
 * Please do not make changes to cucumber options without devUp's notice
 * Please follow naming convention
 */

@RunWith(Cucumber.class)
@CucumberOptions(features = "./src/test/resources/features/", tags = "@Smoke", glue = "com.ct.stepDefinitions", plugin = {
		"html:target/cucumber-reports", "json:target/cucumber.json" }, dryRun = false)

public class CukesRunner {

}
