package p17_08_2023;

import java.util.Scanner;

public class Zadatak4 {
//    Napisati program koji ispisuje da li je broj b manji od broja a. A i B unosimo sa tastature.

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("POCETAK");

        System.out.print("Unesite broj a: ");
        int a = s.nextInt();
        System.out.print("Unesite broj b: ");
        int b = s.nextInt();

        if (b < a) {
            System.out.println("b je manje od a");


        }
        System.out.println("KRAJ");

    }
}