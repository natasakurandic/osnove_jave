package p15_09_2023;

public class Zadatak2 {
    public static void main(String[] args) {


        VisaKartica visa1 = new VisaKartica("Perica Miric" , 500, "1234-7654-0987-7865", 2025, 6 );
        MasterKartica master1 = new MasterKartica(500, "1234-7654-1515-7865", 2025, 6);

        visa1.izvrsiTransakciju(100);

        master1.izvrsiTransakciju(50);
        master1.odrzavanjeRacunaNaplata();

        System.out.println();
        visa1.stampajPodatkeKartice();
        master1.stampajPodatkeKartice();


    }
}
