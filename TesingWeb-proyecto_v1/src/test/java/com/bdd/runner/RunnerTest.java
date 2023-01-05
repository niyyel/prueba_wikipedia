package com.bdd.runner;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(plugin = {"html:target/build/cucumber-html-report", "pretty:target/build/cucumber-pretty.txt",
            "json:target/build/cucumber.json"},
            junit = {"--step-notifications"},
            features = {"src/test/resources/web"},
            glue = {"com.bdd.stepdefinition"},
            tags = {"@demo_search_google"}
)

public class RunnerTest {
}
