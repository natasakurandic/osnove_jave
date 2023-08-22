package d21_08_2023;

import java.util.Scanner;

public class Domaci3 {
//    Napisati program koji simulira ponasanje speak loud programa. Korisnik unosi N reci a program ispisuje svaku rec
//    na ekranu tako da zadovolji uslov:
//    ako se u unetom tekstu sadrzi ! onda ga ispise tako kako je unet
//    ako se ne sadrzi, program dostampa na kraju
//    Nakon toga program ispisuje nivo agresivnosti u komunikaciji (u procentima).
//    Svaka uneta rec sa ! utice na agresivnost.

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double countAgresive = 0;
        System.out.println("Unesite N (broj reci)");
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Unesite rec");
            String rec = s.next();
            if (! rec.contains("!")) {
                rec = rec + "!";
            } else {
                countAgresive = countAgresive + 1;
            }
            System.out.println(rec);
        }
        double procenatAgresivnosti = countAgresive / n * 100;
        System.out.println("Procenat agresivnih reci je " + procenatAgresivnosti + "%");
    }

}
