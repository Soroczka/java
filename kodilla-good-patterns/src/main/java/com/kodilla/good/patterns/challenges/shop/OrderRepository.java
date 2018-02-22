package com.kodilla.good.patterns.challenges.shop;

public interface OrderRepository {
    boolean createOrder(OrderRequest orderRequest);
}
