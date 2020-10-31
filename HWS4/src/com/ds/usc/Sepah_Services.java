package com.ds.usc;

import java.util.Scanner;

public class Sepah_Services {
    Scanner input = new Scanner(System.in);
    public void opening_acc() {
        System.out.println("ok you have a account ");
    }


    public void currency_service() {
        System.out.println("sorry service not available");

    }

    public void card_issuance() {
        System.out.println("Okk you Have a card now ");

    }

    public void loan() {
        System.out.println("Enter the amount of money ");
        double loan = input.nextDouble();
        System.out.println("ok you will get " + loan + "Tooman");

    }

    public void checks_issuance() {
        System.out.println("sorry service not available");
    }
}
