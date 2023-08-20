package d18_08_2023;

import java.util.Scanner;

public class Zadatak3 {
//    Napisati program koji za uneti broj x (smatrajte da korisnik unosi jednocifreni broj) ispisuje tablicu
//    mnozenja
//    za taj broj. Resiti for petljom.


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Uneti broj od 1 do 9");
            int x = s.nextInt();

                for (int i = 1; i < 10; i++) {
                    System.out.println(x + " x " +  i + " = " + x*i);
                }



    }

}
