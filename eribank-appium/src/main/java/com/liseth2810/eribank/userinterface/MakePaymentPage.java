package com.liseth2810.eribank.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MakePaymentPage {

    public final static Target BTN_MAKE_PAYMENT = Target.the("button make payment").located(By.id("makePaymentButton"));
}
