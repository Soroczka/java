package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public final class Bigmac {
    private final String roll;
    private final String sauce;
    private final int burgers;
    private List<String> ingredients;

    public static class BigmacBuilder {
        private String roll;
        private String sauce;
        private int burgers;
        private List<String> ingredients = new ArrayList<>();

        public BigmacBuilder roll(String roll) {
                this.roll = roll;
                return this;
        }

        public BigmacBuilder sauce(String sauce) {
                this.sauce = sauce;
                return this;
        }

        public BigmacBuilder burgers(int burgers) {
                this.burgers = burgers;
                return this;
        }

        public BigmacBuilder ingredient(String ingredient) {
            ingredients.add(ingredient);
            return this;
        }

        public Bigmac build() {
            if (roll != null || sauce != null || burgers != 0) {
                System.out.println("You have to fill all fields to create your BigMac");
                return new Bigmac(roll, sauce, burgers, ingredients);
            }
            throw new NullPointerException();
        }
    }

    public Bigmac(final String roll, final String sauce, final int burgers, List<String> ingredients) {
        this.roll = roll;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = new ArrayList<>(ingredients);
    }

    public String getRoll() {
        return roll;
    }

    public String getSauce() {
        return sauce;
    }

    public int getBurgers() {
        return burgers;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "roll='" + roll + '\'' +
                ", sauce='" + sauce + '\'' +
                ", burgers=" + burgers +
                ", ingredients=" + ingredients +
                '}';
    }
}
