package com.company;

public class Peach extends Fruit_Shop {
    double price=10000;

    public Peach(float a, float p, float c, float o, float ch) {
        super(a, p, c, o, ch);

    }

    public Peach() {
        System.out.println("Price of Peach = 10000T");
    }

    @Override
    public double bill() {
        double b=(price*p);
        return b;
    }

}
