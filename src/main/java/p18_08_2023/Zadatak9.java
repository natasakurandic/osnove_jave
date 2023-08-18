package p18_08_2023;

import java.util.Scanner;

public class Zadatak9 {
    //    Napisati program koji od korisnika ucitava 2 cela broja A i B . Program stampa sve brojeve od 1 do 10
//    osim brojeva A i B. Smatramo da korisnik unosi vrednosti od 1 do 10 za A i B vrednosti.
//    Primer izvrsenja:
//    Unesite a: 3
//    Uneiste b: 5
//        1, 2, 4, 6, 7, 8, 9, 10 => (objasnjenje: 3 i 5 nisu odstampani)
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Uneti broj A od 1 do 10");
        int a = s.nextInt();
        System.out.println("Uneti broj B od 1 do 10");
        int b = s.nextInt();

        for (int i = 1; i < 11; i++) {
            if (i != a && i != b) {
                System.out.print(i + ", ");

            }
        }
    }
}