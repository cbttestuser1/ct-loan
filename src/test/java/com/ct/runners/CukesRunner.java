package com.ct.runners;

import org.junit.runner.RunWith;

/*
    * Please do not make changes to cucumber options without devUp's notice
    * Please follow naming convention
    */

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

<<<<<<< HEAD
@RunWith(Cucumber.class)
@CucumberOptions(features = "./src/test/resources/features/", tags = "@Bibek", glue = "com.ct.stepDefinitions", plugin = {
		"html:target/cucumber-reports", "json:target/cucumber.json" }, dryRun = false)
=======


@RunWith(Cucumber.class)   
@CucumberOptions(
		features = "./src/test/resources/features/", 
		//tags = {"~@PositiveTesting", "@NegativeTesting"},
		//tags = "@NegativeAndPostivieTesting",
        glue = "com.ct.stepDefinitions", 
        plugin = {"html:target/cucumber-reports", "json:target/cucumber.json" }, 
        dryRun = false
        )
//github.com/cbttestuser1/ct-loan.git


public class CukesRunner {

}
