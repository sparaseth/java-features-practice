package com.skptech.lambdaexpression;

public class HelloWorldLambda {

    public static void main(String[] args) {
        //Implementing sayHelloWorld using Lambda
        HelloWorldInterface helloWorldInterface = () -> "Hello World";
        System.out.println(helloWorldInterface.sayHelloWorld());
    }
}
