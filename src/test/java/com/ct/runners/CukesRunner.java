package com.ct.runners;

import org.junit.runner.RunWith;

   /*
    * Please do not make changes to cucumber options without devUp's notice
    * Please follow naming convention
    */

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)   
@CucumberOptions(
		features = "./src/test/resources/features/", 
<<<<<<< HEAD
        tags = "@Length", 
        //glue = "com.ct.stepDefinitions", 
=======
        //tags = {"~@PositiveTesting", "@NegativeTesting"},
		tags = "@NegativeAndPostivieTesting",
        glue = "com.ct.stepDefinitions", 
>>>>>>> branch 'CLoan' of https://github.com/cbttestuser1/ct-loan.git
        plugin = {"html:target/cucumber-reports", "json:target/cucumber.json" }, 
        dryRun = true
        )

public class CukesRunner {

}
