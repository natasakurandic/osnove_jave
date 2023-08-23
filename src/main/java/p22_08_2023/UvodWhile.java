package p22_08_2023;

import java.util.Scanner;

public class UvodWhile {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int broj = -1;

        while (broj != 0) {
            System.out.println("Unesite broj");
                broj = s.nextInt();


            System.out.println("Uneli ste broj " + broj);
        }
        System.out.println("KRAJ");
    }
}
