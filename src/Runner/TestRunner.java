package Runner;

import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@Cucumber.Options(features = "features",glue = {"stepDefinition"})
public class TestRunner {
}
