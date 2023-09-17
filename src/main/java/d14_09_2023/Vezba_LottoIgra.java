package d14_09_2023;

public class Vezba_LottoIgra {
    public static void main(String[] args) {

        Kombinacija kombinacija1 = new Kombinacija("1.Kombinacija", 3, 5, 8,22, 30,33, 36);
        Kombinacija kombinacija2 = new Kombinacija("2.Kombinacija", 2, 7, 10,25, 32,33, 39);
        Kombinacija kombinacija3 = new Kombinacija("3.Kombinacija", 3, 5, 8,29, 34,36, 38);
        Kombinacija kombinacija4 = new Kombinacija("4.Kombinacija", 2, 6, 8,18, 20,23, 39);
        Kombinacija kombinacija5 = new Kombinacija("5.Kombinacija", 3, 3, 18,21, 31,33, 39);
        Kombinacija kombinacija6 = new Kombinacija("6.Kombinacija", 1, 7, 15,23, 29,34, 39);
        Kombinacija kombinacija7 = new Kombinacija("7.Kombinacija", 6, 8, 10,13, 21,26, 33);

        Listic listic1 = new Listic();
        listic1.dodajKombinaciju(kombinacija1);
        listic1.dodajKombinaciju(kombinacija2);
        listic1.dodajKombinaciju(kombinacija3);
        listic1.dodajKombinaciju(kombinacija4);
        listic1.dodajKombinaciju(kombinacija5);
        listic1.dodajKombinaciju(kombinacija6);
        listic1.dodajKombinaciju(kombinacija7);

        Kombinacija izvucenaKombinacija = new Kombinacija("Izvucena1", 7,8,10, 13, 21,26,33);


        if (listic1.daLiJeKombinacijaDobitna(izvucenaKombinacija)) {
            System.out.println("Imate dobitnu kombinaciju. Cestitamo");
        } else {
            System.out.println("Zao nam je, nemate dobitnu kombinaciju u vasem listicu");
        }
        listic1.stampajListic();
    }
}
