package d19_09_2023;

import java.util.ArrayList;

public class PlaninskiDom {
    private String nazivDoma;
    private int godinaOsnivanja;
    private ArrayList<Planinar> clanovi;
    public PlaninskiDom () {
    }

    public PlaninskiDom(String nazivDoma, int godinaOsnivanja) {
        this.nazivDoma = nazivDoma;
        this.godinaOsnivanja = godinaOsnivanja;
        this.clanovi = new ArrayList<>();
    }

    public String getNazivDoma() {
        return nazivDoma;
    }

    public int getGodinaOsnivanja() {
        return godinaOsnivanja;
    }

    public ArrayList<Planinar> getClanovi() {
        return clanovi;
    }

    public void setClanovi(ArrayList<Planinar> clanovi) {
        this.clanovi = clanovi;
    }
    public void uclaniPlaninara (Planinar noviPlaninar) {
        clanovi.add(noviPlaninar);
    }
    public int planinariKojiCeSeUspesnoPopeti (Planina novaPlanina) {
        int brojPlaninaraKojiSuSePopeli = 0;
        for (int i = 0; i < clanovi.size(); i++) {
            if (clanovi.get(i).uspesanUspon(novaPlanina))
                brojPlaninaraKojiSuSePopeli ++;
        }
        return  brojPlaninaraKojiSuSePopeli;
    }
    public void izbaciPlaninara (int idPlaninara) {
        for (int i = 0; i < clanovi.size(); i++) {
            if (clanovi.get(i).getIdPlaninara() == (idPlaninara)) {
                clanovi.remove(clanovi.get(i));
            }
        }
    }
    public void stampajPlaninskiDom () {
        System.out.println("Planinski dom: " + this.nazivDoma + "; Osnovan: " + this.godinaOsnivanja + ";");
        System.out.println("Clanovi doma su : ");
        for (int i = 0; i < clanovi.size(); i++) {
            clanovi.get(i).stampaj();
        }
    }
    public double mesecniPrihodDoma () {
        double mesecniPrihod = 0;
        for (int i = 0; i < clanovi.size(); i++)
            mesecniPrihod = mesecniPrihod + clanovi.get(i).clanarinaPlaninara();
        return mesecniPrihod;
    }
}
