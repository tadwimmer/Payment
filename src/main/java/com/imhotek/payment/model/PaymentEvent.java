package com.imhotek.payment.model;

import java.time.LocalDateTime;

public interface PaymentEvent {

    public enum EventType {
        OPENED, SUBMITTED, POSTED, REJECTED, CLOSED, REVERSED;
    }

    LocalDateTime getEventDate();
    EventType getEventType();
}
