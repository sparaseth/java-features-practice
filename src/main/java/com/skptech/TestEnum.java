package com.skptech;

public class TestEnum {

    enum Color{
        red, blue, green
    }
    public static void main(String[] args) {
        Color red = Color.red;
        System.out.println("Color :"+red.name());
    }
}
