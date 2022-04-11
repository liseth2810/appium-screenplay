package com.liseth2810.eribank.stepdefinitions;

import com.liseth2810.eribank.models.RegisterSendPayment;
import com.liseth2810.eribank.tasks.Login;
import com.liseth2810.eribank.tasks.MakePayment;
import com.liseth2810.eribank.tasks.SendPayment;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class SendPaymentStepDefinitions {

    @Before
    public void setStage () {

        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Liseth");
    }

    @Given("^I login with username and password$")
    public void iLoginWithUsernameAndPassword(List<Map<String, String>> user) throws Throwable {
        theActorInTheSpotlight().wasAbleTo(Login.the(user.get(0)));
    }

    @Given("^click on make payment$")
    public void clickOnMakePayment() {
        theActorInTheSpotlight().attemptsTo(MakePayment.inTheApp());
    }

    @When("^you fill out the form$")
    public void youFillOutTheForm(List<RegisterSendPayment>info) {
        info.forEach(data->{
            theActorInTheSpotlight().attemptsTo(
                    SendPayment.RegisterSend(data));
        });
    }

    @When("^confirm send payment$")
    public void confirmSendPayment() {

    }

    @Then("^send payment is successful$")
    public void sendPaymentIsSuccessful() {

    }
}
