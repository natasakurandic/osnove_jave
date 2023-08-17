package p17_08_2023;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Zadatak6 {
//    Napisati program koji ucitava brojeve a, b i c sa tastature i za svaki broj proverava da li je validan.
//    Ukoliko je broj nije validan, ispisuje se greska za svaki broj.
//    Broj nije validan ukoliko je broj negativan.
public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("Unesite broj a: ");
        int a = s.nextInt();
    System.out.print("Unesite broj b: ");
        int b = s.nextInt();
    System.out.print("Unesite broj c: ");
        int c = s.nextInt();

        if (a < 0) {
            System.out.println("a nije validan");
        }
         if (b < 0) {
        System.out.println("b nije validan");
    }
         if (c < 0) {
        System.out.println("c nije validan");
    }
    System.out.println("KRAJ");
}
}
