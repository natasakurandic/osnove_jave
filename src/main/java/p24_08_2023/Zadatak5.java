package p24_08_2023;

import java.util.ArrayList;

public class Zadatak5 {
//    Napisati program koji u sebi ima definisan niz od 5 broja (brojevi su proizvoljni) i racuna i stampa sumu svih
//    brojeva niza.
//    Primer: Ako je niz 1,2,4,5,7
//    Stampa se, suma = 19

    public static void main(String[] args) {


        int suma = 0;

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);

            for (int i=0; i < numbers.size(); i++) {
                suma = suma + numbers.get(i);


                System.out.println("Suma = " + suma);
            }
    }
}
