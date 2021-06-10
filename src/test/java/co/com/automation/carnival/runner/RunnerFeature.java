package co.com.automation.carnival.runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features = "src/test/resources/features"
		,tags = "@UserStory1"
		,snippets = SnippetType.CAMELCASE
		,glue = "co.com.automation.carnival")

public class RunnerFeature {
	
}

