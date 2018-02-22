package com.kodilla.good.patterns.challenges.shop;

public class OrderDTO {

    public Customer customer;
    public boolean isOrdered;

    public OrderDTO(final Customer customer, final boolean isOrdered) {
        this.customer = customer;
        this.isOrdered = isOrdered;
    }

    public Customer getCustomer() {
        return customer;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}
