package com.skptech.consumer;

import java.util.function.Consumer;

public class ConsumerExample1 {
    public static void main(String[] args) {
        Consumer<String> stringConsumer = (x) -> System.out.println(x.length() + " is the length of " + x);
        stringConsumer.accept("Hello World");

        Consumer<Integer> integerConsumer = (x) -> {
            System.out.println("x*x :" + x * x);
            System.out.println("x/x :" + x / x);
        };
        integerConsumer.accept(5);

    }
}
