package com.skptech.function;

import java.util.function.Function;

public class FunctionExample1 {

    public static void main(String[] args) {
        Function<Integer, Double> sqrt = (x) -> Math.sqrt(x);
        System.out.println("square root of 5 :" + sqrt.apply(5));

        Function<String, String> loweCaseFunction = (s) -> s.toLowerCase();
        System.out.println(loweCaseFunction.apply("HELLO"));

        Function<String, String> concatFunction = (s) -> s.concat(" world");
        System.out.println(loweCaseFunction.andThen(concatFunction).apply("HELLO"));
        System.out.println(loweCaseFunction.compose(concatFunction).apply("HELLO"));
    }

}
