package p15_09_2023;

public class VisaKartica extends PlatnaKartica {

    private String ovlascenoLice;

    public VisaKartica () {
      super();
    }
    public VisaKartica (String ovlascenoLice, int suma, String brojKartice, int godinaIstekaKartice, int mesecIstekaKartice) {
        super(suma, brojKartice, godinaIstekaKartice, mesecIstekaKartice);
            this.ovlascenoLice = ovlascenoLice;
    }

    public String getOvlascenoLice() {
        return ovlascenoLice;
    }

    public void setOvlascenoLice(String ovlascenoLice) {
        this.ovlascenoLice = ovlascenoLice;
    }

    @Override
    public void izvrsiTransakciju(double transakcijaUplata) {
        if (transakcijaUplata * 1.8 / 100 < 4) {
            transakcijaUplata = transakcijaUplata - 4;
        } else  {
            transakcijaUplata = transakcijaUplata + (transakcijaUplata * 1.8 / 100);
        }
        super.izvrsiTransakciju(transakcijaUplata);
    }

    @Override
public void stampajPodatkeKartice () {
    System.out.println("Visa Card: ");
    super.stampajPodatkeKartice();
    System.out.println(this.ovlascenoLice);
}
}
