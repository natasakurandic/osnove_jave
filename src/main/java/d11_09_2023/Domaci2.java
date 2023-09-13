package d11_09_2023;

public class Domaci2 {
//    Kreirati klasu Korisnik koja ima
//            ime
//    prezime
//    gettere i settere za ime i prezime
//    konstuktore koje mislite da su vam potrebni
//    metoda koja stampa u formatu:
//            (ime) (prezime)
//
//    Kreirati klasu FacebookPost
//            opis
//    korisnik (referenca na korisnika koji je kreirao post)
//    konstrukore koje mislite da su vam potrebni
//    metoda print, stampa u formatu:
//            (ime) (prezime)
//            (opis post-a)
//
//    U main metodi, kreirati jedan facebook post i jednog korisnika i pozvati svaku od metoda

    public static void main(String[] args) {

        User userOne = new User("Sreten", "Sretenovic");
            userOne.print();
        FacebookPost  postOne = new FacebookPost("Hello world!", userOne);
            postOne.print();
    }
}
