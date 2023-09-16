package d15_09_2023;

public class Osoba {
//    Kreirati klasu Osoba koja ima:
//    ime i prezime
//            jmbg
//    godinu rodjenja
//    default-ni konstuktor
//    konstuktor sa parametrima
//    gettere i settere
//    metodu stampaj koja stampa u formatu:
//            (ime i prezime), (jmbg), (godina rodjenja)

    protected String imeIPrezime;
    protected String jmbg;
    protected int godinaRodjenja;


    public Osoba () {

    }
    public Osoba(String imeIPrezime, String jmbg, int godinaRodjenja) {
        this.imeIPrezime = imeIPrezime;
        this.jmbg = jmbg;
        this.godinaRodjenja = godinaRodjenja;

    }
    public String getImeIPrezime() {
        return imeIPrezime;
    }
    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }
    public String getJmbg() {
        return jmbg;
    }
    public void setJmbg(String jmbg) {
        this.jmbg = jmbg;
    }
    public int getGodinaRodjenja() {
        return godinaRodjenja;
    }
    public void setGodinaRodjenja(int godinaRodjenja) {
        this.godinaRodjenja = godinaRodjenja;
    }
    public void stampaj () {
        System.out.println("(" + this.imeIPrezime + "),(" + this.jmbg + "),(" + this.godinaRodjenja + ")");
    }


    public static class Igrac extends Osoba {
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
        public Igrac () {
            super();
        }
        public Igrac(int brojKojiNosiIgrac, String pozicija, boolean kapiten, String imeIPrezime, String jmbg, int godinaRodjenja) {
            super(imeIPrezime, jmbg, godinaRodjenja);
            this.brojKojiNosiIgrac = brojKojiNosiIgrac;
            this.pozicija = pozicija;
            this.kapiten = kapiten;
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
        @Override
        public void stampaj () {
            super.stampaj();
            System.out.println(this.brojKojiNosiIgrac + ", " + this.pozicija + ", " + this.kapiten + ".");
        }

    }
}
