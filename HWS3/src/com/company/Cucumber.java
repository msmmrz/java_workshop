package com.company;

public class Cucumber extends Fruit_Shop{
    double price=6000;

    public Cucumber(float a, float p, float c, float o, float ch) {
        super(a, p, c, o, ch);

    }
    public Cucumber() {
        System.out.println("Price of Cucumber = 6000T");
    }

    @Override
    public double bill() {
        double b=(price*c);
        return b;
    }




}