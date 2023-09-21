package d19_09_2023;

public class Alpinista extends Planinar {

    private int brojPoena;

    public Alpinista(int idPlaninara, String punoIme, int brojPoena) {
        super(idPlaninara, punoIme);
        this.brojPoena = brojPoena;
    }

    public int getBrojPoena() {
        return brojPoena;
    }

    public void setBrojPoena(int brojPoena) {
        this.brojPoena = brojPoena;
    }

    @Override
    public void stampaj() {
        System.out.println("Alpinista, id: (" + this.idPlaninara + ")");
        System.out.println("Ime i prezime: (" + this.punoIme + ")");
        System.out.println("Broj poena: (" + this.brojPoena + ")");
    }

    @Override
    public double clanarinaPlaninara() {
        double clanarinaAlpiniste = 1500;
        if (this.brojPoena == 0) {
            return clanarinaAlpiniste;
        } else if (this.brojPoena > 0) {
            return clanarinaAlpiniste - (brojPoena * 50);
        }
        return 0;
    }

    @Override
    public boolean uspesanUspon(Planina novaPlanina) {
        if (novaPlanina.getVisinaPlanine() < 4000) {
            return true;
        } else {
            return false;
        }
    }
}
