package p17_08_2023;

import java.util.Scanner;

public class Zadatak5 {
//    Napisati program koji ucitava brojeve a, b i c sa tastature i proverava da li je broj a u opsegu od b do c.

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Unesite broj a: ");
            int a = s.nextInt();
        System.out.print("Unesite broj b: ");
            int b = s.nextInt();
        System.out.print("Unesite broj c: ");
            int c = s.nextInt();

            if (a > b && a < c)  {
                System.out.println("a je vece od b");
                System.out.println("a je manje od c");
            }

        System.out.println("KRAJ");
    }
}
