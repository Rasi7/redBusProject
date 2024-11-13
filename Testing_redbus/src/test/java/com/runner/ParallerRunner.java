package com.runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(glue = { "com.stepDefinition", "com.hook" }, features = { "./src/test/resources/redbusfeature" }, plugin = {
		"rerun:target/rerun.txt", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		"junit:reports/Cucumber.xml" })

public class ParallerRunner extends AbstractTestNGCucumberTests {
	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios() {
		System.setProperty("dataproviderthreadcount", "2");
		return super.scenarios();
	}
}
