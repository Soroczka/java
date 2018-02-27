package com.kodilla.stream.array;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperation {

    static double getAvarage(int[] numbers){



            IntStream.range(0, numbers.length)
                    .map(n -> numbers[n])
                    .forEach(System.out::println);

        final OptionalDouble average = IntStream.range(0, numbers.length)
                .map(n -> numbers[n])
                .average();
        double elementOfArray = average
                    .orElse(-1);

            return elementOfArray;



    }

}
