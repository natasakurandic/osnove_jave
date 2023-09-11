package p08_09_2023;

import java.util.Date;

public class Zadatak3 {
    public static void main(String[] args) {

        Auto automobilPrvi = new Auto();
        automobilPrvi.vozac = "Stefan Stevic";
        automobilPrvi.marka = "Volvo";
        automobilPrvi.brojVrata = 5;
        automobilPrvi.potrosnja = 5.0;
        automobilPrvi.trenutnaBrizina = 100;
        automobilPrvi.godinaProizvodnje = 1955;
        automobilPrvi.registrovanDo = 8;
        automobilPrvi.kubikaza = 1800;
        automobilPrvi.maksimalnaBrzina = 240;
        automobilPrvi.registracija = "NI 345 AA";


        automobilPrvi.stampanje();

        if (automobilPrvi.jePrekoracioBrziu(130)) {
            System.out.println("Prekoracili ste brzinu od 130");
        } else {
            System.out.println("Niste prekoracili brzinu");
        }

        if (automobilPrvi.isteklaJeRegistracija(9)) {
            System.out.println("Registracija nije istekla");
        } else {
            System.out.println("Registracija je istekla");
        }
        System.out.println("Cena registracije je " + automobilPrvi.cenaRegistracije());

        automobilPrvi.dodajGas();
        automobilPrvi.dodajGas();
        automobilPrvi.dodajGas();
        automobilPrvi.dodajGas();
        automobilPrvi.dodajGas();

        automobilPrvi.koci();
        automobilPrvi.koci();

        System.out.println("Trenutna potrosnja " + automobilPrvi.trenutnaPotrosnja());

        automobilPrvi.stampajTablu();



    }
        }


