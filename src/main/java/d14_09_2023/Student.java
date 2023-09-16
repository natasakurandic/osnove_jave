package d14_09_2023;

import java.util.ArrayList;

public class Student {
//    broj indeksa
//    ime i prezime
//    tip studija (osnovne, master, doktorske)
//    niz ispita
//    konstuktore koje mislite da ce vam trebati
//    gettere i settere za indeks, ime i prezime, tip studija
//    getter za niz predmeta
//    metodu dodaj ispit u niz ispita
//    metodu koja racuna prosek na studijama (u prosek se ubrajaju samo polozeni ispiti)
//    metodu stampaj koja stampa u formatu:
//            (broj indeksa) - (ime i prezime) - (tip studija)
//    Predmeti:
//            (naziv predmeta) - (profesor) - (ocena)
//            (naziv predmeta) - (profesor) - (ocena)
//            (naziv predmeta) - (profesor) - (ocena)
//    Prosecna ocena: (prosecna ocena)

    private int brojIndeksa;
    private String imeIPrezime;
    private String tipStudija;
    private ArrayList<Ispit> ispiti;

    public Student(int brojIndeksa, String imeIPrezime, String tipStudija) {
        this.brojIndeksa = brojIndeksa;
        this.imeIPrezime = imeIPrezime;
        this.tipStudija = tipStudija;
        this.ispiti = new ArrayList<>();
    }

    public int getBrojIndeksa() {
        return brojIndeksa;
    }

    public void setBrojIndeksa(int brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public String getTipStudija() {
        return tipStudija;
    }

    public void setTipStudija(String tipStudija) {
        this.tipStudija = tipStudija;
    }

    public ArrayList<Ispit> getIspiti() {
        return ispiti;
    }
    public void dodajIspit (Ispit ispit) {
        this.ispiti.add(ispit);
    }
    public double prosecnaOcena () {
        int sumaOcena = 0;
        int brojPolozenihIspita = 0;
        for(int i = 0; i < this.ispiti.size(); i++) {
            int ocene = ispiti.get(i).getOcena();

            if (ocene > 5 && ocene < 11) {
                sumaOcena = sumaOcena + ocene ;
                brojPolozenihIspita ++;
            }
        }
        return sumaOcena / brojPolozenihIspita;
    }
    public void stampajStudenta () {
        System.out.println("(" + this.brojIndeksa + ")-(" + this.imeIPrezime + ")-(" + this.tipStudija + ")");
        System.out.println("Predmeti:");
        for (int i = 0; i < ispiti.size(); i ++) {
            System.out.println("(" + this.ispiti.get(i).getPredmet() + ")-(" + this.ispiti.get(i).getImeIPrezimeProfesoraPredmeta() + ")-(" + this.ispiti.get(i).getOcena() + ")");
        }
            System.out.println("Prosecna ocena: " + "(" + this.prosecnaOcena() + ")");
    }

}
