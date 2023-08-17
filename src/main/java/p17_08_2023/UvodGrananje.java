package p17_08_2023;

import java.util.Scanner;

public class UvodGrananje {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("POCETAK");

        System.out.println("Unesite x:");
            int x = s.nextInt();
        System.out.println("Unesite y:");
            int y = s.nextInt();
        if (x == y) {
            System.out.println("x is equal to y");
        }
        System.out.println("KRAJ");
    }
}
