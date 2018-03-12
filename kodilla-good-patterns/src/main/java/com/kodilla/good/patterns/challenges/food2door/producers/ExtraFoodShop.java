package com.kodilla.good.patterns.challenges.food2door.producers;

import com.kodilla.good.patterns.challenges.food2door.Producer;
import com.kodilla.good.patterns.challenges.food2door.Product;

import java.util.List;

public class ExtraFoodShop{

    private Producer producer;
    private List<Product> productList;

    public ExtraFoodShop(Producer producer, List<Product> productList) {
        this.producer = producer;
        this.productList = productList;
    }

}
