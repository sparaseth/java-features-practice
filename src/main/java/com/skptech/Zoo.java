package com.skptech;

public class Zoo {

    public static void main(String[] args) {
        try{
            throw new RuntimeException();
        }
        catch (Throwable e){
            System.out.println("B");
        }
        /*catch (Exception ex){
            System.out.println("C");
        }*/finally {
            System.out.println("D");
            return;
        }
    }
}
