package com.liseth2810.eribank.tasks;

import com.liseth2810.eribank.models.RegisterSendPayment;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;

import static com.liseth2810.eribank.userinterface.SendPaymentPage.*;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static net.serenitybdd.screenplay.Tasks.instrumented;



public class SendPayment implements Task {

    private RegisterSendPayment form;

    public SendPayment(RegisterSendPayment form){
        this.form = form;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Enter.theValue(form.getPhone()).into(TXT_PHONE),
                Enter.theValue(form.getName()).into(TXT_NAME),
                Click.on(SELECTOR),
                Click.on(BTN_SELECT_COUNTRY),
                Click.on(LIST_COUNTRY),
                Click.on(BTN_SEND_PAYMENT)
        );

    }

    public static SendPayment RegisterSend(RegisterSendPayment form){
        return instrumented(SendPayment.class, form);
    }
}
