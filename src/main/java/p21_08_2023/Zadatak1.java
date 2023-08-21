package p21_08_2023;

public class Zadatak1 {
//    Napisati program koji sumira parne brojeve od 1 do 50 i na kraju programa ispisuje sumu.



    public static void main(String[] args) {

                int suma = 0;
        for (int i= 1; i < 51; i++) {
            if (i % 2 == 0) {
                suma = suma + i;
            }
        }
        System.out.println("Zbir parnih brojeva do 50 = " + suma);
    }
}
