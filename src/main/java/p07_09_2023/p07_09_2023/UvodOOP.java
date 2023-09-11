package p07_09_2023;

public class UvodOOP {
    public static void main(String[] args) {


        User m  = new User();
        m.ime = "Milan";
        m.email = "milan@gmail.com";
        m.starost = 30;

        User p = new User();
        p.ime = "Petar";
        p.email = "petar@gmail.com";
        p.starost = m.starost + 3;

        m.stampaj();

        p.stampaj();

    }
    public static void stampajUsera (String ime, String email, int starost) {
        System.out.println("Ime: " + ime);
        System.out.println("Email: " + email);
        System.out.println("Starost: " + starost);
    }
}
