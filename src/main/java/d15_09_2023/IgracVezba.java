package d15_09_2023;

import java.util.ArrayList;

public class IgracVezba extends OsobaVezba {
//    Kreirati klasu Igrac koja nasledjuje klasu Osoba i koja ima:
//    broj (broj koji igrac nosi)
//    poziciju koju igra (odbrambeni, napadac, … )
//    niz kartona
//    kapiten (promenljiva koja kaze da li je igrac kapiten tima, i tipa je boolean)
//    default-ni konstuktor
//    konstuktor sa parametrima
//    gettere i settere za broj, kapiten i poziciju
//    metodu dodaj karton, gde se dodaje karton u niz
//    metodu koja vraca broj zutih kartona
//    metodu koja vraca broj crvenih kartona
//    metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o igracu

    private int brojKojiNosiIgrac;
    private String pozicija;
    private ArrayList<Karton> kartoni;
    private boolean daLiJeKapiten;

    public IgracVezba() {

    }
    public IgracVezba(String imeIPrezime, String jmbg, int godinaRodjenja, int brojKojiNosiIgrac, String pozicija, boolean daLiJeKapiten) {
        super(imeIPrezime, jmbg, godinaRodjenja);
        this.brojKojiNosiIgrac = brojKojiNosiIgrac;
        this.pozicija = pozicija;
        this.kartoni = new ArrayList<>();
        this.daLiJeKapiten = daLiJeKapiten;
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

    public boolean isDaLiJeKapiten() {
        return daLiJeKapiten;
    }

    public void setDaLiJeKapiten(boolean daLiJeKapiten) {
        this.daLiJeKapiten = daLiJeKapiten;
    }
    public void dodajKarton (Karton tipKartona) {
        kartoni.add(tipKartona);
    }
    public int zutiKartoni () {
            int counterZutiKartoni = 0;
            for (int i = 0; i < this.kartoni.size(); i++) {
                if (this.kartoni.get(i).getTipKartona().equals("Zuti")) {
                    counterZutiKartoni++;
                }
            }
        return counterZutiKartoni;
    }
    public int crveniKartoni () {
        int counterCrveniKartoni = 0;
        for (int i = 0; i < this.kartoni.size(); i++) {
            if (this.kartoni.get(i).getTipKartona().equals("Crveni")) {
                counterCrveniKartoni++;
            }
        }
        return counterCrveniKartoni;
    }
    @Override
    public void stampaj () {
        super.stampaj();
        System.out.println(this.brojKojiNosiIgrac + ", " + this.pozicija + ", " + this.daLiJeKapiten);
        System.out.println("Broj crvenih kartona je " + crveniKartoni());
        System.out.println("Broj zutih kartona je " + zutiKartoni());


    }
}
