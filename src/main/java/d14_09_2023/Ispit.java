package d14_09_2023;

public class Ispit {
//    Napisati klasu Ispit koja ima
//    naziv predmeta
//    ocenu (u rasponu od 5 do 10)
//    Ime i prezime profesora koji predaje predmet
//    konstuktore koje mislite da ce vam trebati
//    gettere i settere za sve atribute
//    metodu koja kaze da li je ispit polozen (polozen je ako je ocena od 6 do 10)
//    metodu koja stampa ispit u formatu:
//            (naziv predmeta) - (profesor) - (ocena)

    private String predmet;
    private int ocena;
    private String imeIPrezimeProfesoraPredmeta;

    public Ispit(String predmet, int ocena, String imeIPrezimeProfesoraPredmeta) {
        this.predmet = predmet;
        this.ocena = ocena;
        this.imeIPrezimeProfesoraPredmeta = imeIPrezimeProfesoraPredmeta;

    }

    public String getPredmet() {
        return predmet;
    }

    public void setPredmet(String predmet) {
        this.predmet = predmet;
    }

    public int getOcena() {
        return ocena;
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
    }

    public String getImeIPrezimeProfesoraPredmeta() {
        return imeIPrezimeProfesoraPredmeta;
    }

    public void setImeIPrezimeProfesoraPredmeta(String imeIPrezimeProfesoraPredmeta) {
        this.imeIPrezimeProfesoraPredmeta = imeIPrezimeProfesoraPredmeta;
    }
    public boolean daLiJePolozenIspit () {
         boolean polozenIspit = true;
        if (ocena > 5 && ocena < 11) {
            return polozenIspit = true;
        } else {
            return polozenIspit = false;
        }
    }
    public void stampajIspit () {
        System.out.println("(" + this.predmet + ")-(" + this.imeIPrezimeProfesoraPredmeta + ")-(" + this.ocena + ")");
    }


}
