package com.imhotek.payment.controller;


import com.imhotek.payment.model.Payment;

public interface PaymentProcessor {

    void setNextProcessor(PaymentProcessor paymentProcessor);
    Payment processPayment(Payment payment);

}
