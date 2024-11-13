package com.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(glue = {"com.stepDefinition","com.hook"},
features= {"./src/test/resources/redbusfeature"},
plugin={"rerun:target/rerun.txt","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		"junit:reports/Cucumber.xml"})
public class CucumberRunner extends AbstractTestNGCucumberTests {
	
}
