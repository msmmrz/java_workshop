package com.ds.usc;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        travel_property travel_property1 = new travel_property();
        travel_property travel_property = new travel_property();
        int choice;
        travel_property.list.addAll(Arrays.asList("amirreza","amir","reza","ali","hossein"));
        travel_property1.people_list  = travel_property.list;
        travel_property1.origin = "tehran";
        travel_property1.destination = "shiraz";
        travel_property1.car = ("benz");


        travel_property travel_property2 = new travel_property();
        travel_property.list.addAll(Arrays.asList("hassan"));
        travel_property2.people_list  = travel_property.list;

        travel_property2.origin = "tehran";
        travel_property2.destination = "esfehan";
        travel_property2.car = ("bmw");


        travel_property travel_property3 = new travel_property();
        travel_property.list.addAll(Arrays.asList("zeynab"));
        travel_property3.people_list  = travel_property.list;
        travel_property3.origin = "esfehan";
        travel_property3.destination = "mashhad";
        travel_property3.car = ("peride");


        travel_property travel_property4 = new travel_property();
        travel_property.list.addAll(Arrays.asList());
        travel_property4.people_list  = travel_property.list;
        travel_property4.origin = "qom";
        travel_property4.destination = "shiraz";
        travel_property4.car = ("405");


        travel_property travel_property5 = new travel_property();
        travel_property.list.addAll(Arrays.asList("qoli"));
        travel_property5.people_list  = travel_property.list;
        travel_property5.origin = "shiraz";
        travel_property5.destination = "qom";
        travel_property5.car = ("207");


        travel_property travel_property6 = new travel_property();
        travel_property.list.addAll(Arrays.asList("gholi"));
        travel_property6.people_list  = travel_property.list;
        travel_property6.origin = "yazd";
        travel_property6.destination = "shiraz";
        travel_property6.car = ("E305");


        travel_property travel_property7 = new travel_property();
        travel_property.list.addAll(Arrays.asList("majid"));
        travel_property7.people_list  = travel_property.list;
        travel_property7.origin = "tehran";
        travel_property7.destination = "istanbul";
        travel_property7.car = ("2008");


        travel_property travel_property8 = new travel_property();
        travel_property.list.addAll(Arrays.asList("mohammad"));
        travel_property8.people_list  = travel_property.list;
        travel_property8.origin = "tehran";
        travel_property8.destination = "urumie";
        travel_property8.car = ("yaris");


        travel_property travel_property9 = new travel_property();
        travel_property.list.addAll(Arrays.asList("mahdad"));
        travel_property9.people_list  = travel_property.list;
        travel_property9.origin = "yazd";
        travel_property9.destination = "qazvin";
        travel_property9.car = ("206");


        travel_property travel_property10 = new travel_property();
        travel_property.list.addAll(Arrays.asList("soleyman"));
        travel_property10.people_list  = travel_property.list;
        travel_property10.origin = "kordestan";
        travel_property10.destination = "ahvaz";
        travel_property10.car = ("camery");


        System.out.println("************* Bus Terminal ***********");
        System.out.println("please choose one of the option below ");
        System.out.println("Enter 1- for reserve a trip");
        System.out.println("Enter 2- for decline a trip");
        choice = input.nextInt();
        switch (choice){
            case 1:
                System.out.println("Enter your name for registration ");
                String name = input.next();
                System.out.println("choose one of our trip '1-10' )");
                int choose = input.nextInt();
                switch (choose){
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                        if (travel_property.list.contains(name)){
                            System.out.println("you all ready registered one of our trip ");
                        }
                        else
                            System.out.println("All set you've been registered and you can't reserve another trip");

                        break;
                    default:
                        System.out.println("wrong entry try 1-10");
                }
                break;
            case 2:
                System.out.println("Enter your name for registration ");
                String name2 = input.next();
                if (travel_property.list.contains(name2)){
                    System.out.println("you canceled your trip");
                }
                else
                    throw new Exception("you not reserve any trip yet");
                break;
            default:
                System.out.println("wrong entry try 1-2");

        }
    }
}
