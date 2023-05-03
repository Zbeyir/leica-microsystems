package com.leica_microsystems.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "com/leica_microsystems/step_definitions",
        features = "@target/rerun.txt"

)


public class FailedTestRunner {


}
