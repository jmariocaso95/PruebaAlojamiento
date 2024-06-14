package co.com.certification.proyectoprueba.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src\\test\\resources\\features\\vuelos.feature",
        glue = "co.com.certification.proyectoprueba.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class VueloRunner {
}
