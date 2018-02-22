package com.kodilla.good.patterns.challenges.shop;

public class BookOrderRepository implements OrderRepository {
    @Override
    public boolean createOrder(OrderRequest orderRequest) {
        return false;
    }
}
