package com.kodilla.good.patterns.challenges;

public class PaymentForTheOrder implements ShippingService {

    @Override
    public boolean shipping(UserShop userShop, Product product) {
        System.out.println("If there is a confirmation from the bank about the paid product '" +
                product.getProductName() + "'. \nThe shipment will be sent to " + userShop.getUserName() +
                " " + userShop.getSurname() + " to the address: " + userShop.getAddress() + ".");
        return true;
    }
}
