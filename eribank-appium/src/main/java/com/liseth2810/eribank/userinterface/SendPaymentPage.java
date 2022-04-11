package com.liseth2810.eribank.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class SendPaymentPage {

    public static final Target TXT_PHONE = Target.the("phone field").located(By.id("phoneTextField"));
    public static final Target TXT_NAME = Target.the("name field").located(By.id("nameTextField"));
    public static final Target SELECTOR = Target.the("selector amount").locatedBy("//android.widget.SeekBar[@text=\"31.0\"]");
    public static final Target BTN_SELECT_COUNTRY = Target.the("button select country").located(By.id("countryButton"));
    public static final Target LIST_COUNTRY = Target.the("select country").locatedBy("//android.widget.TextView[@text='USA']");
    public static final Target BTN_SEND_PAYMENT = Target.the("button send payment").located(By.id("sendPaymentButton"));
}
