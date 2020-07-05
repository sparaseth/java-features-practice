package com.skptech.streamlimitandskip;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamLimitAndSkipExample {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        List<Integer> limit5Numbers = numbers.stream().limit(5).collect(Collectors.toList());
        limit5Numbers.forEach(System.out::println);

        System.out.println("----------------------------------");
        List<Integer> skip5Numbers = numbers.stream().skip(5).collect(Collectors.toList());
        skip5Numbers.forEach(System.out::println);
    }

}
