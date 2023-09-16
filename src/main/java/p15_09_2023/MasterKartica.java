package p15_09_2023;

public class MasterKartica  extends PlatnaKartica{
    public MasterKartica(int suma, String brojKartice, int godinaIstekaKartice, int mesecIstekaKartice) {
        super(suma, brojKartice, godinaIstekaKartice, mesecIstekaKartice);
    }

    @Override
    public void izvrsiTransakciju(double transakcijaUplata) {
        transakcijaUplata = transakcijaUplata + (transakcijaUplata * 1.5 / 100);
        super.izvrsiTransakciju(transakcijaUplata);
    }
    public void odrzavanjeRacunaNaplata () {
        suma -= 2;
    }

    @Override
    public void stampajPodatkeKartice() {
        System.out.println("Master Card: ");
        super.stampajPodatkeKartice();
        System.out.println();
    }
}
