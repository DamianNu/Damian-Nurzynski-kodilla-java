package com.kodilla.good.patterns.challenges;

import java.io.Serializable;

public class Product implements Serializable {
    private String productName;
    private long idNumber;
    private int value;
    private double price;


    public Product(String productName, long idNumber, int value, double price) {
        this.productName = productName;
        this.idNumber = idNumber;
        this.value = value;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public double getIdNumber() {
        return idNumber;
    }

    public int getValue() {
        return value;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "  ( Product: >" + productName +
                " ), ( ID: " + idNumber +
                " ), ( Value: >" + value +
                ") , ( Price: >" + price +
                ")\n";
    }
}
