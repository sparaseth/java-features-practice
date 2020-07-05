package com.skptech.streamreduce;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReduceExample1 {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        int result1 = numbers.stream().reduce(0, (a, b) -> a + b);
        System.out.println(result1);

        int result2 = numbers.stream().reduce(1, (a, b) -> a * b);
        System.out.println(result2);

        Optional optional = numbers.stream().reduce((a, b) -> a + b);
        if (optional.isPresent()) {
            System.out.println(optional.get());
        }
    }

}
