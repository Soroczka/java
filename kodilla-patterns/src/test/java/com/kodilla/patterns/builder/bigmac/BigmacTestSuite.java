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
        try{
            Bigmac bigmac = new Bigmac.BigmacBuilder()
                    .ingredient("onion")
                    .ingredient("becon")
                    .ingredient("cucumber")
                    .ingredient("cheese")
                    .build();
            System.out.println(bigmac);
        } catch (NullPointerException e){
            System.out.println(e);
        }

        //When
        //Then
    }
}
