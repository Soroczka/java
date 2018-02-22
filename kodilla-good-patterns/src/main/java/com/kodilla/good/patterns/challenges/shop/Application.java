package com.kodilla.good.patterns.challenges.shop;

public class Application {

    public static void main(String[] args) {

        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        ProductOrderService productOrderService = new ProductOrderService(new MessageService(),
                new BookOrderService(), new BookOrderRepository());

        productOrderService.process(orderRequest);


    }

}
