package com.kodilla.good.patterns.food4you;

public class DeliveryAndOrderProcess {

    public boolean process(Order order) {
        Producer producer = order.getProducer();
        return producer.process(order);
    }

}
