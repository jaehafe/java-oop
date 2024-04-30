package com.example.solid;

import java.math.BigDecimal;

public class Shoe extends AbstractItem {
    private final int size;
    private final String brand;
    private final String color;

    public Shoe(String name, BigDecimal price, BigDecimal discount, int size, String brand, String color) {
        super(name, price, discount);
        this.size = size;
        this.brand = brand;
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }
}
