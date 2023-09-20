package p18_09_2023;

import p18_09_2023.Figura;

public class Pravougaonik extends Figura {

    private int stranicaA;
    private int stranicaB;

    public Pravougaonik(int stranicaA, int stranicaB) {
        this.stranicaA = stranicaA;
        this.stranicaB = stranicaB;
    }

    public int getStranicaA() {
        return stranicaA;
    }

    public void setStranicaA(int stranicaA) {
        this.stranicaA = stranicaA;
    }

    public int getStranicaB() {
        return stranicaB;
    }

    public void setStranicaB(int stranicaB) {
        this.stranicaB = stranicaB;
    }

    @Override
    public double povrsina() {
        double p = this.stranicaA * stranicaB;
        return p;
    }

    @Override
    public double obim() {
        double o = 2 * (this.stranicaA + this.stranicaB);
        return o;
    }
}
