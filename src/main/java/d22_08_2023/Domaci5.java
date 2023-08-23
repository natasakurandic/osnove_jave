package d22_08_2023;

import java.util.Scanner;

public class Domaci5 {
    //    Napisati program koji proverava uparenost zagrada. Korisnik unosi matematicku formulu sve dok ne unese znak =.
//    Korisnik unosi svaki karakter jednacine posebno i na kraju programa se ispisuje da li su sve zagrade uparene.
//    Formula koja se koristi u primeru je: (2 * ( 1 + 3))=

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int counterLevihZagrada = 0;
        int counterDesnihZagrada = 0;

        boolean uslov = true;

        while (uslov) {
            System.out.println("Unesite karakter matematicke formule");
            String karakter = s.next();

            if (karakter.equals("(")) {
                counterLevihZagrada++;
            }
            if (karakter.equals(")")) {
                counterDesnihZagrada++;
            }
            if (karakter.equals("=")) {
                uslov = false;
            }
        }
        if (counterLevihZagrada == counterDesnihZagrada) {
            System.out.println("Zagrade su uparene");
        } else {
            System.out.println("Zagrade nisu uparene");
        }
    }
}
