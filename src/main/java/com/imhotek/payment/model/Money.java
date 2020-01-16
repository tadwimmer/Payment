package com.imhotek.payment.model;


import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class Money {

    private final Currency currency;

    private final BigDecimal amount;

    private final NumberFormat format;

    public Money(BigDecimal amount) {
        this.amount = amount;
        this.currency = Currency.getInstance(Locale.getDefault());
        this.format = NumberFormat.getInstance(Locale.getDefault());
    }

    public Money(BigDecimal amount, String currencyCode) {
        this.amount = amount;
        this.currency = Currency.getInstance(currencyCode);
        this.format = NumberFormat.getInstance(Locale.getDefault());
    }

    public Money(BigDecimal amount, Locale locale) {
        this.amount = amount;
        this.currency = Currency.getInstance(locale);
        this.format = NumberFormat.getInstance(locale);
    }

    public String toString() {
         String amountStr = format.format(amount);
        if(currency.getSymbol().equals(currency.getCurrencyCode())) {
            return amountStr + " " + currency.getSymbol(Locale.getDefault());
        } else {
            return currency.getSymbol(Locale.getDefault()) + " " + amountStr;
        }
    }

    public static void main(String[] args) {
//        for (Currency currency :Currency.getAvailableCurrencies()) {
//            System.out.println(currency.toString());
//            StringBuilder builder = new StringBuilder(currency.getDisplayName());
//           builder.append(" " + currency.getCurrencyCode());
//           builder.append(" " + currency.getDefaultFractionDigits());
//           builder.append(" " + currency.getNumericCodeAsString());
//           builder.append(" " + currency.getSymbol());
//
//           System.out.println(builder.toString());
//           System.out.println("________________________________________");
//
//        }

        Money money = new Money(new BigDecimal(1_000_000.00));
        System.out.println(money.toString());

        money = new Money(new BigDecimal(50000.00), Locale.KOREA);
        System.out.println(money.toString());

        money = new Money(new BigDecimal(1_000_000.00), "GYD");
        System.out.println(money.toString());
    }
}
