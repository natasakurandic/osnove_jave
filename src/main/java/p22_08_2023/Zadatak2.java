package p22_08_2023;

import java.util.Scanner;

public class Zadatak2 {
    //    Zadatak
//    Napisati program koji od korisnika ucitava brojeve sve dok ne unesu dve nule.
//            Primer:
//    Unesite broj:1
//    Unesite broj:2
//    Unesite broj:0
//    Unesite broj:1
//    Unesite broj:0
//    Kraj programa jer je uneto 2 nule.

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int countNula = 0;

        while (countNula < 2) {
            System.out.println("Unesite broj ");
            int broj = s.nextInt();

            if (broj == 0) {
                countNula = countNula + 1;
            }

        }
        System.out.println("Unete su dve nule. END");
    }

}
