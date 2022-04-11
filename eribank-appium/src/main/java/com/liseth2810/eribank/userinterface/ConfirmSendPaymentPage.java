package com.liseth2810.eribank.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ConfirmSendPaymentPage {

    public static final Target BTN_CONFIRM_SEND = Target.the("button confirm send payment").located(By.id("button1"));
}
