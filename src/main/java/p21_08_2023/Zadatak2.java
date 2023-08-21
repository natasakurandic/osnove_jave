package p21_08_2023;

public class Zadatak2 {
//    Napisati program koji od brojeva od 1 do 10 formira string koji ima spoj svih brojeva.
//    Primer izvrsenja:
//    String je 12345678910

    public static void main(String[] args) {

            String brojevi = "";
        for (int i = 1; i < 11; i++) {
            brojevi = brojevi +  i;

        }
        System.out.print("String je " + brojevi);
    }
}
