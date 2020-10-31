package com.company;

public abstract class Fruit_Shop {
    float a,p,c,o,ch;

    public Fruit_Shop() {

    }

    public Fruit_Shop(float a,float p,float c,float o,float ch){
        this.a=a;
        this.p=p;
        this.c=c;
        this.o=o;
        this.ch=ch;
    }
    public abstract double bill();
}
