package com.ceros.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "html:target/cucumber-report2.html",
        features = "src/test/resources/features",
        glue = "com/ceros/step_definitions",
        dryRun = true,
        tags = "@wip"
)

public class CukesRunner {


}
