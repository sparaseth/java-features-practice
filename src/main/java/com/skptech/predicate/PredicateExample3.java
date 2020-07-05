package com.skptech.predicate;

import java.util.function.DoublePredicate;
import java.util.function.IntPredicate;
import java.util.function.LongPredicate;

public class PredicateExample3 {

    public static void main(String[] args) {
        IntPredicate intPredicate = (i) -> i > 100;
        System.out.println(intPredicate.test(100));

        LongPredicate longPredicate = (i) -> i > 100L;
        System.out.println(longPredicate.test(1111111111111111111L));

        DoublePredicate doublePredicate1 = (i) -> i < 100.25;
        DoublePredicate doublePredicate2 = (i) -> i > 100.10;
        System.out.println(doublePredicate1.and(doublePredicate2).test(100.15));
    }
}
