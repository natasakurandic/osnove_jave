package d19_09_2023;

public class StaklenaAmbalaza extends Ambalaza {
//    Kreirati klasu StaklenaAmbalaza koja nasledjuje klasu Ambalaza koja ima:
//    kaucija za flasu
//    atribut koji kaze da li se za flasu placa kaucija
//    osnovna cena
//    gettere i setter za atribute
//    konstuktori koji su vam potrebni
//    racuna cenu
//    ako se kaucija placa, (osnovna cena) * 1.2 + (kaucija);
//    ako se ne placa, (osnovna cena) * 1.2
//    metoda stampaj stampa sve podatke iz klase staklena flasa.

    private double kaucijaZaFlasu;
    private boolean daLiSeZaFlasuPlacaKaucija;
    private double osnovnaCena;

    public StaklenaAmbalaza(String barkod, String nazivArtikla, int netoTezina, int brutoTezina, double kaucijaZaFlasu, boolean daLiSeZaFlasuPlacaKaucija, double osnovnaCena) {
        super(barkod, nazivArtikla, netoTezina, brutoTezina);
        this.kaucijaZaFlasu = kaucijaZaFlasu;
        this.daLiSeZaFlasuPlacaKaucija = daLiSeZaFlasuPlacaKaucija;
        this.osnovnaCena = osnovnaCena;
    }

    public double getKaucijaZaFlasu() {
        return kaucijaZaFlasu;
    }

    public boolean isDaLiSeZaFlasuPlacaKaucija() {
        return daLiSeZaFlasuPlacaKaucija;
    }

    public double getOsnovnaCena() {
        return osnovnaCena;
    }

    public void setKaucijaZaFlasu(double kaucijaZaFlasu) {
        this.kaucijaZaFlasu = kaucijaZaFlasu;
    }

    public void setOsnovnaCena(double osnovnaCena) {
        this.osnovnaCena = osnovnaCena;
    }

    @Override
    public double cenaArtikla() {
        if (daLiSeZaFlasuPlacaKaucija) {
            double cenaArtikla = this.osnovnaCena * 1.2 + this.kaucijaZaFlasu;
            return  cenaArtikla;
        } else {
            double cenaArtikla = this.osnovnaCena * 1.2;
            return cenaArtikla;
        }
    }

    @Override
    public void stampaj() {
        System.out.println("Naziv Artikla: " + this.nazivArtikla + ", Barkod: " + this.barkod + ";");
        System.out.println("Neto tezina: " + this.netoTezina + "; Bruto tezina: " + this.brutoTezina + ";");
        if (daLiSeZaFlasuPlacaKaucija) {
            System.out.println("Kaucija za flasu je: " + this.kaucijaZaFlasu + ";");
            System.out.println("Cena artikla sa kaucijom je: " + cenaArtikla());
        } else {
            System.out.println("Cena artikla je: " + cenaArtikla());
        }
    }
}
