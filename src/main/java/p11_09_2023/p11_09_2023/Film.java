package p11_09_2023;

public class Film {
    private String naziv;

    private int izKojeGodineJe;

    private Reziser reziser;

    public Film () {

    }
    public Film (String naziv, int izKojeGodineJe, Reziser reziser) {
        this.naziv = naziv;
        this.izKojeGodineJe = izKojeGodineJe;
        this.reziser = reziser;
    }

    public String getNaziv() {
        return this.naziv;
    }
    public int getIzKojeGodineJe() {
        return this.izKojeGodineJe;
    }
    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }
    public void setIzKojeGodineJe(int izKojeGodineJe) {
        this.izKojeGodineJe = izKojeGodineJe;
    }
    public void stampaj () {
        System.out.println(naziv + " " + izKojeGodineJe);
        System.out.println(reziser);

    }

    public Reziser getReziser() {
        return reziser;
    }
    public void setReziser (Reziser reziser) {
        this.reziser = reziser;
    }
}
