package p21_08_2023;

public class Zadatak4 {
//    Napisati program koji pronalazi 7 stepen broja 2. Koristeci FOR petlju
//    Izvrsenje:
//            2 na stepen 7 je 128


    public static void main(String[] args) {
            int osnova = 2;
            int stepen = 7;
            int prod = 1;
        for (int i = 0; i < stepen; i++) {
            prod = prod * osnova;
        }
        System.out.println("7. Stepen broja 2 = " + prod);
    }
}
