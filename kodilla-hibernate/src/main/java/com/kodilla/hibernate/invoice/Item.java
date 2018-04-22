package com.kodilla.hibernate.invoice;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Entity
public final class Item {

    @Id
    @GeneratedValue
    private Long id;

    private BigDecimal price;

    private int quantity;

    private BigDecimal value;

    @ManyToOne
    @JoinColumn
    private Product product;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn
    private Invoice invoice;

    public Item() {
    }

    public Item(BigDecimal price, int quantity) {
        this.price = price;
        this.quantity = quantity;
        this.value = price.multiply(new BigDecimal(quantity));
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public Product getProduct() {
        return product;
    }

    public Long getId() {
        return id;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    private void setId(Long id) {
        this.id = id;
    }

    private void setPrice(BigDecimal price) {
        this.price = price;
    }

    private void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    private void setValue(BigDecimal value) {
        this.value = value;
    }
}