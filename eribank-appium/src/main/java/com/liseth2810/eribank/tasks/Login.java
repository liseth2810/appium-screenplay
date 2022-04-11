package com.liseth2810.eribank.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.Map;

import static com.liseth2810.eribank.userinterface.LoginPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Login implements Task {

    private Map<String, String> user;
    public Login(Map<String, String>user){ this.user = user;}

    public static Login the(Map<String, String> user){ return instrumented(Login.class ,user);}

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
        Enter.theValue(user.get("username")).into(USERNAME),
        Enter.theValue(user.get("password")).into(PASSWORD),
                Click.on(BTN_LOGIN)
        );
    }
}
