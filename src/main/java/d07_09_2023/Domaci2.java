package d07_09_2023;

public class Domaci2 {

//    Zadatak 2: Kreiranje klase "Automobil"
//    Napišite klasu "Automobil" sa atributima: marka (String), model (String) i godinaProizvodnje (int). U glavnoj
//    metodi kreirajte 2-3 objekta ove klase i postavite im vrednosti. Ispisati informacije o automobilima.

    public static void main(String[] args) {

        Automobili model1 = new Automobili();
        model1.marka = "Volvo";
        model1.model = "XC60 D4";
        model1.godinaProizvodnje = 2020;

        Automobili model2 = new Automobili();
        model2.marka = "Golf";
        model2.model = "5 TDI";
        model2.godinaProizvodnje = 2006;

        Automobili model3 = new Automobili();
        model3.marka = "Golf";
        model3.model = "7 Passat";
        model3.godinaProizvodnje = 2012;

        System.out.println("Marka: " + model1.marka + ", Model: " + model1.model + ", GodinaProizvodnje " + model1.godinaProizvodnje);
        System.out.println("Marka: " + model2.marka + ", Model: " + model2.model + ", GodinaProizvodnje " + model2.godinaProizvodnje);
        System.out.println("Marka: " + model3.marka + ", Model: " + model3.model + ", GodinaProizvodnje " + model3.godinaProizvodnje);
    }
}
