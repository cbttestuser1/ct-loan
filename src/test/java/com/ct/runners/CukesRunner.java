package com.ct.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "./src/test/resources/features/", 
        tags = "@Smoke-Test", 
        glue = "com.ct.stepDefinitions", 
        plugin = {"html:target/cucumber-reports", "json:target/cucumber.json" }, 
        dryRun = true)

public class CukesRunner {

}
