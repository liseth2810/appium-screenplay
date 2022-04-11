package com.liseth2810.eribank.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.liseth2810.eribank.userinterface.ConfirmSendPaymentPage.BTN_CONFIRM_SEND;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ConfirmSendPayment implements Task {

    public static ConfirmSendPayment ConfInTheApp(){ return instrumented(ConfirmSendPayment.class);}

    @Override
    public <T extends Actor> void performAs(T actor) {
     actor.attemptsTo(
             Click.on(BTN_CONFIRM_SEND)
     );
    }
}
