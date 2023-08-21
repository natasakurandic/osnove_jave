package p21_08_2023;

public class Zadatak3 {
//    Napisati program koji od brojeva od 1 do 10 formira string tako da se na pocetnu vrednost stringa … (tri tacke)
//    sa leve strane dodaju neparni brojevi a sa desne parni.
//    Primer izvrsenja:
//            97531…246810


    public static void main(String[] args) {

            String x = "...";


        for (int i = 1; i < 11; i++) {
            if (i % 2 == 0) {
                x = x + i;
            }
            else {
                x = i + x;
            }
        }
        System.out.println("Dobijeni string je " + x);
    }
}
