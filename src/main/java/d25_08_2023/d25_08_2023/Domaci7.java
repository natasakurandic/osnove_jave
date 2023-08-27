package d25_08_2023;

import java.util.ArrayList;

public class Domaci7 {

//    Napisati funkciju koja za tri prosledjena broja vraca najmanji od ta 3. U glavnom programu iskoristi
//    funkciju i ispisti odgovarajucu poruku.
//    Ako se proslede brojevi 4,6,1 u poziv metode, metoda vraca 1
//    Ako se proslede brojevi 4,6,33 u poziv metode, metoda vraca 4


    public static void main(String[] args) {
        ArrayList<Integer> brojevi = new ArrayList<>();
        brojevi.add(4);
        brojevi.add(1);
        brojevi.add(2);


        System.out.println(najmanjiBroj(brojevi));

    }

    public static Integer najmanjiBroj(ArrayList<Integer> niz){
        int minBroj = niz.get(0);

        for (int i = 0; i<niz.size(); i++){
            if(niz.get(i)<minBroj){
               minBroj = niz.get(i);
            }
        }

        return minBroj;
    }
}
