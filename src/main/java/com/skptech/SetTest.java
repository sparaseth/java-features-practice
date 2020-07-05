package com.skptech;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetTest {

    public static void main(String[] args) {
        HashSet<Animal> hashSet = new HashSet<>();
        hashSet.add(new Animal());
        hashSet.add(new Animal());
        for(Animal a:hashSet){
            System.out.println(a);
        }

        CreditCard creditCard1 = new CreditCard(1234);
        CreditCard creditCard2 = new CreditCard(1234);

        List<CreditCard> creditCards1 = new ArrayList<>();
        creditCards1.add(creditCard1);
        creditCards1.add(creditCard2);
        System.out.println(creditCards1);

        HashSet<CreditCard> creditCards2 = new HashSet<>();
        creditCards2.add(creditCard1);
        creditCards2.add(creditCard2);
        System.out.println(creditCards2);

        Set<CreditCard> creditCards3 = new HashSet<>();
        creditCards3.add(creditCard1);
        creditCards3.add(creditCard2);
        System.out.println(creditCards3);
    }
}

class CreditCard{
    public int number;
    public CreditCard(int number){
        this.number = number;
    }
}

class Animal{
    public int I=12;
    public Animal(){
        I=13;
    }
    public String toString(){
        return "Animal "+I;
    }
}
