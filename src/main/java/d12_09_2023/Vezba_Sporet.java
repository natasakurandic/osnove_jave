package d12_09_2023;

public class Vezba_Sporet {
    public static void main(String[] args) {

        Ringla ringla1 =new Ringla("Obicna", 3, 1);
        Ringla ringla2 =new Ringla("Obicna", 2, 0.8);
        Ringla ringla3 =new Ringla("Ekspres", 12, 1.5);
        Ringla ringla4 =new Ringla("Ekspres", 10, 1);



        Elektricni_Sporet beko = new Elektricni_Sporet("Beko", 5, 4, ringla1,ringla2 ,ringla3 ,ringla4);

        ringla3.pojacajRinglu();
        beko.pojacaj(2);

        System.out.println();
        beko.ukupnaPotrosnjaSporeta(3);
        System.out.println();
        beko.stampaj();
    }
}
