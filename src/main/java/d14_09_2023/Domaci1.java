package d14_09_2023;

import java.util.ArrayList;

public class Domaci1 {
    public static void main(String[] args) {

        Ispit ispit1 = new Ispit("Matematika", 7, "Marija Covic");
        Ispit ispit2 = new Ispit("Srpski", 8, "Marija Ilic");
        Ispit ispit3 = new Ispit("Engleski", 6, "Vuk Peric");
        Ispit ispit4 = new Ispit("Sociologija", 5, "Ana Filipovic");

        Student student1 = new Student(28, "Tara Ristic", "Osnovne");

            student1.dodajIspit(ispit1);
            student1.dodajIspit(ispit2);
            student1.dodajIspit(ispit3);
            student1.dodajIspit(ispit4);

            student1.stampajStudenta();

    }
}
