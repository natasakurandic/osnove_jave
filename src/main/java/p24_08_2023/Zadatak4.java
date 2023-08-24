package p24_08_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak4 {
//    Napisati program koji u sebi ima definisan niz od 5 broja (brojevi su proizvoljni) i koji prikazuje element
//    na poziciji K. K unosi korisnik i smatrajte da unosi u opsegu od 0 do 4.
//    Primer:
//    Unesite pozicjiu: 2
//    Na pozicji 2 je vrednost 7.

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        System.out.println("Unesite K u opsegu (od 0 do 4)");
        int k = s.nextInt();

        int position = numbers.get(k);
        System.out.println("Na poziciji " + position);
    }
}