package com.kodilla.good.patterns.challenges.shop;

public class Product {

    private final String nameOfProduct;
    private final String description;
    private final double price;

    public Product(final String nameOfProduct, final String description, final double price) {
        this.nameOfProduct = nameOfProduct;
        this.description = description;
        this.price = price;
    }

    public String getNameOfProduct() {
        return nameOfProduct;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "nameOfProduct='" + nameOfProduct + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}
