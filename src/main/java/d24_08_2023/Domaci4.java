package d24_08_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class Domaci4 {
    //    Napisati program koji ucitava niz A duzine N, i koji nakon unosa niz A stampa sve elemente niza
    //    koji su veci od nule.

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite vrednost N");
        int broj = s.nextInt();

        ArrayList<Integer> brojevi = new ArrayList<>();
        for (int i = 0; i < broj; i++) {
            System.out.println("Unesite broj: ");
            int elementNiza = s.nextInt();
            brojevi.add(elementNiza);
        }

        ArrayList<Integer> pozitivniBrojevi = new ArrayList<>();
        for (int i = 0; i < brojevi.size(); i++) {
            if (brojevi.get(i) > 0) {
                pozitivniBrojevi.add(brojevi.get(i));
            }
        }

        System.out.println("Pozitivni brojevi su: " + pozitivniBrojevi);
    }
}
