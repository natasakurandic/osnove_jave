package p14_09_2023;

import java.util.ArrayList;

public class Reziser {

    private String punoIme;
    private ArrayList<Film> filmovi;

    public Reziser() {
        this.filmovi = new ArrayList<>();
    }

    public Reziser(String punoIme) {
        this.punoIme = punoIme;
        this.filmovi = new ArrayList<>();
    }

    public ArrayList<Film> getFilmovi() {
        return this.filmovi;
    }

    public void setPunoIme(String punoIme) {
        this.punoIme = punoIme;
    }

    public String getPunoIme() {
        return punoIme;
    }
    public void dodajFilm (Film newFilm) {
        this.filmovi.add(newFilm);
    }
    public void stampaj() {
        System.out.println("Reziser: " + this.punoIme);
        for (int i =0; i < this.filmovi.size(); i++) {
            System.out.println("Film: " + this.filmovi.get(i).getNaziv());

        }
    }
}
