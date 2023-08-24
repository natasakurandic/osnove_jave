package p24_08_2023;

import java.util.ArrayList;
import java.util.Random;

public class Vezbanje6 {
//    Napisati program koji vrsi mesanje niza. Niz je duzine 10, proizvoljnih brojeva.
//    Mesanje niza se vrsi tako sto se 8 puta vrsi zamena dva random elementa iz niza.
//    primer jedne zamene:
//    Ako je niz
//1,2,3,4,5,6,7,8,9,10
//    i prvi random indeks je 4 a drugi random indeks je 6
//            1,2,3,4,7,6,5,8,9,10


    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(50);
        numbers.add(80);
        numbers.add(100);
        numbers.add(120);
        numbers.add(200);
        numbers.add(300);
        numbers.add(400);
        numbers.add(500);

        Random random = new Random();

        for (int i = 0; i < 8; i++) {
            int rand1 = random.nextInt(numbers.size());
            int rand2 = random.nextInt(numbers.size());

                int x = numbers.get(rand1);
            numbers.set(rand1, numbers.get(rand2));
            numbers.set(rand2, x);
            System.out.println(numbers);
        }
    }
}
