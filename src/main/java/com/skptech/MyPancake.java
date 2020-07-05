package com.skptech;

import java.util.ArrayList;
import java.util.List;

public class MyPancake implements Pancake{

    public static void main(String[] args) {
        List<String> x = new ArrayList<>();
        x.add("3");
        x.add("7");
        x.add("5");
        System.out.println(x);
        List<String> y = new MyPancake().doStuff(x);
        System.out.println(x);
        System.out.println(y);
        y.add("1");
        System.out.println(x);
        System.out.println(y);
    }

    @Override
    public List<String> doStuff(List<String> list) {
        list.add("9");
        return list;
    }
}

interface Pancake{
    List<String> doStuff(List<String> list);
}