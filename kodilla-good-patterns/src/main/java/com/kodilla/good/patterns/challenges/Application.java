package com.kodilla.good.patterns.challenges;

public class Application {
    public static void main(String[] args) {
        UserShop user1 = new UserShop("Marek", "Kowalski", "Gdynia ul. Prosta 77");
        Product product1 = new Product("Kość", 1234123, 2, 4.99);

        OrderProcessor orderProcessor = new OrderProcessor(new ProductOrderDatabase(),
                new ProductOrderService(), new PaymentForTheOrder());
        orderProcessor.process(new OrderRequest(user1, product1));

    }
}
