package com.skptech;

class Hello{
    public static void m1(){
        System.out.println("Hffsdfsd");
    }
}

class Hi extends Hello{
    public static void m1() throws ClassCastException{
        System.out.println("Hffsdfsddaczxcz");
    }
}
public class QQ31 {

    public static void main(String[] args) {
        Hello hello = new Hi();
        hello.m1();
    }
}
