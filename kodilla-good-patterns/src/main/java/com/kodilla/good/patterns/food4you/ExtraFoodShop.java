package com.kodilla.good.patterns.food4you;

public class ExtraFoodShop implements Producer {
    private final String name = "Extra Food Shop";

    public String getName() {
        return name;
    }

    @Override
    public boolean process(Order order) {
        if (order.getQuantity() >= 50 && order.getDeliveryTime() >= 3) {
            System.out.println("\nThe order has been accepted.\n" +
                    "Product " + order.getProduct().getProductName() + " will be sent within " +
                    order.getDeliveryTime() + " days in the amount of " + order.getQuantity() + " pieces.");
            return true;
        } else {
            System.out.println("\nThe order was rejected due to:");
            if (order.getQuantity() < 50) {
                System.out.println("- The quantity of the product ordered is too small");
            }
            if (order.getDeliveryTime() < 3) {
                System.out.println("- Too short time to complete the order");
            }
            return false;
        }
    }

    @Override
    public String toString() {
        return "Producer: " + name;
    }
}


