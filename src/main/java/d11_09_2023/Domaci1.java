package d11_09_2023;

public class Domaci1 {
//    Kreirati klasu Autor koja ima
//-ime i prezime
//-konstuktore koje mislite da su vam potrebni
//-gettere i settere za atribute
//-metodu print koja stampa u formatu:
//            (ime autora) (prezime autora)
//    Kreirati klasu Knjiga koji ima:
//            -ISBN
//-naziv
//-godina izdanja
//-autor
//-konstuktore koje mislite da su vam potrebni
//-gettere i settere za atribute
//-metodu print koja stampa u formatu (izbegavati dupliranje koda):
//            (ISBN)
//            (naziv) - (godina izdanja)
//    autor: (ime autora) (prezime autora)
//
//    U glavnom programu napraviti vise autora sa vise knjiga.


    public static void main(String[] args) {

        Author authorOne = new Author("Nikolas",  "Sparks");
        Author authorTwo = new Author("Lusinda", "Rajli");

        Book bookOne = new Book("987654786", "Message in the bottle", 2002, authorOne);
        Book bookTwo = new Book ("244772836", "The olive three", 2016, authorTwo);

            authorOne.print();
            authorTwo.print();

            bookOne.print();
            bookTwo.print();

    }
}
