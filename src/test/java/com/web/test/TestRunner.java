package com.web.test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
        plugin = {"pretty", "html:target/reports/cucumber-html-report",
                "json:target/cucumber.json",
        },
        monochrome = true,
        tags = {"@test"},
        features = {"src/test/resources/features"},
        glue = {"com.web.test.StepDefs"}

)
public class TestRunner {
}
