package p24_08_2023;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Zadatak1 {
//    1.Zadatak
//    Napisati program koji u sebi ima definisan niz od 5 broja (brojevi su proizvoljni) i prikazuje sumu nultog i
//    zadnjeg elementa tog niza.


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
            numbers.add(10);
            numbers.add(20);
            numbers.add(30);
            numbers.add(40);
            numbers.add(50);

            int lastIndex = numbers.size() - 1;

                int suma = numbers.get(0) + numbers.get(lastIndex);

            System.out.println("Suma " + suma);
    }
}
