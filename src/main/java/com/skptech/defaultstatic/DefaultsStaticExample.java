package com.skptech.defaultstatic;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class DefaultsStaticExample {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Mike", "Syed", "Jenny", "Gene", "Rajeev");
        names.sort(Comparator.naturalOrder());
        System.out.println("Names :"+names);
    }

}
