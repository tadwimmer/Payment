package com.imhotek.controller;

import com.imhotek.model.Payment;

public interface PaymentProcessor {

    void setNextProcessor(PaymentProcessor paymentProcessor);
    Payment processPayment(Payment payment);

}
