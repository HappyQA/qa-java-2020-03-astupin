package cases;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java",
        glue = "steps",
        tags = "@withdrawal",
        dryRun = false,
//        strict = false,
        snippets = CucumberOptions.SnippetType.UNDERSCORE
//        name = "^Успешное|Успешная.*"
)
class RunnerTest {
}