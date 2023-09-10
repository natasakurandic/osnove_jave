package d08_09_2023;

public class Domaci1 {

    public static void main(String[] args) {

        Proizvod prviProizvod = new Proizvod();
            prviProizvod.naziv = "Keks sa cokoladom";
            prviProizvod.cena = 80.0;
            prviProizvod.tezinaUGramima = 200.0;

            Proizvod drugiProizvod = new Proizvod();
                drugiProizvod.naziv = "Semenke bundeve";
                drugiProizvod.cena = 120.0;
                drugiProizvod.tezinaUGramima = 100.0;

                prviProizvod.stampaj();
                drugiProizvod.stampaj();

                prviProizvod.povecanje(10);
                drugiProizvod.povecanje(10);


        System.out.println(prviProizvod.popust(20));
        System.out.println(drugiProizvod.popust(30));

        System.out.println(prviProizvod.postarina());
        System.out.println(drugiProizvod.postarina());


    }
}
