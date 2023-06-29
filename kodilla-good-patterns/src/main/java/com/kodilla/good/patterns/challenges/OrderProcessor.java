package com.kodilla.good.patterns.challenges;

public class OrderProcessor {
    private OrderDatabase orderDatabase;
    private OrderService orderService;
    private ShippingService shippingService;

    public OrderProcessor(final OrderDatabase orderDatabase,
                          final OrderService orderService, final ShippingService shippingService) {
        this.orderDatabase = orderDatabase;
        this.orderService = orderService;
        this.shippingService = shippingService;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        boolean isOrdered = orderService.order(orderRequest.getUserShop(), orderRequest.getProduct());
        if (isOrdered) {
            shippingService.shipping(orderRequest.getUserShop(), orderRequest.getProduct());
            orderDatabase.createAnOrder(orderRequest.getUserShop(), orderRequest.getProduct());
            return new OrderDto(orderRequest.getUserShop(), true);
        } else {
            return new OrderDto(orderRequest.getUserShop(), false);
        }
    }
}
