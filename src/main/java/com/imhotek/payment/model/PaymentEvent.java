package com.imhotek.payment.model;

import java.time.LocalDate;

public interface PaymentEvent {

    LocalDate getEventDate();
}
