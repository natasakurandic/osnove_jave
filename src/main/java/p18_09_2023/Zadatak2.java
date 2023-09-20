package p18_09_2023;

import java.util.ArrayList;

public class Zadatak2 {
    public static void main(String[] args) {

        JednakostranicniTrougao trougao1 = new JednakostranicniTrougao(3);
        JednakostranicniTrougao trougao2 = new JednakostranicniTrougao(5);

        Pravougaonik pravougaonik1 = new Pravougaonik(4, 3);
        Pravougaonik pravougaonik2 = new Pravougaonik(7, 4);
        Pravougaonik pravougaonik3 = new Pravougaonik(5, 8);


        ArrayList<Figura> figure = new ArrayList<>();
            figure.add(pravougaonik1);
            figure.add(pravougaonik2);
            figure.add(pravougaonik3);
            figure.add(trougao1);
            figure.add(trougao2);

            for (int i = 0; i < figure.size(); i++) {
                figure.get(i).stampa();
            }
            double povrsine = 0;
            double obimi = 0;
        for (int i = 0; i < figure.size(); i++) {
            povrsine = povrsine + figure.get(i).povrsina();
            obimi = obimi + figure.get(i).obim();
        }
        System.out.println("Zbir povrsina svih figura iz niza je: " + povrsine);
        System.out.println("Zbir obima svih figura iz niza je: " + obimi);

    }
}
