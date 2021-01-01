package View;

import Model.Entity.Enti;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Controller.*;
public class View {

    public View(){
        Scanner input = new Scanner(System.in);
        int id=0;
        while (true) {
            List<Enti> e1 = new ArrayList<>();
            List<Enti> e2 = new ArrayList<>();
            for (int i=1; i<=6 ; i++) {
                id++;
                Enti enti = new Enti().setId(id);
                e1.add(getInfo(enti,i,input));
            }
            for (int i=7; i<=12 ; i++) {
                id++;
                Enti enti = new Enti().setId(id);
                e2.add(getInfo(enti,i,input));
            }
            Thread1 thread1 = new Thread1(e1);
            Tread2 tread2 = new Tread2(e2);
            thread1.start();
            tread2.start();
            try {
                Thread.sleep(78000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public static Enti getInfo(Enti enti, int i, Scanner input) {
        System.out.printf("Enter "+i+"th Car's Model: ");
        enti.setModel(input.next());
        System.out.printf("Plaque: ");
        enti.setPlaque(input.next());
        System.out.printf("violation: ");
        enti.setViolation(input.next());
        return enti;
    }
}
