package d14_09_2023;

import java.util.ArrayList;

public class Kombinacija {
//    Kreirati klasu Kombinacija koja ima:
//    id kombinacije (String)
//    niz brojeva - niz je od 7 broja (ArrayList<Integer>)
//    konstruktor koji prima id i 7 broja koji se u konstruktoru dodaju u niz.
//    gettere za atribute Kombinacija(String id, int jedan, int dva, …)
//    metodu koja proverava da li this kombinacija ima iste brojeve kao prosledjena kombinacija.
//    Zaglavlje metode je:
//    public boolean daLiJeIstaKombinacija( Kombinacija k)
//    metoda vraca true ako su svi elementi na istim pozicija isti
//    npr: this [0] == k [0], this [1] == k [1] ….
//    metodu za stampu koja stampa podatke u formatu
//    ID: id kombinacije
//    brojevi: 1, 3, 5, 14, 15, 21, 23

    private String idKombinacije;
    private ArrayList<Integer> nizBrojeva;

    public Kombinacija(String idKombinacije, int brojJedan, int brojDva, int brojTri, int brojCetiri, int brojPet, int brojSest, int brojSedam) {
        this.idKombinacije = idKombinacije;
        this.nizBrojeva = new ArrayList<>();
        nizBrojeva.add(brojJedan);
        nizBrojeva.add(brojDva);
        nizBrojeva.add(brojTri);
        nizBrojeva.add(brojCetiri);
        nizBrojeva.add(brojPet);
        nizBrojeva.add(brojSest);
        nizBrojeva.add(brojSedam);
    }

    public String getIdKombinacije() {
        return idKombinacije;
    }

    public ArrayList<Integer> getNizBrojeva() {
        return nizBrojeva;
    }

    public boolean daLiJeIstaKombinacija( Kombinacija k) {
        for (int i = 0; i < nizBrojeva.size(); i++) {
            if (nizBrojeva.get(i) != k.getNizBrojeva().get(i)) {
                return false;
            }
        }
        return true;
    }
    public void stampa () {
        System.out.println("ID: " + this.idKombinacije);
        System.out.println(this.nizBrojeva);
    }
}
