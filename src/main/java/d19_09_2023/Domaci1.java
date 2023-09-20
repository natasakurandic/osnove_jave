package d19_09_2023;

import java.util.ArrayList;

public class Domaci1 {
//    U glavnom programu kreirati jednu Korpu i u nju dodati nekoliko Ambalaza razlicitih tipova i istestirati sve metode
//    i ispisati ukupnu cenu sa popustom.
    public static void main(String[] args) {


        ArrayList<Ambalaza> ambalazeTetrapak = new ArrayList<>();
        Tetrapak t1 = new Tetrapak("456-987", "Mleko", 1, 2, true, 130);
        Tetrapak t2 = new Tetrapak("855-987", "Jogurt", 1, 2, false, 170);
        Tetrapak t3 = new Tetrapak("855-786", "Sok jabuka", 2, 3, true, 250);
        ambalazeTetrapak.add(t1);
        ambalazeTetrapak.add(t2);
        ambalazeTetrapak.add(t3);

        ArrayList<Ambalaza> ambalazaStaklena = new ArrayList<>();
        StaklenaAmbalaza sAmb1 = new StaklenaAmbalaza("123-478", "Zajecarsko Pivo ", 2, 3, 30, true, 80.0);
        StaklenaAmbalaza sAmb2 = new StaklenaAmbalaza("570-976", "Stella Artois", 1, 2, 0, false, 150.0);
        StaklenaAmbalaza sAmb3 = new StaklenaAmbalaza("123-489", "Orangina", 4, 5, 50, true, 800.0);
        StaklenaAmbalaza sAmb4 = new StaklenaAmbalaza("690-889", "Vino balon", 5, 6, 0, false, 1500.0);
        ambalazaStaklena.add(sAmb1);
        ambalazaStaklena.add(sAmb2);
        ambalazaStaklena.add(sAmb3);
        ambalazaStaklena.add(sAmb4);

        SuperKartica superKartica = new SuperKartica(123456, "John Doe", 200);
        Korpa korpa1 = new Korpa();
        korpa1.dodajAmbalazu(sAmb1);
        korpa1.dodajAmbalazu(sAmb2);
        korpa1.dodajAmbalazu(t2);
        korpa1.dodajAmbalazu(t3);

        double ukupnaCenaSaPopustom = korpa1.cenaKorpe(superKartica);
        System.out.println("Ukupna cena korpe sa popustom: " + ukupnaCenaSaPopustom);

        System.out.println();
        System.out.println();

        double ukupnaCenaAmbalaza = korpa1.ukupnaCenaAmbalaza(300);
        System.out.println("Cena ambalaza " + ukupnaCenaAmbalaza);

        System.out.println();

        korpa1.izbaciAmbalazu("123-478");

        double cenaKorpeSaIzbacenimArtiklom = korpa1.cenaKorpe(superKartica);
        System.out.println("Cena: " + cenaKorpeSaIzbacenimArtiklom);

    }
}
