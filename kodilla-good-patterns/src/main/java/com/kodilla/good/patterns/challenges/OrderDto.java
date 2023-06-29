package com.kodilla.good.patterns.challenges;

public class OrderDto {
    private UserShop userShop;
    private boolean isOrdered;

    public OrderDto(final UserShop userShop, final boolean isOrdered) {
        this.userShop = userShop;
        this.isOrdered = isOrdered;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}
