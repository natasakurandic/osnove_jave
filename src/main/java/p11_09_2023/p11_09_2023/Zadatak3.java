package p11_09_2023;

public class Zadatak3 {

    public static void main(String[] args) {

        Reziser reziserJedan = new Reziser("Sinisa Kovacevic", 54);

        Film filmJedan = new Film("Lavirint",2005, reziserJedan);




        filmJedan.stampaj();
//        reziserJedan.stampaj();


    }
}
