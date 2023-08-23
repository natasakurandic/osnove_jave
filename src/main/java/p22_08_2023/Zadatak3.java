
package p22_08_2023;

import java.util.Scanner;

public class Zadatak3 {
//    Napisati program koji od korisnika ucitava brojeve sve dok ne unesu makar po jedan broj od 1 do 4.
//    Primer:
//    Unesite broj:1
//    Unesite broj:2
//    Unesite broj:2
//    Unesite broj:3
//    Unesite broj:0
//    Unesite broj:5
//    Unesite broj:3
//    Unesite broj:4
//    Kraj programa
//
//    Objasnjenje: Od svakih 1, 2, 3 i 4 je unet po jedan.

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int counterOne = 0;
        int counterTwo = 0;
        int counterThree = 0;
        int counterFour = 0;
        boolean isAllFourOnce = false;

        while (!isAllFourOnce) {
            System.out.println("Unesite broj ");
            int broj = s.nextInt();

            if (broj == 1) {
                counterOne++;
            } else if (broj == 2) {
                counterTwo++;
            } else if (broj == 3) {
                counterThree++;
            } else if (broj == 4) {
                counterFour++;
            }
            if (counterOne > 0 &&
                    counterTwo > 0 &&
                    counterThree > 0 &&
                    counterFour > 0) {
                isAllFourOnce = true;
            }
        }
    }
}
