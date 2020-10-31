package com.company;

public class Orange extends Fruit_Shop{
    double price=8000;

    public Orange(float a, float p, float c, float o, float ch) {
        super(a, p, c, o, ch);

    }

    public Orange() {
        System.out.println("Price of Orange = 8000T");
    }

    @Override
    public double bill() {
        double b=(price*o);
        return b;
    }
}
