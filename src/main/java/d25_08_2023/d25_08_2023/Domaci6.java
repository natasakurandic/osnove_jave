package d25_08_2023;

import java.util.ArrayList;

public class Domaci6 {

//    Napisati funkciju koja za pronalazi koliko ima celih brojeve izmedju brojeva M i N.
//    Primer izvrsenja:
//    izbroji(5, 10) ima za rezultat 4. Kako? 5 6 7 8 9 10
//    izbroji(-5, 1) ima za rezultlat 5 . Kako? -5 -4 -3 -2 -1 0 1


    public static void main(String[] args) {
        int leviBroj = -5;
        int desniBroj = 1;

        celiBrojevi(leviBroj, desniBroj);
    }

    public static void celiBrojevi(Integer n, Integer m) {

        ArrayList<Integer> brojevi = new ArrayList<>();
        boolean uslov = true;
        int novBroj = n + 1;
        brojevi.add(novBroj);
        while (uslov) {
            novBroj++;
            brojevi.add(novBroj);
            if (novBroj == m - 1) {
                uslov = false;
            }
        }
        System.out.println(brojevi.size());

    }
}
