package p15_09_2023;

public class Auto extends Vozilo {

    private int brojVrata;

    public Auto () {
        super ();
    }
    public Auto (String registracija, String marka, int brzina, int brojVrata) {
        super(registracija, marka, brzina);
        this.brojVrata = brojVrata;
    }

    public int getBrojVrata() {
        return brojVrata;
    }
    public void setBrojVrata(int brojVrata) {
        this.brojVrata = brojVrata;
    }

    @Override
    public void stampaj () {
        System.out.println("REGISTRACIJA" + this.registracija);
        System.out.println("MARKA" + this.marka);
        System.out.println("BRZINA " + this.brzina);
        System.out.println("BROJ VRATA " + this.brojVrata);
    }


}
