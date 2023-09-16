package p15_09_2023;

public class UvodNasledjivanje {
    public static void main(String[] args) {

        Auto a = new Auto();
        a.setRegistracija(" NI-345-OP");
        a.setBrojVrata( 5);
        a.setMarka(" Audi");
        a.stampaj();
        a.dodajGas();
        a.dodajGas();
        a.dodajGas();
        a.dodajGas();

        System.out.println();

        Kamion k = new Kamion();
        k.setRegistracija(" NI-876-IJ");
        k.setNosivost( 2000);
        k.setMarka(" Volvo");
        k.stampaj();
        k.dodajGas();
        k.dodajGas();
        k.dodajGas();


        System.out.println("KRAJ");
    }
}
