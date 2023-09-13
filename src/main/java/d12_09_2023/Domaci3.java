package d12_09_2023;

public class Domaci3 {

    public static void main(String[] args) {


    Racun racunJedan = new Racun("234-56784-10", "Pera Zikic", 3000);
    Racun racunDva = new Racun("250-675432-87", "Ana Peric", 5000);


        racunJedan.print();
        racunDva.print();
        Transakcija transakcija1 = new Transakcija("123", racunJedan, racunDva);
        transakcija1.izvrsiTransakciju(150);
        racunJedan.print();
        racunDva.print();
    }

}