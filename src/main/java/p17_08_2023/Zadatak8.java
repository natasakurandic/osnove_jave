package p17_08_2023;

import java.util.Scanner;

public class Zadatak8 {
//    Napisati program koji ucitava stranice trougla a, b i c i ispisuje da li je trougao pravougli.
//    Trougao je pravougli ako je a2 + b2 = c2
public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("Unesite stranicu trougla a: ");
        int a = s.nextInt();
    System.out.print("Unesite stranicu trougla b: ");
        int b = s.nextInt();
    System.out.print("Unesite stranicu trougla c: ");
        int c = s.nextInt();

        if (a*a + b*b == c*c) {
            System.out.println("Trougao je pravougli");
        } else {
            System.out.println("Trougao nije pravougli");
        }
}
}
