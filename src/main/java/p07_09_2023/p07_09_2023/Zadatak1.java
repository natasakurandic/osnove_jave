package p07_09_2023;

import java.util.Scanner;

public class Zadatak1 {

    //		Kreirati klasu Racun koja ima
//		broj racuna (npr: 840-23932-323)
//		ime i prezime vlasnika
//		stanje na racunu
//		U mainu kreirati minimum dva racuna sa pratecim podacima i ostampati podatke za svaki objekat.
//    Dopuniti zadatak tako da se vrsi transakcija sa prvog na drugi racun. Korisnik unosi svotu koja se skida sa prvog
//    i prebacuje na drugi racun.
//
//    Primer izvrsenja:
//    Posaljilac: Milan Jovanovic, 840-23932-323, stanje: 1000
//    Primalac: Marko Markovic, 840-23932-334, stanje: 200
//    Unesite sumu za transakciju: 500
//    Stanje nakon stransakcije
//    Posaljilac: Milan Jovanovic, 840-23932-323, stanje: 500
//    Primalac: Marko Markovic, 840-23932-334, stanje: 700


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);


    Racun racun1 = new Racun();
        racun1.broj =  "84023932-323";
        racun1.vlasnik = "Pera Peric";
        racun1.stanje = 5000;

        Racun racun2 = new Racun();
        racun2.broj =  "84023932-574";
        racun2.vlasnik = "Zika Zikic";
        racun2.stanje = 1000;

        System.out.println("Broj racuna: " + racun1.broj);
        System.out.println("Ime i Prezime: " + racun1.vlasnik);
        System.out.println("Stanje na racunu je: " + racun1.stanje);

        System.out.println("Broj racuna: " + racun2.broj);
        System.out.println("Ime i Prezime: " + racun2.vlasnik);
        System.out.println("Stanje na racunu je: " + racun2.stanje);


        System.out.println("Posiljilac: " + racun1.vlasnik + " " + racun1.broj + " " + racun1.stanje);
        System.out.println("Primalac: " + racun2.vlasnik + " " + racun2.broj + " " + racun2.stanje);
        System.out.println("Unesite sumu za transakciju");
            int sumaZaTransakciju = s.nextInt();
            racun1.stanje = racun1.stanje - sumaZaTransakciju;
            racun2.stanje = racun2.stanje + sumaZaTransakciju;
        System.out.println("Posiljilac: " + racun1.vlasnik + " " + racun1.broj + " " + racun1.stanje);
        System.out.println("Primalac: " + racun2.vlasnik + " " + racun2.broj + " " + racun2.stanje);


}
}