package com.skptech;

class A{
    public void methodA(){
        System.out.println("MethodA");
    }
}

class B extends A{
    public void methodA(){
        System.out.println("MethodB");
    }
}
public class A1 {

    public static void main(String[] args) {
        String str = "sujit";
        method(str);
        System.out.println(str);
    }

    public static void method(String str){
        str = "Gido";
        System.out.println(str);
    }
}
