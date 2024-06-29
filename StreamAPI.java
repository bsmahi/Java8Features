package com.bsmlabs.java21examples.fp;

import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class StreamAPI {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        numbers.stream().map(Math::sqrt)
                .forEach(System.out::println);


        List<String> languages = List.of("Java", "Kotlin", "Scala");
        IntStream wordLength = languages.stream().mapToInt(String::length);
        System.out.println("Sum of the words length: " + wordLength.sum());

        List<String> prices = List.of("100", "200", "300");
        LongStream sumOfPrices = prices.stream().mapToLong(Long::parseLong);
        System.out.println("Sum of the prices: " + sumOfPrices.sum());

        List<Double> pricesOne = List.of(22.5, 23.0, 24.5, 27.0, 38.0);
        DoubleStream priceDetails = pricesOne.stream().mapToDouble(Double::doubleValue);
        double averagePrice = priceDetails.average().orElse(0.0);
        System.out.println("Average Price: " + averagePrice);

        List<List<Integer>> numberDetails = List.of(List.of(11, 12, 13), List.of(14, 15, 16), List.of(17, 18, 19));
        // Use flatMap to transform the List of Lists into a unified Stream of Integers
        List<Integer> flattenedNumbers = numberDetails.stream()
                .flatMap(List::stream)
                .toList();

        System.out.println("Flattened Number Details: " + flattenedNumbers);

        List<int[]> numbersInfo = List.of(new int[]{1, 2, 3}, new int[]{4, 5, 6}, new int[]{7, 8, 9});
        IntStream flattenedStream = numbersInfo.stream()
                .flatMapToInt(Arrays::stream);

        System.out.println("Flattened Sum: " + flattenedStream.sum());

        List<Integer> numberAnother = List.of(1, 2, 3, 4, 5);
        numberAnother.forEach(System.out::println);

        List<Integer> numberOrdered = List.of(2, 3, 1, 5, 4);
        numberOrdered.parallelStream().forEachOrdered(System.out::println);

        List<Integer> reduceNumbers = List.of(1, 2, 3, 4, 5);
        int sum = reduceNumbers.stream().reduce(0, Integer::sum);
        System.out.println("Sum: " + sum);

        int maxValue = reduceNumbers.stream().reduce(0, Integer::max);
        System.out.println("Max Value: " + maxValue);

        int minValue = reduceNumbers.stream().reduce(0, Integer::min);
        System.out.println("Min Value: " + minValue);


        List<String> names = List.of("Foojay", "Mahi", "Sathya", "KC", "APJ");
        List<String> filteredNames = names.stream()
                .filter(name -> name.startsWith("A"))
                .toList();
        System.out.println("Filtered Names: " + filteredNames);




    }
}
