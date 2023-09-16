package p14_09_2023;

public class Zadatak1 {
    public static void main(String[] args) {

//        Reziser ivana = new Reziser();
//            ivana.setPunoIme("Ivana Ivic");

        Reziser natasa = new Reziser("Natasa Kurandic");


        Film film1 = new Film("Film 1", 2020);
        Film film2 = new Film("Film 2", 2022);
        Film film3 = new Film("Film 3", 2023);

        natasa.dodajFilm(film1);
        natasa.dodajFilm(film2);
        natasa.dodajFilm(film3);

        natasa.stampaj();
    }
}
