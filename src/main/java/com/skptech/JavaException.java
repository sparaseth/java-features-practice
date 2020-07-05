package com.skptech;

public class JavaException {

    public static void main(String[] args) {
        int d=0;
        int n=9;
        try{
            int fraction =d/n;
            System.out.println(fraction);
        }catch (Exception e){
            System.out.println(e);
            throw new ArithmeticException();
            //System.out.println("Exit");
        }
    }
}
