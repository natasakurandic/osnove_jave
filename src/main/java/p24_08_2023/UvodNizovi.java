package p24_08_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class UvodNizovi {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        ArrayList<String> cars = new ArrayList<>();

        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
            s.next();
        String x1 = cars.get(0);
        String x2 = cars.get(1);
        String x3 = cars.get(2);

        cars.set(2, "Nissan");

        System.out.println(cars.size());

        System.out.println("KRAJ");
    }
}
