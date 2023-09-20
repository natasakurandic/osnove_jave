package d19_09_2023;

public abstract class Ambalaza {
//    Kreirati abstraktnu klasu Ambalaza koja ima:
//    barkod (primer: 328232-2823)
//    naziv artikla
//    neto tezinu
//    bruto tezinu
//    konstuktore (default-ni i sa parametrima)
//    gettere i settere
//    metodu koja racuna tezinu pakovanja kao razliku bruto i neto tezine.
//    abstraktnu metodu koja vraca cenu artikla
//    abstraktnu metodu stampaj

    protected String barkod;
    protected String nazivArtikla;
    protected int netoTezina;
    protected int brutoTezina;
    public Ambalaza () {

    }
    public Ambalaza(String barkod, String nazivArtikla, int netoTezina, int brutoTezina) {
        this.barkod = barkod;
        this.nazivArtikla = nazivArtikla;
        this.netoTezina = netoTezina;
        this.brutoTezina = brutoTezina;
    }

    public String getBarkod() {
        return barkod;
    }

    public void setBarkod(String barkod) {
        this.barkod = barkod;
    }

    public String getNazivArtikla() {
        return nazivArtikla;
    }

    public void setNazivArtikla(String nazivArtikla) {
        this.nazivArtikla = nazivArtikla;
    }

    public int getNetoTezina() {
        return netoTezina;
    }

    public void setNetoTezina(int netoTezina) {
        this.netoTezina = netoTezina;
    }

    public int getBrutoTezina() {
        return brutoTezina;
    }

    public void setBrutoTezina(int brutoTezina) {
        this.brutoTezina = brutoTezina;
    }
    public int tezinaPakovanja () {
        int tezinaPakovanja = this.brutoTezina - netoTezina;
        return tezinaPakovanja;
    }
    public abstract double cenaArtikla ();
    public abstract void stampaj ();
}
