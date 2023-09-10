package d07_09_2023;

import java.util.Scanner;

public class Domaci5 {
//    Zadatak 5: Kreiranje klase "Oprema"
//    Napišite klasu "Oprema" sa atributima: tip (String), marka (String) i cena (double). U glavnoj metodi kreirajte
//        3 objekta ove klase i postavite im vrednosti unosom sa tasture. Ispisati informacije o opremi.

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int counterOprema = 0;
        for (int i = 0; i < 3; i++) {
            Oprema oprema = new Oprema();
            System.out.println("Unesite tip: ");
            String tip = s.next();
            oprema.tip = tip;
            System.out.println("Unesite marku");
            String marka = s.next();
            oprema.marka = marka;
            System.out.println("Unesite cenu: ");
            Double cena = s.nextDouble();
            oprema.cena = cena;
            counterOprema++;

            System.out.println("Tip " +counterOprema + " : " + oprema.tip + " Marka: " + oprema.marka + " Cena: " + oprema.cena);
        }
    }
}
