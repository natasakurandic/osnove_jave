package p14_09_2023;

public class Film {
    private String naziv;
    private int godina;


    public Film(String naziv, int godina) {
        this.naziv = naziv;
        this.godina = godina;
    }

    public String getNaziv() {
        return naziv;
    }

    public int getGodina() {
        return godina;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public void setGodina(int godina) {
        this.godina = godina;
    }
    public void print (){
        System.out.println("Naziv filma: " + this.naziv + " Godina: " + this.godina);

    }
}
