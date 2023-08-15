package p15_08_2023;

public class UvodPromenljive {

    public static void main(String[] args) {

        String firstName= "Natasa";
        String lastName = "Kurandic";
        int yearOfBirth = 1993;
        int currentYear = 2023;
        float avg = 5.8f;
        boolean active = true;

        int age = currentYear - yearOfBirth;
        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("Age: " + age);
        System.out.println("Active: " + active);

    }
}
