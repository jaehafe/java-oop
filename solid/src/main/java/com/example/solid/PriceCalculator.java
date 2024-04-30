package com.example.solid;

import java.math.BigDecimal;

public class PriceCalculator {
    public BigDecimal calculateTotalPrice(
            BigDecimal totalPrice,
            AbstractItem item
    ) {
        return totalPrice.add(
                item.getPrice()
                        .multiply(BigDecimal.ONE.subtract((item.getDiscount()))));
    }

}
