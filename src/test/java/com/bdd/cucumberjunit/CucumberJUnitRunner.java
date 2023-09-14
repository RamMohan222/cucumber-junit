package com.bdd.cucumberjunit;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

/*
 * This class executed by JUnit runner
 */
// @formatter:off
@RunWith(Cucumber.class)
@CucumberOptions(
		snippets = SnippetType.CAMELCASE,
		features = { "src/test/resources/features" }, 
		glue = { "com.bdd.cucumberjunit.steps"}, 
		plugin = {"pretty", "html:target/cucumber.html"})
public class CucumberJUnitRunner {
	
}
// @formatter:on