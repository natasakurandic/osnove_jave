package d12_09_2023;

public class Transakcija {

    private String idTransakcije;
    private Racun racunSaKogSePrenoseSredstva;

    private Racun racunNaKojiSePrenoseSredstva;

    public Transakcija () {

    }
    public Transakcija (String idTransakcije,Racun racunSaKogSePrenoseSredstva, Racun racunNaKojiSePrenoseSredstva) {
        this.idTransakcije = idTransakcije;
        this.racunSaKogSePrenoseSredstva = racunSaKogSePrenoseSredstva;
        this.racunNaKojiSePrenoseSredstva = racunNaKojiSePrenoseSredstva;
    }

    public String getIdTransakcije() {
        return idTransakcije;
    }

    public Racun getRacunSaKogSePrenoseSredstva() {
        return racunSaKogSePrenoseSredstva;
    }

    public Racun getRacunNaKojiSePrenoseSredstva() {
        return racunNaKojiSePrenoseSredstva;
    }

    public void setIdTransakcije(String idTransakcije) {
        this.idTransakcije = idTransakcije;
    }

    public void setRacunSaKogSePrenoseSredstva(Racun racunSaKogSePrenoseSredstva) {
        this.racunSaKogSePrenoseSredstva = racunSaKogSePrenoseSredstva;
    }

    public void setRacunNaKojiSePrenoseSredstva(Racun racunNaKojiSePrenoseSredstva) {
        this.racunNaKojiSePrenoseSredstva = racunNaKojiSePrenoseSredstva;
    }
    public double provizija (int sredstvaZaPrenos) {
        if (sredstvaZaPrenos < 4500) {
            return 45;
        } else {
            return 0.01 * sredstvaZaPrenos;
        }
    }
    public void izvrsiTransakciju (int sredstvaZaPrenos) {
        double ukupniIznosZaSkidanje = sredstvaZaPrenos + provizija(sredstvaZaPrenos);
        this.racunSaKogSePrenoseSredstva.skiniSaRadcuna(ukupniIznosZaSkidanje);
        this.racunNaKojiSePrenoseSredstva.uplatiNaRacun(sredstvaZaPrenos);
        System.out.println("Transakcija izvrsena");
    }
}
