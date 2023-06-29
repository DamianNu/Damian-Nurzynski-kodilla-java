package com.kodilla.good.patterns.challenges;


public class ProductOrderService implements OrderService {

    @Override
    public boolean order(final UserShop userShop, final Product product) {
        System.out.println("Checking if you can order '" + product.getProductName() +
                "' by user: " + userShop.getUserName() + " " + userShop.getSurname());
        return true;
    }
}
