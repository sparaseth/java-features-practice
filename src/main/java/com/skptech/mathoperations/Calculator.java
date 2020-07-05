package com.skptech.mathoperations;


public interface Calculator {


    default int sum(int num1, int num2) {
        return num1 + num2;
    }

    default int subtract(int num1, int num2){
        return num1 - num2;
    }

    static int multiply(int num1, int num2) {
        return num1 * num2;
    }

}
