package com.skptech.biconsumer;

import java.util.function.BiConsumer;

public class BiConsumerExample1 {

    public static void main(String[] args) {
        //Printing Two Numbers
        BiConsumer<Integer, Integer> biConsumer1 = (x, y) -> System.out.println("x: " + x + " y:" + y);
        biConsumer1.accept(2, 4);

        //Sum Of Two Numbers
        BiConsumer<Integer, Integer> biConsumer2 = (x, y) -> System.out.println("x+y : " + x + y);
        biConsumer2.accept(3, 4);

        //Concatenating Two String
        BiConsumer<String, String> biConsumer3 = (x, y) -> System.out.println(x + " "+y);
        biConsumer3.accept("Hello", "Sujit!");
    }

}
