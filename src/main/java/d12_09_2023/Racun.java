package d12_09_2023;

public class Racun {
    private String brojRacuna;
    private String imeIPrezimeVlasnika;
    private int stanjeNaRacunu;

    public Racun () {

    }
    public Racun (String brojRacuna, String imeIPrezimeVlasnika, int stanjeNaRacunu) {
        this.brojRacuna = brojRacuna;
        this.imeIPrezimeVlasnika = imeIPrezimeVlasnika;
        this.stanjeNaRacunu = stanjeNaRacunu;
    }

    public String getBrojRacuna() {
        return brojRacuna;
    }

    public String getImeIPrezimeVlasnika() {
        return imeIPrezimeVlasnika;
    }

    public int getStanjeNaRacunu() {
        return stanjeNaRacunu;
    }

    public void setBrojRacuna(String brojRacuna) {
        this.brojRacuna = brojRacuna;
    }

    public void setImeIPrezimeVlasnika(String imeIPrezimeVlasnika) {
        this.imeIPrezimeVlasnika = imeIPrezimeVlasnika;
    }
    public void uplatiNaRacun (int iznosUplata) {
        this.stanjeNaRacunu += iznosUplata;
    }
    public void skiniSaRadcuna (double iznosKojiSeSkida) {
        this.stanjeNaRacunu -= iznosKojiSeSkida;
    }
    public void print () {
        System.out.println(this.imeIPrezimeVlasnika + " - " + this.brojRacuna);
        System.out.println("Stanje na racunu je: (" + this.stanjeNaRacunu + ") rsd");
    }
}
