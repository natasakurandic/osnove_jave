package p15_09_2023;

public class Kamion extends  Vozilo {

    private int nosivost;
    public  Kamion () {
        super();
    }

    public Kamion(String registracija, String marka, int brzina, int nosivost) {
        super(registracija, marka, brzina);
        this.nosivost = nosivost;
    }
    public int getNosivost() {
        return nosivost;
    }
    public void setNosivost(int nosivost) {
        this.nosivost = nosivost;
    }

    @Override
    public void stampaj () {
        super.stampaj();
        System.out.println("NOSIVOST" + this.nosivost);
    }


}
