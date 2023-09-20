package d19_09_2023;

public class Tetrapak extends Ambalaza {
//    Kreirati klasu Tetrapak koja nasledjuje klasu Ambalaza koja ima:
//    atribut koji kaze da li se moze reciklirati
//    osnovna cena
//    gettere i setter za atribute
//    konstuktori koji su vam potrebni
//    racuna cenu tako da ispunjava uslova:
//    ako je od recikliranog materijala, ( tezina pakovanja ) * 1.5 + (osnovna cena);
//    ako nije u cenu ulazi samo osnovna cena
//    metoda stampaj stampa sve podatke iz klase tetrapak

    private boolean daLiSeMozeReciklirati;
    private double osnovnaCena;

    public Tetrapak(String barkod, String nazivArtikla, int netoTezina, int brutoTezina, boolean daLiSeMozeReciklirati, double osnovnaCena) {
        super(barkod, nazivArtikla, netoTezina, brutoTezina);
        this.daLiSeMozeReciklirati = daLiSeMozeReciklirati;
        this.osnovnaCena = osnovnaCena;
    }

    public boolean isDaLiSeMozeReciklirati() {
        return daLiSeMozeReciklirati;
    }

    public double getOsnovnaCena() {
        return osnovnaCena;
    }

    public void setOsnovnaCena(double osnovnaCena) {
        this.osnovnaCena = osnovnaCena;
    }

    @Override
    public double cenaArtikla() {
        if (daLiSeMozeReciklirati) {
            double cenaArtikla =  tezinaPakovanja() * 1.5 + this.osnovnaCena;
            return cenaArtikla;
        } else {
         double cenaArtikla = osnovnaCena;
         return cenaArtikla;
        }
    }

    @Override
    public void stampaj() {
        System.out.println("Naziv Artikla: " + this.nazivArtikla + ", Barkod: " + this.barkod + ";");
        System.out.println("Neto tezina: " + this.netoTezina + "; Bruto tezina: " + this.brutoTezina + ";");
        System.out.println("Da li se artikal moze reciklirati: " + this.daLiSeMozeReciklirati + ";");
        if (daLiSeMozeReciklirati) {
            System.out.println("Cena artikla je: " + this.cenaArtikla() + ".");
        } else {
            System.out.println("Cena artikla je: " + this.osnovnaCena + ".");
        }
    }
}
