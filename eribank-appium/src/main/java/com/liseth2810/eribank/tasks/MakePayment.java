package com.liseth2810.eribank.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import java.util.Map;

import static com.liseth2810.eribank.userinterface.MakePaymentPage.BTN_MAKE_PAYMENT;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class MakePayment implements Task {

    public static MakePayment inTheApp(){ return instrumented(MakePayment.class);}

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_MAKE_PAYMENT)
        );
    }
}
