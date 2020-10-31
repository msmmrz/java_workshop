package com.ds.usc;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("\n**********************");
        System.out.println("******** bank ********");
        System.out.println("**********************\n");
        System.out.println("Enter 1 for Meli bank");
        System.out.println("Enter 2 for Sepah bank");
        int choice = input.nextInt();

        switch (choice){
            case 1:
              new Checkingmeli();
              Meli_Services services = new Meli_Services();
                int choice1;
                System.out.println("Enter 1 for opening_acc ");
                System.out.println("Enter 2 for currency_service ");
                System.out.println("Enter 3 for card_issuance ");
                System.out.println("Enter 4 for loan ");
                System.out.println("Enter 5 for checks_issuance ");
                choice1 = input.nextInt();
                switch (choice1) {
                    case 1:
                        services.opening_acc();
                        break;
                    case 2:
                        services.currency_service();
                        break;
                    case 3:
                        services.card_issuance();
                        break;
                    case 4:
                        services.loan();
                        break;
                    case 5:
                        services.checks_issuance();
                        break;
                }
                break;
            case 2:
                 new checkingsepah();
                Sepah_Services services2 = new Sepah_Services();
                int choice2;
                System.out.println("Enter 1 for opening_acc ");
                System.out.println("Enter 2 for currency_service ");
                System.out.println("Enter 3 for card_issuance ");
                System.out.println("Enter 4 for loan ");
                System.out.println("Enter 5 for checks_issuance ");
                choice2 = input.nextInt();
                switch (choice2) {
                    case 1:
                        services2.opening_acc();
                        break;
                    case 2:
                        services2.currency_service();
                        break;
                    case 3:
                        services2.card_issuance();
                        break;
                    case 4:
                        services2.loan();
                        break;
                    case 5:
                        services2.checks_issuance();
                        break;
                }
                break;
            default:
                System.out.println("     wrong input\ntry again");
        }
    }
}
