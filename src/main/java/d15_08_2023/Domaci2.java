package d15_08_2023;

public class Domaci2 {
//    Napisati program koji stampa podatke o kreditnoj kartici u formatu kao na slici. Od informacija se pamti broj
//    kartice (16 cifara sa razmacima), mesec i godina do kada vazi kartica, kao i ime i prezime vlasnika kartice.
//    Kartica se stampa sa zvezdicama i ne brinite ukoliko neka zvezdica mrdne i nije u liniji to ce zavisiti od
//    duzine imena.
//    Napomena: svaka informacija mora da bude u okviru posebne promenljive.
public static void main(String[] args) {
    String cardNumber = "1234 1232 4321 3333";
    String dateExpire = "11/26";
    String name       = "Natasa Kurandic";


    System.out.println("****************************************");
    System.out.println("*   Credit Card                        *");
    System.out.println("*     ****                             *");
    System.out.println("*     ****                             *");
    System.out.println("*      "+ cardNumber +"             *");
    System.out.println("*                    "+ dateExpire +"             *");
    System.out.println("*                                      *");
    System.out.println("*     " +    name +  "                  *");
    System.out.println("****************************************");
}

}
