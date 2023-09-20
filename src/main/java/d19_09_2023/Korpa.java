package d19_09_2023;

import java.util.ArrayList;


public class Korpa {
//    Kreirati klasu Korpa koja ima:
//    niz ambalaza
//    metodu dodaj ambalazu
//    metodu izbaci ambalazu, u funkciju se prosledjuje barkod flase (String) koju treba izbaciti
//    privatnu metodu koja vraca cenu svih ambalaza sa popustom, metoda kao parametar prima popust.
//    metodu koja racuna i vraca ukupncu cenu korpe (sabira sve cene ambalze), kao parametar funkcije se prima Super karticu iz koje se cita popust.

    private ArrayList<Ambalaza> ambalaze;
    public Korpa() {
        this.ambalaze = new ArrayList<>();
    }
    public void dodajAmbalazu (Ambalaza novaAmbalaza) {
        ambalaze.add(novaAmbalaza);
    }

    public void izbaciAmbalazu (String barkod) {
        for (int i = 0; i < ambalaze.size(); i++) {
            if (ambalaze.get(i).getBarkod().equals(barkod))
        ambalaze.remove(ambalaze.get(i));
        }
    }
    public double ukupnaCenaAmbalaza (int popust) {
        double cenaSvihAmbalaza = 0;
        for (int i = 0; i < ambalaze.size(); i++) {
            cenaSvihAmbalaza = cenaSvihAmbalaza + ambalaze.get(i).cenaArtikla();
        }
        return cenaSvihAmbalaza - popust;
    }
    public double cenaKorpe (SuperKartica kartica) {
        double cenaKorpe = 0;
        for (int i = 0; i < ambalaze.size(); i++) {
            cenaKorpe = cenaKorpe + ambalaze.get(i).cenaArtikla();
        }
        return cenaKorpe - kartica.getPopust();

    }
}
