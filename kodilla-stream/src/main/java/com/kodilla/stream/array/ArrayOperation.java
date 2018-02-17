package com.kodilla.stream.array;

import java.util.stream.IntStream;

public interface ArrayOperation {

    static double getAvarage(int[] numbers){

        IntStream.range(0, numbers.length)
                .map(n -> numbers[n])
                .forEach(System.out::println);

        double elementOfArray = IntStream.range(0, numbers.length)
                .map(n -> numbers[n])
                .average()
                .getAsDouble();

        return elementOfArray;

    }

}
