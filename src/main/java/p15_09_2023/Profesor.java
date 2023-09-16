package p15_09_2023;

public class Profesor extends Osoba {
    private String predmet;
    private int plata;

    public Profesor (String predmet, int plata, String imeIPrezime, String jmbg) {
        super(imeIPrezime, jmbg);
            this.predmet = predmet;
            this.plata = plata;

    }
    public Profesor () {
        super();
    }


    public String getPredmet() {
        return predmet;
    }

    public void setPredmet(String predmet) {
        this.predmet = predmet;
    }

    public int getPlata() {
        return plata;
    }

    public void setPlata(int plata) {
        this.plata = plata;
    }
    public void povecajPlatu (int procenatPovecanja) {
        this.plata += this.plata * procenatPovecanja / 100;
    }

    @Override
    public void stampaj () {
        System.out.println(this.imeIPrezime + ", " + this.jmbg);
        System.out.println(this.predmet);
        System.out.println(this.plata);



    }
}
