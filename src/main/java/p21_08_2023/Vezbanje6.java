package p21_08_2023;

import java.util.Scanner;

    public class Vezbanje6 {
//        Napisati program koji od korisnika ucitava N jednocifrenih brojeva i od njih formira rezultujuci broj
//        kao na primeru
//        Unesite N: 5
//        Unesite broj: 1
//        Unesite broj: 2
//        Unesite broj: 0
//        Unesite broj: 4
//        Unesite broj: 1
//        Rezultujuci broj je 12041 (Promenljiva tipa int)

            public static void main(String[] args) {
                Scanner s = new Scanner(System.in);

                    int brojevi = 0;

                System.out.println("Unesite N: ");
                    int n = s.nextInt();
                    for (int i = 0; i < n; i++) {
                        System.out.println("Unesite broj: ");
                        int broj = s.nextInt();
                            brojevi = brojevi * 10 + broj;
                    }
                System.out.println("Broj je " + brojevi);
            }
    }
