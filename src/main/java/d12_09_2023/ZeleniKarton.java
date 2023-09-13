package d12_09_2023;

public class ZeleniKarton {
    private String imeIPrezimeStudenta;
    private String brojIndeksa;
    private String nazivPredmeta;
    private String imeIPrezimeProfesora;
    private int ocena;

    public ZeleniKarton () {

    }
    public ZeleniKarton (String imeIPrezimeStudenta, String brojIndeksa, String nazivPredmeta, String imeIPrezimeProfesora, int ocena) {
        this.imeIPrezimeStudenta = imeIPrezimeStudenta;
        this.brojIndeksa = brojIndeksa;
        this.nazivPredmeta = nazivPredmeta;
        this.imeIPrezimeProfesora = imeIPrezimeProfesora;
        this.ocena = ocena;
    }

    public String getImeIPrezimeStudenta() {
        return imeIPrezimeStudenta;
    }

    public String getBrojIndeksa() {
        return brojIndeksa;
    }

    public String getNazivPredmeta() {
        return nazivPredmeta;
    }

    public String imeIPrezimeProfesora() {
        return imeIPrezimeProfesora;
    }

    public int getOcena() {
        return ocena;
    }

    public void setImeIPrezimeStudenta(String imeIPrezimeStudenta) {
        this.imeIPrezimeStudenta = imeIPrezimeStudenta;
    }

    public void setBrojIndeksa(String brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }

    public void setNazivPredmeta(String nazivPredmeta) {
        this.nazivPredmeta = nazivPredmeta;
    }

    public void setImeIPrezimeProfesora(String getImeIPrezimeProfesora) {
        this.imeIPrezimeProfesora = imeIPrezimeProfesora;
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
    }
    public void dobijenaOcena(int ocena) {
        if (ocena < 5 || ocena > 10) {
            System.out.println("Ocena mora biti izmedju 5 i 10");
        }
            this.ocena = ocena;
    }
    public boolean jeIspitPolozen () {
        return ocena > 5;
    }
    public void print () {
        System.out.println("(" + this.nazivPredmeta + ") ( " + this.ocena);
        System.out.println("Student: " + this.imeIPrezimeStudenta + ", " + this.brojIndeksa);
        System.out.println("Prfesor: " + this.imeIPrezimeProfesora);
    }
}
