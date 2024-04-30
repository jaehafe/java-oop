package com.example.solid;

import java.math.BigDecimal;

public abstract class AbstractItem {
    private final String name;
    private final BigDecimal price;
    private final BigDecimal discount;

    protected AbstractItem(String name, BigDecimal price, BigDecimal discount) {
        this.name = name;
        this.price = price;
        this.discount = discount;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public BigDecimal getDiscount() {
        return discount;
    }
}
