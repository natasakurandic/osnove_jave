package p12_09_2023;

public class Proizvod {

    private String naziv;
    private Kupac kupac;

    private double cena;

    public Proizvod () {

    }
    public Proizvod (String naziv, Kupac kupac, int cena) {
        this.naziv = naziv;
        this.kupac = kupac;
        this.cena = cena;

    }

    public String getNaziv() {
        return naziv;
    }

    public Kupac getKupac() {
        return kupac;
    }

    public double getCena() {
        return cena;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }
    public void setKupac(String imeiPrezime, ClanskaKarta clanskaKarta) {
        this.kupac = kupac;
    }

    public double cena () {
        double cenaIzrade = cena *  1.9 * (100 - kupac.getClanskaKarta().getPopust()) / 100;
        return cenaIzrade;
    }
    public void printProduct () {
        System.out.println(naziv + " - " + cena);
        this.kupac.print();
    }
}

