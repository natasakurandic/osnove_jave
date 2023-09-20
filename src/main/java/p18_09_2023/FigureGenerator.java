package p18_09_2023;

import java.util.ArrayList;

public class FigureGenerator {
    public static Figura generisatiFiguru (String tipFigure) {
        if (tipFigure.equals("trougao")) {
            return new JednakostranicniTrougao(5);
        } else if (tipFigure.equals("pravougaonik")) {
            return  new Pravougaonik(5, 10);
        }
        return null;
    }
    public ArrayList nizTrouglova (int n) {
        ArrayList<Figura> trouglovi = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            trouglovi.add(new JednakostranicniTrougao(5));
        }
        return trouglovi;
    }
    public ArrayList nizPravougaonika (int n) {
        ArrayList<Figura> pravougaonici = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            pravougaonici.add(new Pravougaonik(5, 10));
        }
        return pravougaonici;
    }
    public ArrayList nizFigura (int n) {
        ArrayList<Figura> nizFigura = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            nizFigura.add(new JednakostranicniTrougao(5));
        }
        for (int i = 0; i < n; i++) {
            nizFigura.add(new Pravougaonik(5, 10));
        }
        return nizFigura;
    }
}
