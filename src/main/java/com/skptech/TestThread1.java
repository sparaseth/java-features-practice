package com.skptech;

class MyThread extends Thread{

    MyThread(){
        System.out.println("MyThread");
    }

    public void run(){
        System.out.println("bar");
    }

    public void run(String str){
        System.out.println("baz");
    }
}
public class TestThread1 {

    public static void main(String[] args) {
        Thread thread = new MyThread(){
          public void run(){
              System.out.println("foo");
          }
        };
        thread.start();
    }
}
