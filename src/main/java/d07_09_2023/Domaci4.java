package d07_09_2023;

import java.util.Scanner;

public class Domaci4 {
//    Zadatak 4: Kreiranje klase "Film"
//    Napišite klasu "Film" sa atributima: naslov (String), godinaIzdanja (int) i reziser (String). U glavnoj metodi
//    kreirajte 2-3 objekta ove klase i postavite im vrednosti unosom sa tastature. Ispisati informacije o filmovima.

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

            int counterFilm = 0;
        for (int i = 0; i < 3; i++) {
            Film film1 = new Film();
            System.out.println("Unesite film: ");
            String filmPrvi = s.next();
            film1.naslov = filmPrvi;
            System.out.println("Unesite godinu izdanja");
            int godinaIzdanjaPrvi = s.nextInt();
            film1.godinaIzdanja = godinaIzdanjaPrvi;
            System.out.println("Unesite rezisera: ");
            String reziserPrvi = s.next();
            film1.reziser = reziserPrvi;
            counterFilm++;

            System.out.println("Film " + counterFilm + " : " + film1.naslov + "; Godina izdanja: " + film1.godinaIzdanja + "; Reziser: " + film1.reziser + ".");

        }
    }
}