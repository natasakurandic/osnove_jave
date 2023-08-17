package p17_08_2023;

import java.util.Scanner;

public class Zadatak3 {
//    Napisati program koji sa tastature ucitava tri broja a, b i c i ispisuje srednju vrednost za ta tri broja.
//    Sve promenljive u programu su po tipu double

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Unesite broj a: ");
            Double a = s.nextDouble();
        System.out.print("Unesite broj b: ");
            Double b = s.nextDouble();
        System.out.print("Unesite broj c: ");
            Double c = s.nextDouble();
        double prosecnaVrednost = (a + b + c)/3;
        System.out.println("Srednja vrednost je " + prosecnaVrednost);

    }
}