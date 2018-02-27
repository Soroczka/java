package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAvarage(){

        //Given
        int [] numbers = {2, 8, 16, 4, 1, 2, 8, 9, 4, 3, 2, 0, 2, 1, 1, 1, 7, 8, 4, 2}; //20 elements

        //When
        double average = ArrayOperation.getAvarage(numbers);

        //Then
        Assert.assertEquals(4.25, average, 0.01);

    }

    @Test
    public void testGetAverageWhenArrayIsEmpty(){

        //Given
        int [] numbers = {};

        //When
        double average = ArrayOperation.getAvarage(numbers);

        //Then
        Assert.assertEquals(-1, average, 0);

    }
}
