package d17_08_2023;

import java.util.Scanner;

public class Domaci5 {
//    Napisati program koji u zavisnosti od operatora koji unosi korisnik sa tastature (operator je string i moze imati
//            vrednosti +, - , *, /) racuna  i ispisuje na ekranu odgovarajuci zbir, razliku, proizvod ili kolicnik
//    za dva broja a i b uneta sa tastature.

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter Numb A");
            int a = s.nextInt();
        System.out.println("Enter Numb B");
            int b = s.nextInt();
        System.out.println("Enter operator (+ , -, *, /)");
         String operator = s.next();

         if (operator.equals("+")) {
             System.out.println("Result: " + (a + b));
       }
        if (operator.equals("-")) {
            System.out.println("Result: " + (a - b));
      }
        if (operator.equals("*")) {
            System.out.println("Result: " + (a * b));
       }
       if (operator.equals("/")) {
           System.out.println("Result: " + (a / b));
       }

    }
}
