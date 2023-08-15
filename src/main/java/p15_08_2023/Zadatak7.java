package p15_08_2023;

public class Zadatak7 {
//    Napisati program koji racuna povrsinu kvadrata stranice a, i povrsinu kruga poluprecnika r. PI = 3.14. Povrsina kruga je r (na kvadrat) * pi
//    Primer izvrsenja:
//    a: 5
//    Povrsina kvadrata je 25
//    r: 3
//    Povrsina kruga je 28.26

    public static void main(String[] args) {
        double a = 6.0;
        double r = 4.0;
        double PI = 3.14;
        double PovrsinaKvadrata = a * a;
        double PovrsinaKruga = r * r * PI;
        System.out.println("Povrsina kvadrata " + PovrsinaKvadrata);
        System.out.println("Povrsina kruga je " + PovrsinaKruga);
    }

}
