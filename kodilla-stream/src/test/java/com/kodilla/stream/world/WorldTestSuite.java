package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.Arrays;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity(){

        //Given
        Continent europe = new Continent("Europe", Arrays.asList(
                new Country("Poland", new BigDecimal("37950000")),
                new Country("Hungary", new BigDecimal("9818000")),
                new Country("Croatia", new BigDecimal("4171000"))
        ));

        Continent asia = new Continent("Asia", Arrays.asList(
                new Country("Vietnam", new BigDecimal("92700000")),
                new Country("China", new BigDecimal("1379000000")),
                new Country("Japan", new BigDecimal("127000000"))
        ));

        Continent africa = new Continent("Africa", Arrays.asList(
                new Country("Cameroon", new BigDecimal("23440000")),
                new Country("Kongo", new BigDecimal("126000"))
        ));

        World world = new World(Arrays.asList(africa, asia, europe));

        //When
        BigDecimal peopleQuantity = world.getPeopleQuantity();

        //Then
        Assert.assertEquals(new BigDecimal("1674205000"), peopleQuantity);

    }
}
