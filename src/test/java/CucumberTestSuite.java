package test.java;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        // plugin = {"json:target/cucumber-parallel/tm4j_result_2.json"},
        features = "src/test/java/features"
//        features = "classpath:features",
//        tags = {"@postpaidService"}


)

public class CucumberTestSuite {
    
}
