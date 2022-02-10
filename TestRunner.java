package cucumberOptions;

import org.junit.runner.RunWith;

@RunWith(CucumberOptions.class)
@CucumberOptions(
		features = "src/test/java/features/Login.feature",
		glue = "stepDefintion"
		)
public class TestRunner {

}
