package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/resource/AppFeatures" }, glue = { "stepdefinations", "appHooks" }, plugin = {
		"pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
// "timeline:test-output-thread/"

}

)

public class MyTestRunner {

}
