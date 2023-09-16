package p12_09_2023;

public class Kupac {

    private String imeiPrezime;
    private ClanskaKarta clanskaKarta;

    public Kupac (String imeiPrezime, ClanskaKarta brojKartice) {
        this.imeiPrezime = imeiPrezime;
        this.clanskaKarta = brojKartice;
    }


    public String getImeiPrezime () {
        return imeiPrezime;
    }
    public ClanskaKarta getClanskaKarta () {
        return clanskaKarta;
    }
    public void set (String imeiPrezime) {
        this.imeiPrezime = imeiPrezime;
    }
    public void print () {
        System.out.println(this.imeiPrezime + " - " + this.clanskaKarta);
    }
}
