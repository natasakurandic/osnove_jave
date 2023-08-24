package p24_08_2023;

import java.util.ArrayList;

public class Zadatak7 {
//    Napisati program koji simulira digitalni meni za pasta bar. Program ima dva niza informacija paste i cene.
//    Program stampa meni u formatu
//    naziv paste ………………………….cena rsd
//    Informacije su uparene po poziciji, to znaci da je:
//    pasta na poziciji 0, sa cenom sa pozicije 0
//    pasta na poziciji 1, sa cenom sa pozicije 1
//            …..
//
//    Primer izvrsenja:
//    AGLIO E OLIO ………………… 500 rsd
//    PRIMAVERA…………………340 rsd
//    ARRABBIATA ………………….420 rsd
//    NAPOLITANA ………………….440 rsd
//    POLLO E SPINACI ………………….550 rsd

    public static void main(String[] args) {

        ArrayList<String> pasta = new ArrayList<>();
        pasta.add("AGLIO E OLIO .....");
        pasta.add("PRIMAVERA .....");
        pasta.add("ARABIATA ......");
        pasta.add("NAPOLITANA .......");
        pasta.add("POLLO E SPINACHI .......");

        ArrayList<String> price = new ArrayList<>();
        price.add("500 rsd");
        price.add("340 rsd");
        price.add("420 rsd");
        price.add("440 rsd");
        price.add("550 rsd");
                for (int i = 0; i < pasta.size(); i++) {
                  String pastaName = pasta.get(i);
                  String pricePasta = price.get(i);
                  System.out.println(pastaName + pricePasta);
                }


    }


}

