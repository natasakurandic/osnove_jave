package p22_08_2023;

import java.util.Scanner;

public class Zadatak6 {
//    Zadatak
////    Napisati program koji radi bipovanje ruznih reci. Program radi za jednu recenicu, sto znaci da ucitava od korisnika
////    rec po rec sve dok se ne unese rec sa tackom. Za reci koje su nepristojne ispisuje beeeeeeeeeeeeep.
////    Ruzne reci koje program prepoznaje su:
////    zajebava
////            mars
////    stoko
////            svinjo
////    Unesite rec: Jel
////            Jel
////    Unesite rec:ti
////            ti
////    Unesite rec:to
////            to
////    Unesite rec:mene
////            mene
////    Unesite rec:zajebavas
////            beeeeeeeeeep
////    Unesite rec:stoko
////            beeeeeeeeeep
////    Unesite rec:jedna.
////            jedna.
////    Kraj programa.
public static void main(String[] args) {
    Scanner s = new Scanner (System.in);
    boolean endOfLine = false;
    while (!endOfLine) {
        System.out.println("Unesite rec: ");
            String rec = s.next();

            if (rec.contains("zajebava") ||
                rec.contains("mars") ||
                    rec.contains("stoko")||
                    rec.contains("svinjo")) {
                System.out.println("Beeeeeeeeeeeep");
            } else {
                System.out.println(rec);
            }
            if (rec.contains(".")) {
                endOfLine = true;
            }

    }
        System.out.println("KRAJ");
}
}
