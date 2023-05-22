package com.kodilla.stream.array;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperations {
    static double getAverage(int[] numbers){
//        IntStream.of(numbers)
//                .forEach(System.out::println);
            IntStream.range(0,numbers.length)
                    .map(a -> numbers[a])
                    .forEach(System.out::println);

        OptionalDouble obj = IntStream.range(0,numbers.length)
                .map(a -> numbers[a])
                .average();
        return obj.getAsDouble();
    }
}
