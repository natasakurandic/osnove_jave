package d15_09_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class Domaci1 {
//    U glavnom programu kreirati 2 igraca i 2 trenera, i istestirati metode a zatim kreirati niz igraca i niz trenera,
//    na kraju programa ispisati sve igrace i trenere. Podatke za igrace i trenere unosi korisnik sa tastature.
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        ArrayList<Trener> treneri = new ArrayList<>();
        ArrayList<Igrac> igraci = new ArrayList<>();


        for (int i = 0; i < 2; i++) {
            System.out.println("Unesite ime i prezime trenera:");
            String imeIPrezimeT = s.nextLine();
            System.out.println("Unesite jmbg trenera:");
            String jmbgT = s.nextLine();
            System.out.println("Unesite godinu rodjenja trenera:");
            int godinaRodjenjaT = s.nextInt();
            s.nextLine();
            System.out.println("Unesite godine iskustva trenera");
            int iskustvo = s.nextInt();
            s.nextLine();
            System.out.println("Unesite tip trenera");
            String tipTrenera = s.nextLine();
                treneri.add(new Trener(imeIPrezimeT,jmbgT,godinaRodjenjaT,iskustvo,tipTrenera));
        }

        for (int i = 0; i < 2; i++) {
            System.out.println("Unesite ime i prezime igraca:");
            String imeIPrezimeI = s.nextLine();
            System.out.println("Unesite jmbg igraca:");
            String jmbgI = s.nextLine();
            System.out.println("Unesite godinu rodjenja igraca");
            int godinaRodjenjaI = s.nextInt();
            s.nextLine();
            System.out.println("Broj koji nosi igrac:");
            int brojNaDresuI = s.nextInt();
            s.nextLine();
            System.out.println("Pozicija na kojoj igra igrac:");
            String pozicijaI = s.nextLine();
            System.out.println("Da li je igrac kapiten");
            boolean daLiJeKapitenI = s.nextBoolean();
            s.nextLine();
                igraci.add(new Igrac(brojNaDresuI,pozicijaI, daLiJeKapitenI, imeIPrezimeI, jmbgI, godinaRodjenjaI));

        }
        System.out.println();

        for (int i = 0; i < treneri.size(); i++) {
            treneri.get(i).stampaj();
        }
        System.out.println();

        for (int i = 0; i < igraci.size(); i++) {
            igraci.get(i).stampaj();
        }
    }


}


