package com.ct.runners;

import org.junit.runner.RunWith;

/*
    * Please do not make changes to cucumber options without devUp's notice
    * Please follow naming convention
    */

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "./src/test/resources/features/", tags = "@Bibek,@SmokeTest,@Cloan127,@Smoke,@RuskK,@RKTesing0,@RKTesing1,@RKTesing2,@RKTesing3,@RKTesing4,@RKTesing5,@RKTesing6,@RKTesting7,@RKTesing8,@RKTesing9,@RKTesing10,@RKTesting122,@RKTesting114,@page3,@Ruslan,@Bibek1,@happypath,@CTL-124,@page1", glue = "com.ct.stepDefinitions", plugin = {
		"html:target/cucumber-reports", "json:target/cucumber.json" }, dryRun = false)

public class CukesRunner {

}
