package p18_08_2023;

import java.util.Scanner;

public class Zadatak7 {
//    Napisati program koji od korisnika ucitava jacinu zvuka (od 0 do 10) i stampa slikicu za zvuk sa brojem crtica koje je korisnik uneo.
//    Primer izvrsenja;
//    Unesite jacinu zvuka: 8
//< | | | | | | | |
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Unesite jacinu zvuka od 0 do 10");
        int jacinaZvuka = s.nextInt();
        System.out.print("< ");

        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                System.out.print(" 50% ");
            }
            System.out.print(" |");
        }

}

}
