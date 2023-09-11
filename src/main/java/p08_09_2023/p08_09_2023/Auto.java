package p08_09_2023;

import java.util.Date;

public class Auto {

    public String vozac;
    public String marka;
    public int brojVrata;
    public double potrosnja;
    public int trenutnaBrizina;
    public int godinaProizvodnje;
    public int registrovanDo;
    public int kubikaza;
    public boolean ukljucenaKlima;
    public String registracija;
    public int maksimalnaBrzina;


    public void stampanje() {
        System.out.println(this.vozac);
        System.out.println(this.marka + "-" + this.brojVrata + "-ro vrata");
        System.out.println("Sa potrosnjom od " + this.potrosnja + " na 100 km");
        System.out.println(this.trenutnaBrizina + " km/h je trenutna brzina");
        System.out.println("Cena registracije " + this.cenaRegistracije());
        System.out.println("Old timer " + this.daLiJeOldtimer());
    }

    public boolean jePrekoracioBrziu(int ogranicenje) {
        boolean daLiJeprekoracenje = true;
        if (trenutnaBrizina > ogranicenje) {
            daLiJeprekoracenje = true;
            return true;
        } else {
            return false;
        }
    }

    public int kazna(int ogranicenje) {
        if (this.jePrekoracioBrziu(ogranicenje)) {
            return (this.trenutnaBrizina - ogranicenje) * 1000;
        }
        return 0;
    }
    public boolean daLiJeOldtimer() {
        int oldTimer = 1950;
        boolean jeOldtimer = true;
        if (this.godinaProizvodnje < oldTimer) {
            jeOldtimer = true;
            return true;
        } else {
            jeOldtimer = false;
            return false;
        }
        }
    public boolean isteklaJeRegistracija (int trenutniMesec) {

        if (this.registrovanDo < trenutniMesec) {
            return true;
        } else {
            return false;
        }
    }
    public double cenaRegistracije () {
        double cena = this.kubikaza * 1000;
        if (this.kubikaza > 2000) {
            cena = cena * 1.3;
        }
        return cena;
    }
    public void dodajGas() {
        this.trenutnaBrizina = this.trenutnaBrizina + 10;
        if (this.trenutnaBrizina > maksimalnaBrzina) {
            this.trenutnaBrizina = this.maksimalnaBrzina;
        }
    }
    public void koci () {
        this.trenutnaBrizina = this.trenutnaBrizina - 10;
        if (this.trenutnaBrizina < 0) {
            this.trenutnaBrizina = 0;
        }
    }
    public double racunajFaktorKlime() {
        double faktorKlime = 1.0;
        if (this.ukljucenaKlima) {
            faktorKlime = 1.2;
        }
        return faktorKlime;
    }
public double trenutnaPotrosnja () {
        return this.trenutnaBrizina / 100.0 * this.potrosnja * this.racunajFaktorKlime();
}
public void stampajTablu() {
        int crtice = this.trenutnaBrizina * 100 /this.maksimalnaBrzina;
        for (int i = 0; i < 100; i++) {
            if (i < crtice) {
                System.out.print("|");
            } else {
                System.out.print(".");
            }
        }
    System.out.println(this.trenutnaBrizina + " / " + this.maksimalnaBrzina + "km/h");
}

    }




