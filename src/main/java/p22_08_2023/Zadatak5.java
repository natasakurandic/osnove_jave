package p22_08_2023;

import java.util.Scanner;

public class Zadatak5 {
//   Napišite program koji simulira ponašanje jednog test slučaja. Test slučaj ima 5 provera, a program će svaku proveru
//   validirati jednu po jednu sve dok ne proveri sve ili dok neka provera ne prodje. Korisnik sa tastature unosi
//   očekivane i stvarne rezultate za svaku proveru. Ako dođe do neuspeha, program će ispisati odgovarajuću poruku.

    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
            int i = 0;
        boolean testPassed = true;
        String errorMessage = "";


        while (i < 5 && testPassed) {
            System.out.println("Unesite expected: ");
                String exp = s.next();
            System.out.println("Unesite actual");
                String act = s.next();

                if (!exp.equals(act)) {
                    System.out.println("Test failed");
                    testPassed = false;
                    errorMessage = "Expected " + exp + " but got " + act + ".";
                }
                    i++;

            }
        if (testPassed == true) {
            System.out.println("Test passed");
        }

    }
}
