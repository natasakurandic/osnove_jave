package d07_09_2023;

public class Domaci1 {
//    Zadatak 1: Kreiranje klase "Student"
//    Napišite klasu "Student" koja ima sledeće atribute: ime (String), brojIndeksa (int) i fakultet (String).
//    Kreirajte 2-3 objekta ove klase u glavnoj metodi i postavite im vrednosti. Ispisati informacije o studentima.

    public static void main(String[] args) {

        Student prvi = new Student();
        prvi.ime = "Viktor";
        prvi.brojIndeksa = 15;
        prvi.fakultet = "Medicinski fakultet Kragujevac";

        Student drugi = new Student();
        drugi.ime = "Sara";
        drugi.brojIndeksa = 26;
        drugi.fakultet = "Medicinski fakultet Kragujevac";

        Student treci = new Student();
        treci.ime = "Nenad";
        treci.brojIndeksa = 45;
        treci.fakultet = "Medicinski fakultet Kragujevac";

        System.out.println("Ime: " + prvi.ime + ", Br.Indeksa: " + prvi.brojIndeksa + ", Fakultet: " + prvi.fakultet);
        System.out.println("Ime: " + drugi.ime + ", Br.Indeksa: " + drugi.brojIndeksa + ", Fakultet: " + drugi.fakultet);
        System.out.println("Ime: " + treci.ime + ", Br.Indeksa: " + treci.brojIndeksa + ", Fakultet: " + treci.fakultet);

    }
}
