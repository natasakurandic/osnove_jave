package d22_08_2023;

import java.util.Scanner;

public class Domaci1 {
//    Napisati program koji sabira brojeve koje korisnik unosi, pritom da suma ne predje 100.Na kraju programa
//    ispisati sracunatu sumu.
//    Unesite vrednost: 20
//    Unesite vrednost: 50
//    Unesite vrednost: 50
//    Prekoracenje! Kraj programa. Sracunata suma je 70.
public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
       int suma = 0;

    boolean unosValidan = true;

        while (unosValidan) {
            System.out.println("Unesite broj");
                int broj = s.nextInt();
                if (suma + broj <= 100) {
                    suma = suma + broj;
                } else {
                    System.out.println("Prekoracenje! Kraj programa. Sracunata suma je " + suma + ".");
                    unosValidan = false;
                }
        }
}
}
