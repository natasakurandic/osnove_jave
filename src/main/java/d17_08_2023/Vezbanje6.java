package d17_08_2023;

import java.util.Scanner;

public class Vezbanje6 {
//    Napisati program koji ucitava 4 broja (a,b,c,d) i formira string p (p ima startni deo #) tako
//    sto negativne brojeve lepi sa leve strane a pozitivne i nulu sa desne.
//    Hint: Potrebno je da se vrsi konkatanacija nad jednom promenljivom.


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String p;
        System.out.println("Unesite vrednost a");
        int broj = s.nextInt();
        if (broj <0) {
            p = "" + broj + " # ";
        } else {
            p = " # " + broj + "";
        }
        System.out.println("Unesite vrednost b");
        broj = s.nextInt();
        if (broj <0) {
            p =  broj + p;
        } else {
            p = p +  broj;
        }
        System.out.println("Unesite vrednost c");
        broj = s.nextInt();
        if (broj <0) {
            p =  broj + p;
        } else {
            p = p +  broj;
        }
        System.out.println("Unesite vrednost d");
        broj = s.nextInt();
        if (broj <0) {
            p =  broj + p;
        } else {
            p = p +  broj;
        }
        System.out.println(" String p ima vrednost = " + p);
    }
}
