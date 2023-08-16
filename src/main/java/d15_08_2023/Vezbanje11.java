package d15_08_2023;

public class Vezbanje11 {
//    Napisati program koji izracunava velicinu slike na temelju dostupnih podataka. Program cuva sledece informacije o
//    slici: Naziv slike,  Rezoluciju (duzina i visina).
//    Na osnovu rezolucije, program racuna ukupan broj piksela u slici. Svaki piksel zauzima 1b (bajt).
//    Teorijski primer: ako je rezolucija slike 20x10, tada slika sadrzi ukupno 200 piksela, čime je njena velicina 200b.
//    Nakon toga, program treba da prikaze velicinu slike izrazenu u kilobajtima (kb) i megabajtima (mb),
//    uzimajuci u obzir sledece konverzije: 1 kb = 1024b,    1 Mb= 1024 kb.
public static void main(String[] args) {
    String imgName = "profile-img.jpg";
    int lengthImg = 1085;
    int heightImg = 1447;
    int numpPixels = lengthImg * heightImg;
    double sizeKb = numpPixels / 1024;
    double sizeMb = sizeKb / 1024;
    System.out.println("File: " + imgName);
    System.out.println("Resolution: " + lengthImg+ " x "+  heightImg);
    System.out.println("Size (kb): " + sizeKb);
    System.out.println("Size (Mb): " + sizeMb);

}

}
