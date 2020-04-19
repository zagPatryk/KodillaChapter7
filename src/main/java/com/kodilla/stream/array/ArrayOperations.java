package com.kodilla.stream.array;

import java.util.stream.IntStream;

public interface ArrayOperations {
    static double getAverage(int[] numbers) {
        System.out.println("Wszystkie liczby: ");
        IntStream.range(0, numbers.length)
                .map(n -> numbers[n])
                .forEach(System.out::println);

        return IntStream.range(0, numbers.length)
                .mapToDouble(n -> numbers[n])
                .average()
                .orElse(Double.NaN);

    }
}