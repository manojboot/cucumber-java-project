package com.example.testrunners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/com/example/features",
		glue = "com.example.feature.stepdefinition",
		plugin = {"pretty"},
		tags = {"@ListofMaps"},
		monochrome = true,
		dryRun = false )
public class MenuManagementTest {

}
