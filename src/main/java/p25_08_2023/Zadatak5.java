package p25_08_2023;

import java.util.Scanner;

public class Zadatak5 {

//    Napisati metodu koja stampa N zvezdica u istom redu, na kraju reda stampa novi red.. Broj zvezdica je odredjen
//    parametrom N.
//    Ako se metoda pozove za N=5, metoda stampa 5 zvezdica i enter
//    N=5, print je=> * * * * *
//
//    Ako se metoda pozove za N = 9, metoda stampa 9 zvezdica i enter
//    N=9, print je=> * * * * * * * * *


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite M");
        int m = s.nextInt();
        printstars(m);
    }
    public static void printstars (int n) {
         for (int i = 0; i < n; i++) {
             System.out.print("* ");
         }
        System.out.println();
    }
}
