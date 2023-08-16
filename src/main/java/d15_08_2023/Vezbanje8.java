package d15_08_2023;

public class Vezbanje8 {
//    Napisati program koji za datu boju trazi kontrastnu boju. Svaka boja se sadrzi od 3 komponente RGB(red, green, blue).
//    Svaka komponenta boje je u opsegu od 0 do 255(informativno)
//    Program nalazi kontrastnu boju tako sto svaku komponentu boje oduzme od 255.
//    Primer izvrsenja:

    public static void main(String[] args) {
            int r = 180;
            int g = 39;
            int b = 50;
            int kontrastR = 255 - r;
            int kontrastG = 255 - g;
            int kontrastB = 255 - b;
          String kontrastnaBoja = "255 - r, 255 - g, 255 - b";
        System.out.println("Originalna boja: RGB " + "(" + r + ", " + g + ", " + b + ")");
        System.out.println("Kontrastna boja: RGB " + "(" + kontrastR + ", " + kontrastG + ", " + kontrastB + ")");

}
}
