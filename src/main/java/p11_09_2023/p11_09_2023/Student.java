package p11_09_2023;

public class Student {
    private String ime;
    private String prezime;
    private int brojIndeksa;
    private boolean daLiJeNaBudzetu;

    public String getIme() {
        return ime;
    }
    public void setIme (String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }
    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }
    public int getBrojIndeksa() {
        return brojIndeksa;
    }
    public void setBrojIndeksa(int brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }
    public boolean getDaLiJeNaBudzetu () {
        return daLiJeNaBudzetu;
    }
    public void setDaLiJeNaBudzetu (boolean daLiJeNaBudzetu) {
        this.daLiJeNaBudzetu = daLiJeNaBudzetu;
    }
    public void stampaj () {
        System.out.println(this.ime + " " + this.prezime + "; " + this.brojIndeksa + "; " + this.daLiJeNaBudzetu);
    }
}
