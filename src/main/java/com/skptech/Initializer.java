package com.skptech;

public class Initializer {

    static {
        System.out.println("fdfsd");
    }

    {
        System.out.println("dfsfsdfs555");
    }

    private Initializer(){
        System.out.println("COns");
    }

    public static void main(String[] args) {
        new Initializer();
    }
}
