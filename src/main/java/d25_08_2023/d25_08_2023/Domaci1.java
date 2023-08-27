package d25_08_2023;

import java.util.Scanner;

public class Domaci1 {
//    Napisati metodu stampajVrednostZa10Vecu u kojoj se stampa prosledjena vrednost za 10 veca.Iz main-a
//    pozvati izvrsenje metode za razlicite vrednosti.


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Unesite broj koji zelite da povecate za 10");
            int broj = s.nextInt();
        stampajVrednostZa10Vecu(broj);
    }
    public static void stampajVrednostZa10Vecu (int n) {
        System.out.println(n + 10);
    }
}
