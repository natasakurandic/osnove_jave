package d24_08_2023;

import java.util.ArrayList;

public class Domaci3 {
    //    Napisati progam koji stampa niz u obrnutom redosledu tj. od zadnjeg elementa do nultog.
//    Ako je niz 1,2,4,5,7, stampa se 7,5,4,2,1
    public static void main(String[] args) {


        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(11);
        numbers.add(21);
        numbers.add(31);
        numbers.add(41);
        numbers.add(51);
        numbers.add(61);
        numbers.add(71);
        numbers.add(81);
        numbers.add(91);
        int duzinaNiza = numbers.size();
        ArrayList<Integer> numbers1 = new ArrayList<>();

        for (int i = duzinaNiza - 1; i >= 0; i--) {

            numbers1.add(numbers.get(i));
        }
        System.out.println(numbers1);
    }
}