package p24_08_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak9 {
//    Napisati program koji ucitava N brojeva koje smesta u niz i NA KRAJU programa ih stampa. Potrebne su dve petlje,
//    u jednoj se desava ucitavanje niza a u drugoj stampanje.

    public static void main(String[] args) {

        ArrayList<Double> numbers = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite N");
            int n = s.nextInt();

            for (int i = 0; i < n; i++) {
                System.out.println("Unesite broj: ");
                double broj =s.nextDouble();
                numbers.add(broj);
            }
            for (int i = 0; i < numbers.size(); i++) {
                System.out.print(numbers.get(i) + ", ");

            }


    }
}
