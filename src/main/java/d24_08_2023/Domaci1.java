package d24_08_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class Domaci1 {
//    Napisati program koji u sebi ima definisan niz od 10 broja (brojevi su proizvoljni) i koji menja vrednost elementa
//    na pozciji K. K i novu vrednost unosi korisnik.
//    Primer:
//    Unesite pozicjiu od 0 do 9: 3
//    Unesite novu vrednost: 11
//    Element na 3. poziciji treba na kraju da ima vrednost 11 u vasem programu.

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(11);
        numbers.add(21);
        numbers.add(31);
        numbers.add(41);
        numbers.add(51);
        numbers.add(61);
        numbers.add(71);
        numbers.add(81);
        numbers.add(91);
        System.out.println(numbers);

        System.out.println("Unesite k (od 0 do 9)");
            int k = s.nextInt();
        System.out.println("Unesite novu vrednost");
            int novaVrednost= s.nextInt();

            numbers.set(k, novaVrednost);

            System.out.println(numbers);


    }
}
