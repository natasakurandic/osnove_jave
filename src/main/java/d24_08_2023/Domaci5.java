package d24_08_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class Domaci5 {
//    Napisati program koji ucitava niz A duzine N i broj X. Nakon unosa treba ispisati indekse onih clanova
//    niza koji su jednaki broju X.
//    Primer izvrsenja:
//    Unesite N: 5
//    Unesite broj: 1
//    Unesite broj: 3
//    Unesite broj: 7
//    Unesite broj: 3
//    Unesite broj: 9
//    Unesite X: 3
//
//    Rezultat: Elementi niza A koji su jednaki broju X imaju indekse: 1, 3

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Unesite N");
        int n = s.nextInt();

        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.println("Unesite broj: ");
            int broj = s.nextInt();
            a.add(broj);
        }
        System.out.println("Unesite vrednost X: ");
        int x = s.nextInt();
        ArrayList<Integer> nizJednakX = new ArrayList<>();
        for (int i = 0; i<a.size(); i++){
            if (a.get(i)==x){
                nizJednakX.add(i);
            }
        }
        System.out.println("Elementi niza A koji su jednaki broju X imaju indekse: " + nizJednakX);
    }

}
