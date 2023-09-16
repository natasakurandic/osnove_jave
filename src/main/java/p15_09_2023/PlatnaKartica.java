package p15_09_2023;

public class PlatnaKartica {
    protected int suma;
    protected String brojKartice;
    protected int godinaIstekaKartice;
    protected int mesecIstekaKartice;

    public PlatnaKartica () {

    }

    public int getSuma() {
        return suma;
    }

    public String getBrojKartice() {
        return brojKartice;
    }

    public int getGodinaIstekaKartice() {
        return godinaIstekaKartice;
    }

    public int getMesecIstekaKartice() {
        return mesecIstekaKartice;
    }

    public PlatnaKartica(int suma, String brojKartice, int godinaIstekaKartice, int mesecIstekaKartice) {
        this.suma = suma;
        this.brojKartice = brojKartice;
        this.godinaIstekaKartice = godinaIstekaKartice;
        this.mesecIstekaKartice = mesecIstekaKartice;
    }
    public void dodajSredstva (int uplata) {
        this.suma += uplata;
    }
    public void izvrsiTransakciju (double transakcijaUplata) {
        this.suma -= transakcijaUplata;
    }
    public void stampajPodatkeKartice () {
        System.out.println(this.brojKartice + " , " + this.mesecIstekaKartice + "/" + this.godinaIstekaKartice + ", " + "$" + this.suma);
    }
}
