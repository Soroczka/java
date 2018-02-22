package com.kodilla.good.patterns.challenges.shop;

import java.time.LocalDateTime;

public class OrderRequestRetriever {

    public OrderRequest retrieve(){

        Customer customer = new Customer("John", "Smith", "johnsmith@gmail.com");
        Product product = new Product("Shoes", "Fancy shoes...", 159.90);
        LocalDateTime dateOfOrder = LocalDateTime.of(2018, 1, 12, 14, 5);
        LocalDateTime dateOfDelivery = LocalDateTime.of(2018, 1, 12, 14, 1);

        return new OrderRequest(customer, product, dateOfOrder, dateOfDelivery);
    }

}
