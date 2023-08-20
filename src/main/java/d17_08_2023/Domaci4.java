package d17_08_2023;

import java.util.Scanner;

public class Domaci4 {
//    Napisati program koji proverava da li je kliknuto u okviru login forme za web stranicu. Korisnik unosi x i y
//    koordinate za T1, T2 i M. Ispisati odgovarajuce poruke.

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter X za T1");
            int xT1 = s.nextInt();
        System.out.println("Enter Y za T1");
            int yT1 = s.nextInt();
        System.out.println("Enter X za T2");
            int xT2 = s.nextInt();
        System.out.println("Enter Y za T2");
            int yT2 = s.nextInt();
        System.out.println("Enter X za M");
            int xM = s.nextInt();
        System.out.println("Enter Y za M");
            int yM = s.nextInt();

        if ((xM >= xT1 && xM <= xT2) && (yM >= yT2 && yM <= yT1)) {
            System.out.println("Clicked inside the form");
        }

        else {
            System.out.println("Not clicked inside the form");
        }
        System.out.println("END");

    }
}
