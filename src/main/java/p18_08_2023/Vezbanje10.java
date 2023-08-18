package p18_08_2023;

import java.util.Scanner;

public class Vezbanje10 {
//    (Za vezbanje)
//    Napisati program koji stampa 20 pozicija.
//    Za aktivnu poziciju stampa *
//    Za neaktivnu pozciju stampa _
//    Korisnik unosi granice za nekativni opseg, unoseci A i B.
//    Primer izvrsenja:
//    Unesite a: 5
//    Unesite b: 10
//            * * * * _ _ _ _ _ _ * * * * * * * * * *
//    Objasnjenje: stampamo _ od 5 do 10 u ostalim situacijama stampamo *

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Uneti broj A od 1 do 10");
            int a = s.nextInt();
        System.out.println("Uneti broj B od 1 do 10");
            int b = s.nextInt();

        for (int i = 1; i < 21; i++) {
            if (i >= a && i <= b) {
                System.out.print("_ ");
            } else {
                System.out.print("* ");

            }
        }


    }

}
