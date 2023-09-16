package d15_09_2023;

public class Vezba2 {
    public static void main(String[] args) {
//        U glavnom programu kreirati igraca i dodati mu nekoliko kartona.

        IgracVezba igrac = new IgracVezba("Aleksandar Mitrovic", "1407990754398", 1990, 7, "napadac", true);

        Karton karton1 = new Karton("Zuti");
        Karton karton2 = new Karton("Zuti");
        Karton karton3 = new Karton("Crveni");

        igrac.dodajKarton(karton1);
        igrac.dodajKarton(karton2);
        igrac.dodajKarton(karton3);
        
        igrac.stampaj();
    }
}
