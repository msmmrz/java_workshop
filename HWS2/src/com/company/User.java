package com.company;

import java.util.Scanner;

public class User {
    public static void length(){
        int l;
        int n=0;
        String use="";
        for(int i =0; i<5; i++) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter real name ");
            String real_name = input.next();
            System.out.println("Enter user name");
            String user_name = input.next();
            System.out.println("Enter password");
            String password = input.next();

            l= user_name.length();

            if (n< l) {
                n = l;
                use = user_name;
            }
        }
        System.out.println("The longest username is: "+ use);
    }}
