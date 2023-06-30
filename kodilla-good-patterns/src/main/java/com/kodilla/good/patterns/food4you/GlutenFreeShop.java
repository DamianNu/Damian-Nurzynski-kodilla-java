package com.kodilla.good.patterns.food4you;

public class GlutenFreeShop implements Producer {
    private final String name = "Gluten Free Shop";

    public String getName() {
        return name;
    }

    @Override
    public boolean process(Order order) {
        if (order.getProduct().getPrice() * order.getQuantity() >= 150 && order.getDeliveryTime() >= 3 && order.getQuantity() >= 25) {
            System.out.println("\nThe order has been accepted.\n" +
                    "Product " + order.getProduct().getProductName() + " will be sent within " +
                    order.getDeliveryTime() + " days in the amount of " + order.getQuantity() + " pieces.");
            return true;
        } else {
            System.out.println("\nThe order was rejected due to:");
            if (order.getQuantity() < 25) {
                System.out.println("- The quantity of the product ordered is too small");
            }
            if (order.getProduct().getPrice() * order.getQuantity() < 150) {
                System.out.println("- Order value too low");
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
