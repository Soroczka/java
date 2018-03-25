package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {

    @Test
    public void testBigmacNew(){
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .ingredient("onion")
                .ingredient("becon")
                .ingredient("cucumber")
                .ingredient("cheese")
                .roll("with sesame")
                .sauce("barbecue")
                .burgers(1)
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        //Then
        Assert.assertEquals(4, howManyIngredients);

    }

    @Test
    public void testBigmacWhenFieldIsNull(){
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                    .ingredient("onion")
                    .ingredient("becon")
                    .ingredient("cucumber")
                    .ingredient("cheese")
                    .build();
        System.out.println(bigmac);
        //When
        int howManyBurgers = bigmac.getBurgers();
        String whichSauce = bigmac.getSauce();
        String whichRoll = bigmac.getRoll();
        //Then
        Assert.assertEquals(0, howManyBurgers);
        Assert.assertEquals(null, whichSauce);
        Assert.assertEquals(null, whichRoll);
    }
}
