package com.skptech;

public class Traingle {

    private Color color;

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public static void main(String[] args) {
        Traingle t1 = new Traingle();
        t1.setColor(Color.blue);
        Traingle t2 = t1;
        t2.setColor(Color.red);
        System.out.println(t1.getColor() +":"+t2.getColor());
    }
}
enum Color{
    red, blue, green
}