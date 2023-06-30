package com.kodilla.good.patterns.food4you;

import java.util.Objects;

public class Product {
    private String productName;
    private double price;
    private int barcode;

    public Product(String productName, double price, int barcode) {
        this.productName = productName;
        this.price = price;
        this.barcode = barcode;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public int getBarcode() {
        return barcode;
    }

    @Override
    public String toString() {
        return "Product: " + productName +
                "\nprice: " + price +
                "\nbarcode " + barcode + "\n";
    }
}
