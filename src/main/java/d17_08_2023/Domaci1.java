package d17_08_2023;

import java.util.Scanner;

public class Domaci1 {
//    Napisati program koji ima informacije koje ucitava informacije sa tastature:
//    Ime
//            Prezime
//    godinu rodjenja
//    I stampa informaicije u formatu:
//            [ime] [prezime] - [startost] god

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter Name");
            String name = s.next();
        System.out.println("Enter Surname");
            String surname = s.next();
        System.out.println("Enter year of birth");
            int yearBirth = s.nextInt();

            int currentYear = 2023;
            int age = currentYear - yearBirth;


        System.out.println(name + " " + surname + " - " + age + " god");
    }

}
