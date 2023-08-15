package p15_08_2023;

public class Zadatak4 {
//    Napisati program koji na ekranu stampa podatke u formatu:
//    Sifra [SIFRA PROIZVODA]
//            [NAZIV PROIZVODA]  - $[CENA] - Popust [POPUST]%
//            [BOJA], [VELICINA]
//
//    Svaku informaciju za proizvod je potrebno cuvati u okviru zasebne promenljive.
//    Primer izvrsenja:
//    Sifra x932k20
//    Nike Patike - $90 - Popust 13.5%
//    Crna, 46.5


    public static void main(String[] args) {
        String sifraProizvoda = "x932k20";
        String nazivProizvoda = "Nike Patike";
        int cena = 90;
        double popust = 13.5;
        String boja = "Crna";
        double velicina = 46.5;

        System.out.println("Sifra" + " " + sifraProizvoda);
        System.out.print(nazivProizvoda + " " + "-" + " ");
        System.out.print(" " + "$" + cena + " ");
        System.out.println("Popust" + " " + popust + "%" );
        System.out.print(boja + "," + " ");
        System.out.println(velicina);


    }
}
