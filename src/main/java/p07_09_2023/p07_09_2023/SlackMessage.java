package p07_09_2023;

public class SlackMessage {

    public String tekstPoruke;

    public String imeIPrezime;

    public String datumIVreme;

    public String poslednjeAzuriranjeU;

    public void stampajPoruku() {
        System.out.println(this.imeIPrezime + " - " + this.datumIVreme);
        System.out.println(this.tekstPoruke);
    }
    public void azuriranje(String noviTekst, String azuriranjeU) {
        this.tekstPoruke = noviTekst;
        this.datumIVreme = azuriranjeU;
    }
}
