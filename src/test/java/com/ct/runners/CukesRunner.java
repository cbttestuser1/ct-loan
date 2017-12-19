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
        //tags = "@Length", 
        //glue = "com.ct.stepDefinitions", 

=======
		tags="@SmokeTest",
		glue = "com.ct.stepDefinitions", 

        //tags = "@Length", 
        //glue = "com.ct.stepDefinitions",
>>>>>>> branch 'CLoan' of https://github.com/cbttestuser1/ct-loan.git
        //tags = {"~@PositiveTesting", "@NegativeTesting"},
<<<<<<< HEAD
		tags = "@NegativeAndPostivieTesting",
        glue = "com.ct.stepDefinitions", 

=======
		//tags = "@NegativeAndPostivieTesting",
       // glue = "com.ct.stepDefinitions", 
//github.com/cbttestuser1/ct-loan.git
//github.com/cbttestuser1/ct-loan.git
>>>>>>> branch 'CLoan' of https://github.com/cbttestuser1/ct-loan.git
        plugin = {"html:target/cucumber-reports", "json:target/cucumber.json" }, 
        dryRun = false
        )

public class CukesRunner {

}
