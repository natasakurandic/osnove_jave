package p21_08_2023;

import java.util.Scanner;

public class Zadatak10 {
//    Napisati program koji sakriva uneti password..
//    Primer izvrsenja:
//    Unestite password: OvoJePassword123
//    Skriverni password: ****************

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Unesite password");
            String password = s.next();

        System.out.println("Skriveni password: ");

            int count = password.length();
            for (int i = 0; i < count; i++) {
                System.out.print("*");

            }

    }

}
