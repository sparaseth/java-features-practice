package com.skptech.binaryoperator;

import java.util.Comparator;
import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.LongBinaryOperator;

public class BinaryOperatorExample {

    public static void main(String[] args) {
        BinaryOperator<Integer> binaryOperator1 = (a, b) -> a + b;
        System.out.println(binaryOperator1.apply(3, 4));

        Comparator<Integer> comparator = Integer::compareTo;
        BinaryOperator<Integer> maxBy = BinaryOperator.maxBy(comparator);
        System.out.println(maxBy.apply(7, 8));

        BinaryOperator<Integer> minBy = BinaryOperator.minBy(comparator);
        System.out.println(minBy.apply(12, 67));

        IntBinaryOperator intBinaryOperator = (a, b) -> a * b;
        System.out.println(intBinaryOperator.applyAsInt(23, 1));

        LongBinaryOperator longBinaryOperator = (a, b) -> a * b;
        System.out.println(longBinaryOperator.applyAsLong(2, 6));

        DoubleBinaryOperator doubleBinaryOperator = (a, b) -> a * b;
        System.out.println(doubleBinaryOperator.applyAsDouble(2, 5));
    }

}
