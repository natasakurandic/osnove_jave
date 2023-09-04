package p25_08_2023;

public class Zadatak7 {
//// 7. Napisati metodu koja proverava da li je trougao pravougli. Metoda prima stranice trougla i hipotenuzu trougla.
////    Ako je trougao pravougli onda vraca true, u suptrotnom vraca false.
////    Trougao je pravougli ukoliko je a*a+b*b=c*c


    public static void main(String[] args) {
        int x = 4, y = 4, z = 5;

        boolean trougao = true;

                trougao = pravougliTrougao (x, y, z);
        if (trougao == true) {
            System.out.println("Trougao je pravougli");
        } else {
            System.out.println("Trougao nije pravougli");
        }
    }
    public static boolean pravougliTrougao (int a, int b, int c) {
        boolean trougao = true;
        if (a * a + b * b == c * c) {
            trougao = true;
        } else {
            trougao = false;
        }
        return trougao;
    }
}

