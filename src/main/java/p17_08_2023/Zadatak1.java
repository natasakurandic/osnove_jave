package p17_08_2023;

import java.util.Scanner;

public class Zadatak1 {
//    Napisati program koji sa tastature ucitava ime, prezime, broj telefona, email  i jmbg korisnika prikazuje u formatu:
//            [Ime] [Prezime] - [JMBG]
//    Broj Tel: [Broj telefona],
//    Email: [Email],
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Unesite ime: ");
            String ime = scanner.next();
        System.out.print("Unesite prezime: ");
            String prezime = scanner.next();
        System.out.println("Unesite broj telefona ");
            String brTel = scanner.next();
        System.out.println("Unesite email");
            String email = scanner.next();
        System.out.println("Unsite JMBG");
            String jmbg = scanner.next();

        System.out.print(ime + " ");
        System.out.print(prezime + " - ");
        System.out.println(" "+ jmbg);
        System.out.println("Broj tel: " + brTel);
        System.out.println("Email: " + email);


}
}
