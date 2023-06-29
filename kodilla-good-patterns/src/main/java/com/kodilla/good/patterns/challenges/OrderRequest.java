package com.kodilla.good.patterns.challenges;

public class OrderRequest {
    private UserShop userShop;
    private Product product;

    public OrderRequest(final UserShop userShop,final Product product) {
        this.userShop = userShop;
        this.product = product;
    }

    public UserShop getUserShop() {
        return userShop;
    }

    public Product getProduct() {
        return product;
    }
}
