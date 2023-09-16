package p12_09_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

//        Sastojak sastojakJedan = new Sastojak();
//            sastojakJedan.setNaziv("Secer");
//            sastojakJedan.setCena(50);
//
//            sastojakJedan.getNaziv();
//            sastojakJedan.getCena();
//
//        Sastojak sastojakDva = new Sastojak();
//            sastojakDva.setNaziv("Mleko");
//            sastojakDva.setCena(80);
//
//            sastojakDva.getNaziv();
//            sastojakDva.getCena();
//
//        Sastojak sastojakTri = new Sastojak();
//            sastojakTri.setNaziv("Brasno");
//            sastojakTri.setCena(70);
//
//            sastojakTri.getNaziv();
//            sastojakTri.getCena();

        ArrayList<String> Sastojci = new ArrayList<>();
        System.out.println("Unesite broj N");
            int n = s.nextInt();
            for (int i = 0; i < n; i++) {
                System.out.println("Unesite naziv sastojka");
                    String sastojak = s.next();
                System.out.println("Unesite cenu");
                    int cena = s.nextInt();

            }
    }
}
