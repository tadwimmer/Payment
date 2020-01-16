package com.imhotek.payment.model;

import java.time.LocalDateTime;

public interface Payment {

    LocalDateTime getPostedDae();
    Money getMoney();
}
