package com.demoblaze.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;



@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumbber-report.html",
        "json:target/cucumber.json",
        "rerun:target/rerun.txt"},
        features = "src/test/resources/features",
        glue="com/demoblaze/step_definitions",
        dryRun = false,
        tags = "@www"



)
public class CukesRunner {









}
