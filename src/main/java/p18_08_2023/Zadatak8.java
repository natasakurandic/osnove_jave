package p18_08_2023;

public class Zadatak8 {
//    Napisati program koji ispisuje SAMO PARNE brojeve od 1 do 100
    public static void main(String[] args) {

        System.out.println("Parni brojevi od 1 do 100");

        for (int i = 1; i < 101; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
