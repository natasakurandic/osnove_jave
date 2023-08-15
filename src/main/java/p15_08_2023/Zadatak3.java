package p15_08_2023;

public class Zadatak3 {
//    Napisati program koji na ekranu stampa podatke u formatu:
//            [IME I PREZIME]
//            [BROJ TELEFONA], [ULICA I BROJ], [GRAD]
//            [EMAIL]

    public static void main(String[] args) {
        String imeIPrezime = "Natasa Kurandic";
        String brojTelefona = "0600232970";
        String ulicaIBroj = "Mokranjceva 92";
        String grad = "Nis";
        String email = "natasa.kurandic93@outlook.com";

        System.out.println(imeIPrezime);
        System.out.print(brojTelefona + "," + " "  );
        System.out.print(ulicaIBroj + "," + " " );
        System.out.println(grad);
        System.out.println(email);


    }
}
