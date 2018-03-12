package com.kodilla.good.patterns.challenges.food2door;

public class OrderDTO {

    public Customer customer;
    public boolean isOrdered;

    public OrderDTO(final Customer customer, final boolean isOrdered) {
        this.customer = customer;
        this.isOrdered = isOrdered;

    }
}