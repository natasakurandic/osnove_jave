package d15_08_2023;

public class Vezbanje9 {
//    Napisati program koji vrsi procentualnu procenu u fazi skidanja fajla. Program od informacija cuva naziv
//    originalnog fajla, velicinu originalnog fajla u Mb (megabajtima) i velicinu skunutog dela fajla takodje u Mb.
//    Na kraju programa racuna i ispisuje koji je deo fajla skinut.
public static void main(String[] args) {
    String nazivFajla = "profile-image.png";
    int velicinaOrgFajla = 9;
    int velicinaSkinFajla = 4;
    int percentage = (velicinaSkinFajla * 100) / velicinaOrgFajla;
    System.out.println(nazivFajla+ " " + velicinaOrgFajla + "/" + velicinaSkinFajla);
    System.out.println("*********************");
    System.out.println("******** " + percentage + "%");
    System.out.println("*********************");
}
}
