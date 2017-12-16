package com.ct.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)   // Please do not make changes to cucumber options without devUp's notice
@CucumberOptions(
		features = "./src/test/resources/features/", 
        tags = "@SmokeTest", 
        glue = "com.ct.stepDefinitions", 
        plugin = {"html:target/cucumber-reports", "json:target/cucumber.json" }, 
        dryRun = false
        )

public class CukesRunner {

}
