package com.skptech;

public class TestThread2 extends Thread{

    public void run(){
        System.out.println("Run Method");
    }

    public static void main(String[] args) {
        TestThread2 testThread1 = new TestThread2();
        TestThread2 testThread2 = new TestThread2();
        testThread1.start();
        testThread2.start();
    }
}
