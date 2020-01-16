package com.imhotek.model;

import com.imhotek.enums.Currency;

import java.math.BigDecimal;

public interface Payment extends Model {

    Currency currency();
    BigDecimal amount();

}
