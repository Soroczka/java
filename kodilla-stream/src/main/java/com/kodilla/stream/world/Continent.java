package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Continent {

    private List<Country> countries = new ArrayList<>();
    private String continent;


    public Continent(String continent, List<Country> countries) {
        this.continent = continent;
        this.countries = countries;
    }

    public String getContinent() {
        return continent;
    }

    public List<Country> getCountries() {
        return countries;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Continent)) return false;
        Continent continent1 = (Continent) o;
        return Objects.equals(countries, continent1.countries) &&
                Objects.equals(continent, continent1.continent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(countries, continent);
    }

    @Override
    public String toString() {
        return "Continent{" +
                "countries=" + countries +
                ", continent='" + continent + '\'' +
                '}';
    }
}
