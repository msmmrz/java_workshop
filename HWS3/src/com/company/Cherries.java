package com.company;

public class Cherries extends Fruit_Shop{
    double price=20000;

    public Cherries(float a, float p, float c, float o, float ch) {
        super(a, p, c, o, ch);

    }

    public Cherries() {
        System.out.println("Price of Cherries = 20000T");
    }

    @Override
    public double bill() {
        double b=(price*ch);
        return b;
    }

}
