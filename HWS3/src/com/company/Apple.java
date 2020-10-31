package com.company;

public class Apple extends Fruit_Shop{
    double price=12000;

    public Apple(float a, float p, float c, float o, float ch) {
        super(a, p, c, o, ch);
    }

    public Apple() {
        System.out.println("Price of Apple = 12000T");
    }

    @Override
    public double bill() {
        double b=(price*a);
        return b;
    }

}
