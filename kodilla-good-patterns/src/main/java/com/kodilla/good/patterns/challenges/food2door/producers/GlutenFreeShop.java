package com.kodilla.good.patterns.challenges.food2door.producers;

import com.kodilla.good.patterns.challenges.food2door.Producer;
import com.kodilla.good.patterns.challenges.food2door.Product;

import java.util.List;

public class GlutenFreeShop {

    private Producer producer;
    private List<Product> productList;

    public GlutenFreeShop(Producer producer, List<Product> productList) {
        this.producer = producer;
        this.productList = productList;
    }
}
