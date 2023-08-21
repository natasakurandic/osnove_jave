package p21_08_2023;

import java.util.Scanner;

public class Zadatak7 {
//    Napisati program koji od korisnika ucitava N brojeva  i ispisuje koliko je parnih brojeva uneo korisnik.
//    N nam kaze koliko broja ce korisnik da unese.
//    Primer izvrsenja:
//    Unesite N: 6
//    Unesite broj: 2
//    Unesite broj: 4
//    Unesite broj: 9
//    Unesite broj: 12
//    Unesite broj: 8
//    Unesite broj: 1
//    Uneto je 4 parna broja.


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Unesite N: ");
            int n = s.nextInt();

            int parniBrojevi = 0;
            for (int i = 0; i < n; i++) {
                System.out.println("Unesite broj: ");
                    int broj = s.nextInt();
                    if (broj % 2 == 0) {
                        parniBrojevi = parniBrojevi + 1;
                    }

            }
        System.out.println("Uneto je " + parniBrojevi + " parna broja");
    }
}