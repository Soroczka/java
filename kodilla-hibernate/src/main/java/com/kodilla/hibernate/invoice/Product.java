package com.kodilla.hibernate.invoice;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
public final class Product {

    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    private String name;

    @OneToMany (cascade = CascadeType.ALL)
    private List<Item> items = new ArrayList<>();

    public Product() {
    }

    public Product(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public List<Item> getItems() {
        return items;
    }

    public String getName() {
        return name;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    private void setId(Long id) {
        this.id = id;
    }

    private void setName(String name) {
        this.name = name;
    }
}