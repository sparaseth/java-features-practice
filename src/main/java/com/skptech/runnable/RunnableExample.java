package com.skptech.runnable;

public class RunnableExample {

    public static void main(String[] args) {
        //Traditional
        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                int sum = 0;
                for (int i = 0; i < 10; i++) {
                    sum += i;
                }
                System.out.println("Traditional :" + sum);
            }
        };
        new Thread(runnable1).start();

        //Implement using Lambda
        Runnable runnable2 = () -> {
            int sum = 0;
            for (int i = 0; i < 10; i++) {
                sum += i;
            }
            System.out.println("Runnable Lambda :" + sum);
        };
        new Thread(runnable2).start();

        //Implement using Thread with lambda
        new Thread(() -> {
            int sum = 0;
            for (int i = 0; i < 10; i++) {
                sum += i;
            }
            System.out.println("Runnable Lambda :" + sum);
        }).start();
    }
}
