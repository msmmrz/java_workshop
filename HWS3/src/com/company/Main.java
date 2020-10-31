package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        float a ,p,c,o,ch ;
        double s;
        Scanner input = new Scanner(System.in);
        Fruit_Shop fruit_shop = new Apple();
        Fruit_Shop fruit_shop1 = new Peach();
        Fruit_Shop fruit_shop2 = new Cucumber();
        Fruit_Shop fruit_shop3 = new Orange();
        Fruit_Shop fruit_shop4 = new Cherries();
        System.out.println("Apple Weight(kg):");
        a =input.nextFloat();
        System.out.println("Peach Weight(kg):");
        p =input.nextFloat();
        System.out.println("Cucumber Weight(kg):");
        c =input.nextFloat();
        System.out.println("Orange Weight(kg):");
        o =input.nextFloat();
        System.out.println("Cherries Weight(kg):");
        ch =input.nextFloat();
        Fruit_Shop apple = new Apple(a,p,c,o,ch);
        Fruit_Shop peach = new Peach(a,p,c,o,ch);
        Fruit_Shop cucumber = new Cucumber(a,p,c,o,ch);
        Fruit_Shop orange = new Orange(a,p,c,o,ch);
        Fruit_Shop cherries = new Cherries(a,p,c,o,ch);
        s=(apple.bill()+peach.bill()+cucumber.bill()+orange.bill()+cherries.bill());
        System.out.println("Your bill is "+s+"T");

    }
}
