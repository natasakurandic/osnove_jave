package p14_09_2023;

public class Sastojak {
    private String naziv;
    private int cena;

    public Sastojak () {

    }
//    public Sastojak(String naziv, int cena) {
//        this.naziv = naziv;
//        this.cena = cena;
//    }

    public String getNaziv() {
        return naziv;
    }

    public int getCena() {
        return cena;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }
    public void print () {
        System.out.println(this.naziv + " - " + this.cena + ".din");
    }
}
