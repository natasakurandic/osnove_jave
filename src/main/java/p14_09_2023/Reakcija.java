package p14_09_2023;

public class Reakcija {
    private String tipReakcije;

    private String imeIPrezimeKorisnika;

    public Reakcija () {

    }

    public Reakcija(String tipReakcije, String imeIPrezimeKorisnika) {
        this.tipReakcije = tipReakcije;
        this.imeIPrezimeKorisnika = imeIPrezimeKorisnika;
    }

    public String getTipReakcije() {
        return tipReakcije;
    }

    public String getImeIPrezimeKorisnika() {
        return imeIPrezimeKorisnika;
    }

    public void setTipReakcije(String tipReakcije) {
        this.tipReakcije = tipReakcije;
    }

    public void setImeIPrezimeKorisnika(String imeIPrezimeKorisnika) {
        this.imeIPrezimeKorisnika = imeIPrezimeKorisnika;
    }
}
