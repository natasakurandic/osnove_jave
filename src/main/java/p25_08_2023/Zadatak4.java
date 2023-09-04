package p25_08_2023;

public class Zadatak4 {
//    Napisati funkciju koja stampa zbir, razliku, proizvod i kolicnik za dva prosledjena broja. Brojevi su ulazni
//    parametri funkcije. U gravnom programu pozvati nekoliko puta funkciju sa razlicitim prosledjenim vrednostima
    public static void main(String[] args) {
        int firstNumber = 8;
        int secondNumber = 4;



        matematikaOp(firstNumber, secondNumber);

    }

    public static void matematikaOp (int firstNumber, int secondNumber) {
        int suma = firstNumber + secondNumber;
        int razlika = firstNumber - secondNumber;
        int proizvod = firstNumber * secondNumber;
        int kolicnik = firstNumber / secondNumber;
        System.out.println("First Number: " + firstNumber);
        System.out.println("Second Number: " + secondNumber);
        System.out.println("Suma " + suma);
        System.out.println("Razilka " + razlika);
        System.out.println("Prozivod " + proizvod);
        System.out.println("Kolicnik " + kolicnik);
    }
}
