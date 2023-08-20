package d17_08_2023;

import java.util.Scanner;

public class Domaci2 {
//    Napisati program koji za ucitava brojeve a i b (b ima vrednosti 1 ili 2) Ukoliko se za b unese:
//    b=1, vrednost promenljive a se uvecava za 10
//    b=2, vrednost promenljive a se smanjuje za 20
//    Na kraju zadatka odstampati novu vrednost promenljive a.

    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

        System.out.println("Enter Numb A");
        int a = s.nextInt();
        System.out.println("Enter Numb B (1 or 2)");
        int b = s.nextInt();
        int result;

        System.out.print("Nova vrednost za a je " );
        if (b==1) {
            System.out.println(a + 10);}
        if (b==2) {
            System.out.println(a - 20);}





}

}
