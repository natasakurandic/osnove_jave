package d25_08_2023;

import java.util.Scanner;

public class Domaci3 {
//    Napisati metodu koja stampa podatke o korisniku u formatu:
//    JMBG: [jmbg]
//    Ime: [ime]
//    Prezime: [prezime]
//    God. rodjenja: [god]
//    Aktivan: [true/false]
//    Metoda prima jmbg, ime, prezime, god rodjenja i da li je aktivan kao parametre metode.Metoda nista ne vraca.
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Unesite vas JMBG: ");
            String jmbg = s.next();
        System.out.println("Unesite vase Ime: ");
            String ime = s.next();
        System.out.println("Unesite vase Prezime: ");
            String prezime = s.next();
        System.out.println("Unesite vasu Godinu rodjenja: ");
            int godinaRodjenja = s.nextInt();
        System.out.println("Da li je aktivan (true or false): ");
            Boolean aktivan = s.nextBoolean();


        stampajPodatke(jmbg, ime, prezime, godinaRodjenja, aktivan);

    }
    public static void stampajPodatke (String jmbg, String ime, String prezime, Integer godinaRodjenja, Boolean aktivan) {
        System.out.println("jmbg: " + jmbg);
        System.out.println("ime: " +  ime);
        System.out.println("prezime: " +  prezime);
        System.out.println("godinaRodjenja: " + godinaRodjenja);
        System.out.println("aktivan: " +  aktivan);


    }
}
