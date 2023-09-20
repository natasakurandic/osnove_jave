package p18_09_2023;

import p18_09_2023.Figura;

public class JednakostranicniTrougao  extends Figura {

    private int stranicaA;

    public JednakostranicniTrougao(int stranicaA) {
        this.stranicaA = stranicaA;
    }
    public int getStranicaA() {
        return stranicaA;
    }

    public void setStranicaA(int stranicaA) {
        this.stranicaA = stranicaA;
    }

    @Override
    public double povrsina() {
        double p = ((this.stranicaA * this.stranicaA ) * Math.sqrt(3.0)) / 4;
        return p;
    }

    @Override
    public double obim() {
        double o = this.stranicaA * this.stranicaA * this.stranicaA;
        return o;
    }
}
