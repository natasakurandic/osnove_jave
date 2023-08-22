package d21_08_2023;

import java.util.Scanner;

public class Domaci4 {
    //    Napisati program koji vodi evidenciju koliko je uneto sledecih reakcija. Korisnik unosi N rekacija zatim se prikazuje evidencija:
//    Program podrzava sledece reakcije:
//    like
//            smile
//    heart
//
//    Primer izvrsenja:
//    Unesite N: 7
//    Reaguj: like
//    Reaguj: heart
//    Reaguj: smile
//    Reaguj: lol
//    Reaguj: smile
//    Reaguj: like
//    Reaguj: like
//    Summary: like 3 | smile 2 | heart 1
//
//    Napomena: Ako se unese reakcija koju program ne podrzava, ona ne utice na evidenciju.
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int likeCounter = 0;
        int smileCounter = 0;
        int heartCounter = 0;

        System.out.println("Unesite N (broj reakcija)");
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Reakcija: ");
            String reakcija = s.next();
            if (reakcija.equals("like")) {
                likeCounter = likeCounter + 1;
            } else if (reakcija.equals("smile")) {
                smileCounter = smileCounter +1;
            } else if (reakcija.equals("heart")) {
                heartCounter = heartCounter + 1;
            } else {
                System.out.println("Nepodrzana reakcija.");
            }
        }
        System.out.println("Summary: like " +  likeCounter + " | " + "smile " + smileCounter + " | " + "heart " + heartCounter);
    }
}

