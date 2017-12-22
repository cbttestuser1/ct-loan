package com.ct.runners;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import com.cucumber.listener.Reporter;

/*
    * Please do not make changes to cucumber options without devUp's notice
    * Please follow naming convention
    */

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "./src/test/resources/features/", tags = "@Test112", glue = "com.ct.stepDefinitions", plugin = {
		"html:target/cucumber-reports", "json:target/cucumber.json",
		"com.cucumber.listener.ExtentCucumberFormatter:output/report.html" }, monochrome = true, dryRun = false)

public class CukesRunner {
	@AfterClass
	public static void tearDown() {
		Reporter.loadXMLConfig(new File("./config.xml"));
		Reporter.setSystemInfo("User", System.getProperty("user.name"));
		Reporter.setSystemInfo("operation System", System.getProperty("os.name"));
		Reporter.setTestRunnerOutput("Automated Test");

	}
}
