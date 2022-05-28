package org.example.runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import io.cucumber.testng.AbstractTestNGCucumberTests;


@CucumberOptions
        (
                features = "src/main/resources/features",
                glue = {"stepDefinitions"},
                plugin = {"pretty",
                "html:target/cucumber.html",
                "junit:target/cukes.xml",
                "return:target/return.txt"},
                tags = "@smoke"
        )

public class testRunner extends AbstractTestNGCucumberTests {
}

