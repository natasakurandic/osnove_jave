package p25_08_2023;

import java.util.Scanner;

public class Zadatak6 {
//    Napisati metodu koja vraca suprotno negativni broj od prosledjenog. Metoda prima broj N i vraca ga sa
//    negativnom vrednoscu.
//    Primer: Ako se metoda pozove za N=10, vraca -10
//    Ako se metoda pozove za N=-11, vraca 11
    public static void main(String[] args) {


        int m = 10;
        int n = -4;



        int negativanBroj1 = negativan(m);
        int negativanBroj2 = negativan(n);

        System.out.println("");
        System.out.println("");


    }
    public static int negativan (int n) {
      int negBroj = n * - 1;
        return negBroj;
    }
}
