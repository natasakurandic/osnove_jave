package d14_09_2023;

import java.util.ArrayList;

public class Listic {
//    Kreirati klasu Listic koja ima:
//    niz kombinacija - maksimalno 7 kombinacija
//    metodu dodaj kombinaciju, koja dodaje kombinaciju u niz
//    metodu koja vraca da li je kombinacija dobitna. Kao parametar se prosledjuje kombinacija za proveru.
//    Metoda prolazi kroz sve elemente niza i proverava da li u nizu postoji prosledjena kombinacija.
//    Za proveru jednakosti kombinacja koristi se metoda daLiJeIstaKombinacija
//    Zaglavlje metode
//    public boolean dobitna(Kombinacija dobitnaKombinacija)
//    metodu koja stampa listic u formatu
//    ID: id kombinacije
//    brojevi: 1, 3, 5, 14, 15, 21, 23
//
//    ID: id kombinacije
//    brojevi: 1, 3, 5, 14, 15, 21, 23
//            …… i tako za sve kombinacije

    private ArrayList<Kombinacija> kombinacije;

    public Listic() {
        this.kombinacije = new ArrayList<Kombinacija>();
    }

    public void dodajKombinaciju (Kombinacija k) {
        if (this.kombinacije.size() < 7) {
            kombinacije.add(k);
        }
    }
    public boolean daLiJeKombinacijaDobitna (Kombinacija izvucenaKombinacija) {
        for (int i = 0; i < kombinacije.size(); i++) {
            if (kombinacije.get(i).daLiJeIstaKombinacija(izvucenaKombinacija)) {
                return true;
            }
        }
        return false;
    }
    public void stampajListic () {
        for (int i = 0; i < kombinacije.size(); i++) {
            kombinacije.get(i).stampa();
        }
    }
}
