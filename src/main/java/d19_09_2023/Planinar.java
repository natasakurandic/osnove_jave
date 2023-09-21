package d19_09_2023;

public abstract class Planinar {
    protected int idPlaninara;
    protected String punoIme;

    public Planinar(int idPlaninara, String punoIme) {
        this.idPlaninara = idPlaninara;
        this.punoIme = punoIme;
    }
    public int getIdPlaninara() {
        return idPlaninara;
    }
    public String getPunoIme() {
        return punoIme;
    }

    public abstract void stampaj ();
    public abstract double clanarinaPlaninara ();
    public abstract boolean uspesanUspon (Planina novaPlanina);
}
