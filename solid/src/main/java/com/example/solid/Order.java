package com.example.solid;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private final List<AbstractItem> items;
    private BigDecimal totalPrice;
    private final PriceCalculator priceCalculator;

    Order() {
        this.items = new ArrayList<>();
        this.totalPrice = BigDecimal.ZERO;

        this.priceCalculator = new PriceCalculator();
    }

    public void addItem(AbstractItem item) {
        this.items.add(item);
        calculateTotalPrice(item);
    }

    private void calculateTotalPrice(AbstractItem item) {
//        this.totalPrice = this.totalPrice.add(item.getPrice());
        this.totalPrice = priceCalculator.calculateTotalPrice(this.totalPrice, item);
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }
}
