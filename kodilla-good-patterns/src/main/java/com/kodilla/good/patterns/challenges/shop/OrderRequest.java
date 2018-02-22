package com.kodilla.good.patterns.challenges.shop;

import java.time.LocalDateTime;

public class OrderRequest {

    private final Customer customer;
    private final Product product;
    private final LocalDateTime dateOfOrder;
    private final LocalDateTime dateOfDelivery;

    public OrderRequest(final Customer customer, final Product product,
                        final LocalDateTime dateOfOrder, final LocalDateTime dateOfDelivery) {
        this.customer = customer;
        this.product = product;
        this.dateOfOrder = dateOfOrder;
        this.dateOfDelivery = dateOfDelivery;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Product getProduct() {
        return product;
    }

    public LocalDateTime getDateOfOrder() {
        return dateOfOrder;
    }

    public LocalDateTime getDateOfDelivery() {
        return dateOfDelivery;
    }
}
