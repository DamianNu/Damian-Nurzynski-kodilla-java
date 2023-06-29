package com.kodilla.good.patterns.challenges;

public class ProductOrderDatabase implements OrderDatabase {

    @Override
    public boolean createAnOrder(final UserShop userShop, final Product product) {
        System.out.println("Add an order to the database of orders ready for fulfillment.");
        return true;
    }
}
