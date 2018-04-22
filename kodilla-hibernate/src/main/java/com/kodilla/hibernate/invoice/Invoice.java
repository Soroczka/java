package com.kodilla.hibernate.invoice;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
public final class Invoice {

    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    private String number;

    @OneToMany(
            targetEntity = Item.class,
            mappedBy = "invoice",
            cascade = CascadeType.ALL
    )
    private List<Item> items = new ArrayList<>();

    public Invoice() {
    }

    public Invoice(String number) {
        this.number = number;
    }

    public Long getId() {
        return id;
    }

    public List<Item> getItems() {
        return items;
    }

    public String getNumber() {
        return number;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    private void setId(Long id) {
        this.id = id;
    }

    private void setNumber(String number) {
        this.number = number;
    }
}