package d17_08_2023;

import java.util.Scanner;

public class Domaci3 {
//    Napisati program koji simulira izvrsenja test case-a za redirekciju nakon uspesnog logovanja na sistem.
//    Program sa tastature ucitava actual url stranice, expected url stranice i kod o gresci koja treba da se prikaze
//    ukoliko actual stranica nije kao sto je ocekivano.
//    Objasnjenje: Ucitala se login stranica, uneli ste usename i password, kliknuli na login i nakon logina je potrebno
//    da vas stranica redirektuje na google.com/ivalid_login a vas redirektuje npr na google.com/home.
//            Napomena: Poruku o gresci unesite kao jednu rec.
//    Ukolko je validacija prosla uspesno ispisati 1 Test passed.

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);


        System.out.println("Enter actual url:");
            String actUrl = s.next();
        System.out.println("Enter expected url:");
            String expUrl = s.next();
    if (!actUrl.equals(expUrl)) {
        System.out.println("Error code: " + "URL_MISSMATCH");
        System.out.println("Assertion Error: Expected google.com/home but got google.com/ivalid_login, error code:  " +
                "URL_MISSMATCH");
    }
    if (actUrl.equals(expUrl)) {
        System.out.println("URL_MATCH");
        System.out.println("1 Test passed.");
    }

}
}
