package com.kodilla.good.patterns.food4you;

public class Application {
    public static void main(String[] args) {
        Product product1 = new Product("Jajka", 0.9, 4040121);
        Product product2 = new Product("Mąka", 2.5, 4040111);
        Product product3 = new Product("Chleb", 4.65, 4040555);

        Order order1 = new Order(new ExtraFoodShop(), product1, 15, 3);
        Order order2 = new Order(new GlutenFreeShop(), product2, 35, 7);
        Order order3 = new Order(new HealthyShop(), product3, 5, 3);

        DeliveryAndOrderProcess deliveryAndOrderProcess = new DeliveryAndOrderProcess();
        deliveryAndOrderProcess.process(order1);
        deliveryAndOrderProcess.process(order2);
        deliveryAndOrderProcess.process(order3);

    }
}
