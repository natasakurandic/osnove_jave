package p14_09_2023;

import java.util.ArrayList;

public class Pasta {
    //ATRIBUTI
    private ArrayList<Sastojak> sastojci;

    //konstruktor
    public Pasta () {
        this.sastojci = new ArrayList<>();
    }
    //geter
    public ArrayList<Sastojak> getSastojci() {
        return sastojci;
    }
//metode
    public void dodajSastojak (Sastojak noviSastojak) {
        this.sastojci.add(noviSastojak);
    }
    public int cenaPaste () {
        int suma = 0;
        for (int i = 0; i < this.sastojci.size(); i++) {
            suma = suma + this.sastojci.get(i).getCena();
        }
        return suma;
    }
    public void stampa () {
        System.out.println("Pasta je sa sastojcima: ");
            for (int i = 0; i < sastojci.size(); i++ ) {
                System.out.println(this.sastojci.get(i).getNaziv() + " " + this.sastojci.get(i).getCena() + ".din");

            }
        System.out.println("Cena paste je " + cenaPaste() + ".din");
    }
    public void obrisi (String nazivSastojka) {
        for (int i = 0; i <this.sastojci.size(); i++) {
            if (this.sastojci.get(i).getNaziv().equals(nazivSastojka)) {
                this.sastojci.remove(i);
            }
        }
    }
}
