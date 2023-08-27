package d25_08_2023;

import java.util.Scanner;

public class Domaci2 {
//    Napisati funkciju koja za dva jednocifrena broja koja su ulazni parametri funkcije vraca novu vrednost
//    koja se formira kao na primeru. METODA NISTA NE STAMPA.
//    ako je prvi broj =2, a drugi =3 vraca novu vrednost 23.
//    ako je prvi broj =6, a drugi =2 vraca novu vrednost 62.
public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.println("Unesite vrednost prvog broja: ");
        int broj1 = s.nextInt();
    System.out.println("Unesite vrednost drugog broja: ");
        int broj2 = s.nextInt();

    spajanjeBrojeva(broj1, broj2);
}
public static String spajanjeBrojeva (int x, int y) {
    String spojeniBrojevi = "" + x + "" + y + "";
    return spojeniBrojevi;
}
}
