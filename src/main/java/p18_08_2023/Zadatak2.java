package p18_08_2023;

import java.util.Scanner;

public class Zadatak2 {
//    Napisati program koji ucitava broj a i ispisuje poruke:
//    Ukoliko je broj a do 10 stampamo da je jednocifren broj
//    Ukoliko je broj a do 100 stampamo da je dvocifren broj
//    Ukoliko je broj a veci od 100 stampamo da je trocifren.

    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);


        System.out.println("Unesite a");
            int a = s.nextInt();

        if (a <= 10) {
            System.out.println("A je jednocifreni broj");
        } else if ((a >10 ) && (a < 100)) {
            System.out.println("A je dvocifreni broj");
        } else if (a < 1000) {
            System.out.println("A broj je trocifren");
        }

}

}
