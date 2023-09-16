package d15_09_2023;

import java.util.ArrayList;

public class Igrac extends Osoba {
//    Kreirati klasu Igrac koja nasledjuje klasu Osoba i koja ima:
//    broj (broj koji igrac nosi)
//    poziciju koju igra (odbrambeni, napadac, … )
//    kapiten (promenljiva koja kaze da li je igrac kapiten tima, i tipa je boolean)
//    default-ni konstuktor
//    konstuktor sa parametrima
//    gettere i settere za broj, kapiten i poziciju
//    metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o igracu

    private int brojKojiNosiIgrac;
    private String pozicija;
    private boolean kapiten;
    protected ArrayList<d15_09_2023.Igrac> igraci;

    public Igrac () {
        super();
    }
    public Igrac(int brojKojiNosiIgrac, String pozicija, boolean kapiten, String imeIPrezime, String jmbg, int godinaRodjenja) {
        super(imeIPrezime, jmbg, godinaRodjenja);
        this.brojKojiNosiIgrac = brojKojiNosiIgrac;
        this.pozicija = pozicija;
        this.kapiten = kapiten;
        this.igraci = new ArrayList<>();
    }
    public int getBrojKojiNosiIgrac() {
        return brojKojiNosiIgrac;
    }
    public void setBrojKojiNosiIgrac(int brojKojiNosiIgrac) {
        this.brojKojiNosiIgrac = brojKojiNosiIgrac;
    }
    public String getPozicija() {
        return pozicija;
    }
    public void setPozicija(String pozicija) {
        this.pozicija = pozicija;
    }
    public boolean isKapiten() {
        return kapiten;
    }
    public void setKapiten(boolean kapiten) {
        this.kapiten = kapiten;
    }

    public ArrayList<d15_09_2023.Igrac> getIgraci() {
        return igraci;
    }

    @Override
    public void stampaj () {
        super.stampaj();
        System.out.println(this.brojKojiNosiIgrac + ", " + this.pozicija + ", " + this.kapiten + ".");
    }

}
