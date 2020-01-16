package com.imhotek.payment.model;


import java.time.LocalDateTime;
import java.util.List;

public interface Payment extends Model {

    LocalDateTime getPostedDae();
    com.imhotek.enums.PaymentType getPaymentTpype();
    Money getMoney();
    List<PaymentEvent> getEvents();
}
