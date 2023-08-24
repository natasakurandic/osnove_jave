package p24_08_2023;

import java.util.ArrayList;

public class Zadatak3 {
//    Napisati program koji u sebi ima definisan niz od 5 broja (brojevi su proizvoljni) i koji zamenjuje vrednosti
//    prvog (na poziciji nula) i zadnjeg elemnta niza.
//    Objasnjenje: Ako je niz 2,4,5,6,7 nakon izmene treba da bude 7,4,5,6,2
//    Napomena: U zadataku nakon kreiraanja niza, ne treba da se desi kod koji setuje fiksne vrednosti u niz.


    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        numbers.get(0);
        int poslednjiElement = numbers.get(numbers.size() - 1);
        int prviElement = numbers.get(0);

        numbers.set (0, poslednjiElement );
        numbers.set (numbers.size() - 1, prviElement);

        System.out.println(numbers);
    }
}
