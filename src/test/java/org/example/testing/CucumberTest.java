package org.example.testing;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        //dove si trova il gherkin
        features = "src/test/java",
        //dove si torovano gli step java
        glue = "org.example.calculator",
        plugin = {"json:target/cucumber.json"}
)
public class CucumberTest {
}
