package com.ds.usc;

import java.util.Scanner;

public class Bank_Sepah extends Rules {
    String name;
    String lastname;
    String fathername;
    long mellicode;
    int age;
    Scanner input = new Scanner(System.in);

    public Bank_Sepah(){

        System.out.print("enter your name = ");
        name = input.nextLine();

        System.out.print("enter your lastname = ");
        lastname = input.nextLine();


        System.out.print("enter your fathername = ");
        fathername = input.nextLine();


        System.out.print("enter your melli code = ");
        mellicode = input.nextLong();


        System.out.print("enter your age = ");
        age = input.nextInt();

    }
    @Override
    public void opening_acc() {
    }

    @Override
    public void currency_service() {
    }

    @Override
    public void card_issuance() {
    }

    @Override
    public void loan() {
    }

    @Override
    public void checks_issuance() {

    }
}
