package d07_09_2023;

public class Domaci3 {
//    Zadatak 3: Kreiranje klase "Proizvod"
//    Napišite klasu "Proizvod" sa atributima: naziv (String) i cena (double). U glavnoj metodi kreirajte 3 objekta ove
//    klase i postavite im vrednosti. Ispisati informacije o proizvodima.

    public static void main(String[] args) {

        Proizvod proizvod1 = new Proizvod();
        proizvod1.naziv = "Mleko 1L";
        proizvod1.cena = 169.00;

        Proizvod proizvod2 = new Proizvod();
        proizvod2.naziv = "Kisela pavlaka 180ml";
        proizvod2.cena = 89.00;

        Proizvod proizvod3 = new Proizvod();
        proizvod3.naziv = "Somborska feta";
        proizvod3.cena = 460.00;

        System.out.println("Naziv: " + proizvod1.naziv + ", Cena: " + proizvod1.cena);
        System.out.println("Naziv: " + proizvod2.naziv + ", Cena: " + proizvod2.cena);
        System.out.println("Naziv: " + proizvod3.naziv + ", Cena: " + proizvod3.cena);
    }
}
