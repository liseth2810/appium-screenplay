package com.liseth2810.eribank.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/sendpayment.feature",
        glue = "com.liseth2810.eribank.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE)

public class SendPayment {
}
