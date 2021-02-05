package com.test.examen.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/RegistrarUsuario.feature",
        glue = "com.test.examen",
        tags = { "" },
        snippets = SnippetType.CAMELCASE
)
//@CucumberOptions(features = "src/test/resources/features/FlujoCompras.feature",glue = "com.test.examen", tags = { "" },snippets = SnippetType.CAMELCASE)
public class Runner {

}
