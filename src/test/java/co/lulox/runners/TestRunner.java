package co.lulox.runners;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberSerenityRunner;
import org.junit.runner.RunWith;

@RunWith(CucumberSerenityRunner.class)
@CucumberOptions(
        features = "src/test/resources/features/ChatbotTest.feature",
        glue = "co.lulox.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class TestRunner {
}
