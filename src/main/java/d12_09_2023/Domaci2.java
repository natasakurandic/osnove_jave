package d12_09_2023;

import java.util.ArrayList;

public class Domaci2 {
//    Zadatak
//    Kreirati klasu ZeleniKarton koja ima:
//    ime i prezime studenta
//    broj indeksa
//    naziv predmeta
//    ime i prezime profesora
//    ocenu - od 5 do 10
//    gettere i settere
//            konstruktore
//    metodu koja vraca da li je ispit polozen ili ne (ispit je polozen ako je ocena veca od 5)
//    metodu stampaj koja stampa podatke u formatu:
//            (naziv predmeta) - (ocena)
//    Student: ime i prezime, broj indeksa
//    Profesor: ime i prezime
//
//    U glavnoj klasi:
//    kreirati niz od 5 zelenih kartona za ispite i odstampati podatke za sve ispite
//    Zatim program pronalazi i ispisuje prosecnu ocenu za sve ispite
//            (Za vezbanje) Pronaci i ispisati prosecnu ocenu samo za polozene ispite
public static void main(String[] args) {

    ArrayList<ZeleniKarton> ispiti = new ArrayList<>();

    ispiti.add(new ZeleniKarton("Pera Peric", "456", "Matematika", "Aca Petrovic", 10));
    ispiti.add(new ZeleniKarton("Pera Peric", "456", "Srpski", "Petar Petrovic", 10));
    ispiti.add(new ZeleniKarton("Pera Peric", "456", "Engleski jezik", "Ivan Urosevic", 10));
    ispiti.add(new ZeleniKarton("Pera Peric", "456", "Programiranje", "Ana Anic", 6));
    ispiti.add(new ZeleniKarton("Pera Peric", "456", "WEB dizajn", "Ivana Zivic", 5));

        int zbirOcena = 0;
    for (int i = 0; i < ispiti.size(); i++) {
      zbirOcena = zbirOcena + ispiti.get(i).getOcena();
    }
    double prosecnaOcena = zbirOcena / ispiti.size();

    System.out.println("Prosecna ocena je: " + prosecnaOcena);

            int counterPolozeniIpisti = 0;
            int zbirOcenaPolozeniIspiti = 0;
    for (int i = 0; i < ispiti.size(); i++) {
        if (ispiti.get(i).getOcena() > 5 && ispiti.get(i).getOcena() <= 10 ) {
            counterPolozeniIpisti++;
            zbirOcenaPolozeniIspiti = zbirOcenaPolozeniIspiti + ispiti.get(i).getOcena();
        }
    }
    double prosecnaOcenaPolozenihIspita = zbirOcenaPolozeniIspiti / counterPolozeniIpisti;
    System.out.println(counterPolozeniIpisti);
    System.out.println("ProsecnaOcena polozenih ispita je " + prosecnaOcenaPolozenihIspita);
    }


}
