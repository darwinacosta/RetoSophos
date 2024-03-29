package pe.wong.www.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/pe.wong.www.features/procesodecompras.feature",
        glue = "pe.wong.www.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)
public class ProcesoDeComprasRunner {
}
