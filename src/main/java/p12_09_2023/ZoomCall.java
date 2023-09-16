package p12_09_2023;

public class ZoomCall {
    private String linkZaPoziv;
    private String password;
    private Korisnik host;
    private Korisnik guest;

    public ZoomCall (String linkZaPoziv, String password, Korisnik host) {
            this.linkZaPoziv = linkZaPoziv;
            this.password = password;
            this.host = host;

    }

    public Korisnik getGuest() {
        return guest;
    }

    public Korisnik getHost() {
        return host;
    }

    public String getLinkZaPoziv() {
        return linkZaPoziv;
    }

    public String getPassword() {
        return password;
    }

    public void setGuest(Korisnik guest) {
        this.guest = guest;
    }

    public void print () {
        System.out.println("Zoom Call: " + this.linkZaPoziv);
        System.out.println("Host: " + this.host.getImeIPrezime());
 //       if (this.guest != null); {
            System.out.println("Guest: " + this.guest.getImeIPrezime());
 //       }
        System.out.println("MAaximum video call negth is " + this.host.duzinaTrajanjaPoziva() + "min.");
    }
    public void pokreniPoziv () {
        System.out.println("URL" + this.linkZaPoziv);

    }

}


