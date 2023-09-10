package d08_09_2023;

public class Proizvod {

    public String naziv;
    public double cena;
    public double tezinaUGramima;

    public void stampaj () {
        System.out.println("{Naziv: " + naziv + "}," + "{Cena: " + cena + " din.}," + "{Tezina: " + tezinaUGramima + " g.}");
    }
    public void povecanje (double povecanje) {
        povecanje = cena + 10;
        System.out.println("{Naziv: " + naziv + "}," + "{Cena: " + povecanje + " din.}," + "{Tezina: " + tezinaUGramima + " g.}");

    }
        public double popust (double popust) {
        if ((popust > 0) && (popust < 100)) {
            double popustProizvoda = (cena * popust) / 100;
            return cena - popustProizvoda;
        } else {
            return cena;
        }
    }
        public Integer postarina () {
        if (tezinaUGramima <= 100) {
            int postarinaDo100 = 200;
            return postarinaDo100;
        } else if ((tezinaUGramima > 100) && (tezinaUGramima <= 500)) {
            int postarinaDo500 = 400;
            return postarinaDo500;
        } else {
            int postarinaPreko500 = 1000;
            return postarinaPreko500;
        }
        }
}
