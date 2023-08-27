package d24_08_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class Domaci2 {
//    Napisati program koji ucitava N brojeva i smesta ih u niz. Zatim, iz niza, broji koliko je parnih brojeva uneto.
//    brojeve unosi korisnik.
//    Unesite N: 5
//    Unesite broj: 1
//    Unesite broj: 3
//    Unesite broj: 4
//    Unesite broj: 7
//    Unesite broj: 8
//    U nizu ima 2 parna broja

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite vrednost N");
            int n = s.nextInt();
            int countParnihBrojeva = 0;
        ArrayList<Integer> brojevi = new ArrayList<>();

        for (int i = 0; i < n; i++) {
                System.out.println("Unesite broj");
                    int broj = s.nextInt();
                    brojevi.add(broj);
                    if (broj % 2 == 0) {
                    countParnihBrojeva ++;
                }
            }
        System.out.println(brojevi);
        System.out.println("U nizu ima " + countParnihBrojeva + " parna broja");
    }

}
