package p17_08_2023;

import java.util.Scanner;

public class Zadatak7 {
//    Napisati program koji proverava da li je broj telefona validan. Program na pocetku ucitava broj telefona korisnika
//    i ispisuje gresku ukoliko telefon nije validan.
//    Broj nije validan ukoliko nema +381 ili ako ima kosu crtu (/)
public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("POCETAK");

    System.out.println("Unesite broj telefona");
        String brTel = s.next();
        if (!brTel.contains("+381") || (brTel.contains("/"))) {
            System.out.println("Broj nije validan");
        }

        }

}
