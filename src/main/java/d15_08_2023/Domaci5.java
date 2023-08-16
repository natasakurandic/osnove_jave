package d15_08_2023;

public class Domaci5 {
//    Napisati program koji racuna i ispisuje povrsinu i obim trougla. KOREN BROJA 3 neka bude konstanta 1.73.
//    Za stranicu trougla postavite proizvoljnu vrednost.
public static void main(String[] args) {

        int a = 5;
        int obimTrougla = 3 * a;
        double povrsinaTrougla = (a * a * 1.73)/4;

        System.out.println("Obim je " + obimTrougla);
        System.out.println("Povrsina je " + povrsinaTrougla);

}
}
