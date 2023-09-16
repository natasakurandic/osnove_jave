package p12_09_2023;

public class Korisnik {
    private String imeIPrezime;
    private String tipLicence;

    public Korisnik () {
        this.tipLicence = "basic";
    }
    public Korisnik (String korisnik, String tipLicence) {
        this.imeIPrezime = getImeIPrezime();
        this.tipLicence = "basic";
    }
    public String getImeIPrezime () {
        return imeIPrezime;
    }
    public String getTipLicence() {
        return tipLicence;
    }
    public void setImeIPrezime(String imeIPrezime) {
            this.imeIPrezime = imeIPrezime;
    }
    public void pretplatiSe (int uplata) {
        if (uplata == 100) {
            this.tipLicence = "pro";
        } else if (uplata == 150) {
            this.tipLicence = "premium";
        } else {
            tipLicence = "basic";
        }
    }
        public void bezPretplate () {
            this.tipLicence = "basic";
        }


    public int duzinaTrajanjaPoziva () {
        int trajanjePoziva = 0;
        if (this.tipLicence.equals("basic")) {
            trajanjePoziva = 40;
                return 40;
        } else if (this.tipLicence.equals("pro")) {
            trajanjePoziva = 240;
                return 240;
        } else if (this.tipLicence.equals("premium")) {
            trajanjePoziva = 1440;
                return 1440;
        }
        return 0;
    }
    public void print () {
        System.out.println(this.imeIPrezime);
    }
}
