package com.kodilla.good.patterns.food4you;

public class Order {
    private Producer producer;
    private Product product;
    private int quantity;
    private int DeliveryTime;

    public Order(Producer producer, Product product, int quantity, int deliveryTime) {
        this.producer = producer;
        this.product = product;
        this.quantity = quantity;
        this.DeliveryTime = deliveryTime;
    }

    public Producer getProducer() {
        return producer;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getDeliveryTime() {
        return DeliveryTime;
    }

    @Override
    public String toString() {
        return "Order:\n" +
                producer.toString() +
                "\nproduct: " + product +
                "\nquantity: " + quantity +
                "\ndelivery time " + DeliveryTime +
                " days";
    }
}
