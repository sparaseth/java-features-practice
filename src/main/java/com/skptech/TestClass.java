package com.skptech;

public class TestClass {

    public String display(String t){

        return "Hi "+t;
    }

    public static void main(String[] args) {
        String temp[] = {"ll", "dd"};
        TestClass testClass = new TestClassChild();
        System.out.println(testClass.display("Sujit"));
    }
}

class TestClassChild extends TestClass{
    public String display(String t){
        return "Hello "+t;
    }
}

