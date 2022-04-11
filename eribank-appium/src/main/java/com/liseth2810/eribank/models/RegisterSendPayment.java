package com.liseth2810.eribank.models;

public class RegisterSendPayment {

    private String phone;
    private String name;
    private String amount;
    private String country;

    public RegisterSendPayment(String phone, String name, String amount, String country) {
        this.phone = phone;
        this.name = name;
        this.amount = amount;
        this.country = country;
    }

    public String getPhone() {
        return phone;
    }

    public String getName() {
        return name;
    }

}
