package com.skptech.boxingunboxing;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BoxingUnBoxingExample {

    public static void main(String[] args) {
        IntStream intStream = IntStream.rangeClosed(0, 5000);
        List<Integer> numbers = intStream.boxed().collect(Collectors.toList());
        numbers.forEach(System.out::println);

        System.out.println("----------------------------------------------");
        Optional<Integer> sum1 = numbers.stream().reduce((a, b) -> a + b);
        if (sum1.isPresent()) {
            System.out.println(sum1.get());
        }

        System.out.println("----------------------------------------------");
        int sum2 = numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum2);
    }

}
