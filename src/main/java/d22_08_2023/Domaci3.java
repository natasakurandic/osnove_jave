package d22_08_2023;

import java.util.Scanner;

public class Domaci3 {
    //    Napisati program koji ucitava RIMSKE brojeva od korisnika i na ekranu ispisuje arapsku vrednost sve dok korisnik
//    ne unese KRAJ..

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);


        boolean uslov = true;

        while (uslov) {
            int broj;
            System.out.println("Unesite rimski broj (I, X, V, L, C, D, M)");
            String rimskiBroj = s.next();

            if (rimskiBroj.equals ("I")) {
                broj = 1;
                System.out.println("Arapski: " + broj);
            }  else if (rimskiBroj.equals ("X")) {
                broj = 10;
                System.out.println("Arapski: " + broj);
            } else if (rimskiBroj.equals ("V")) {
                broj = 5;
                System.out.println("Arapski: " + broj);
            } else if (rimskiBroj.equals ("L")) {
                broj = 50;
                System.out.println("Arapski: " + broj);
            } else if (rimskiBroj.equals ("C")) {
                broj = 100;
                System.out.println("Arapski: " + broj);
            } else if (rimskiBroj.equals ("D")) {
                broj = 500;
                System.out.println("Arapski: " + broj);
            } else if (rimskiBroj.equals ("M")) {
                broj = 1000;
                System.out.println("Arapski: " + broj);
            } else if (rimskiBroj.equals ("KRAJ")) {
                uslov = false;
            } else {
                System.out.println("Molimo vas unesite validan rimski broj ili KRAJ za prekid programa");
            }

        }

    }
}

