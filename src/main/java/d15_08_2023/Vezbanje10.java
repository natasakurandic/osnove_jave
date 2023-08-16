package d15_08_2023;

public class Vezbanje10 {
//    Napisati program koji vrsi grubu procenu koliko je vremena potrebno da se skine fajl.
//    Program od informacija cuva naziv fajla, velicinu fajla i brzinu skidanja. Velicina fajla je u Mb a brzina skidana u
//    Mb/s (megabajt u sekundi)
public static void main(String[] args) {
        String file = "img.jpg";
        int sizeFile = 21;
        int speedDw = 3;
        int estTime = sizeFile / speedDw;
    System.out.println("File: " + file);
    System.out.println("Size: " + sizeFile + "Mb");
    System.out.println("Download speed: " + speedDw + "Mb/s");
    System.out.println("Esstimted time: " + estTime + "s");
}
}
