package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.Objects;

public class Country {

    private String country;
    private BigDecimal peopleQuantity;

    public Country(String country, BigDecimal peopleQuantity){
        this.country = country;
        this.peopleQuantity = peopleQuantity;
    }

    public BigDecimal getPeopleQuantity(){
        return peopleQuantity;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Country)) return false;
        Country country1 = (Country) o;
        return Objects.equals(country, country1.country) &&
                Objects.equals(peopleQuantity, country1.peopleQuantity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(country, peopleQuantity);
    }

    @Override
    public String toString() {
        return "Country{" +
                "country='" + country + '\'' +
                ", peopleQuantity=" + peopleQuantity +
                '}';
    }
}
