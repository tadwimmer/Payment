package com.imhotek.payment.model;

import com.imhotek.payment.enums.PaymentType;

import java.time.LocalDateTime;

public interface Payment extends Model {

    LocalDateTime getPostedDae();
    PaymentType getPaymentType();
    Money getMoney();
}
