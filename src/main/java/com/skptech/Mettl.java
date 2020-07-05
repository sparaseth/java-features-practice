package com.skptech;

public class Mettl {

    public static void main(String[] args) {
        Thread t = new MyDemoThread();
        t.run();
        t.start();
        System.out.println("Main Thread");
    }
}

class MyDemoThread extends Thread {

    public void run() {
        System.out.println("MyThread");
    }

}
