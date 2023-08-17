package p17_08_2023;

import java.util.Scanner;

public class Zadatak2 {
//    Napisati program koji sa tastature ucitava tri cela broja:
//    dan
//            mesec
//    godina
//    I formira datum u ispisu u formatu dan-mesec-godina
public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("Unesite dan: ");
        int dan = s.nextInt();
    System.out.print("Unesite mesec: ");
        int mesec = s.nextInt();
    System.out.print("Unesite godinu: ");
        int godina = s.nextInt();

    System.out.print(dan + "-");
    System.out.print(mesec + "-");
    System.out.print(godina);

}

}
