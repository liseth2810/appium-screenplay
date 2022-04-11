package com.liseth2810.eribank.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {

    public final static Target USERNAME = Target.the("username fields").located(By.id("usernameTextField"));
    public final static Target PASSWORD = Target.the("password fields").located(By.id("passwordTextField"));
    public final static Target BTN_LOGIN = Target.the("loginbutton").located(By.id("loginButton"));

}
