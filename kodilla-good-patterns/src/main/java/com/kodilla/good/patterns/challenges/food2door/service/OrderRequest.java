package com.kodilla.good.patterns.challenges.food2door.service;

import com.kodilla.good.patterns.challenges.food2door.*;

import java.time.LocalDateTime;

public class OrderRequest {
    private final Customer customer;
    private final Product product;
    private final LocalDateTime dateOfOrder;

    public OrderRequest(final Customer customer, final Product product, final LocalDateTime dateOfOrder) {
        this.customer = customer;
        this.product = product;
        this.dateOfOrder = dateOfOrder;
    }

    public Customer getCustomer() {
        return customer;
    }
}
