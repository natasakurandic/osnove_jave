package p14_09_2023;

public class Zadatak2 {
    public static void main(String[] args) {



        Sastojak sastojak1 = new Sastojak();
            sastojak1.setNaziv("Spagete");
            sastojak1.setCena(170);
        Sastojak sastojak2 = new Sastojak();
            sastojak2.setNaziv("Piletina");
            sastojak2.setCena(80);
        Sastojak sastojak3 = new Sastojak();
            sastojak3.setNaziv("Parmezan");
            sastojak3.setCena(80);
        Sastojak sastojak4 = new Sastojak();
            sastojak4.setNaziv("Pavlaka");
            sastojak4.setCena(60);

            Pasta pasta1 = new Pasta();
                pasta1.dodajSastojak(sastojak1);
                pasta1.dodajSastojak(sastojak2);
                pasta1.dodajSastojak(sastojak3);
                pasta1.dodajSastojak(sastojak4);

                pasta1.stampa();

        System.out.println();
                pasta1.obrisi("Parmezan");
                pasta1.stampa();
    }

}
