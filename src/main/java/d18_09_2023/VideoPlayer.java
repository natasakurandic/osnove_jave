package d18_09_2023;

public class VideoPlayer {
    protected int duzinaVidea;
    protected int trenutnoVremeVidea;
    protected int jacinaZvuka;
    protected int kvalitetVidea;
    public VideoPlayer () {

    }
    public VideoPlayer(int duzinaVidea, int trenutnoVremeVidea, int jacinaZvuka, int kvalitetVidea) {
        this.duzinaVidea = duzinaVidea;
        this.trenutnoVremeVidea = trenutnoVremeVidea;
        this.jacinaZvuka = jacinaZvuka;
        this.kvalitetVidea = kvalitetVidea;
    }

    public int getDuzinaVidea() {
        return duzinaVidea;
    }

    public void setDuzinaVidea(int duzinaVidea) {
        this.duzinaVidea = duzinaVidea;
    }

    public int getTrenutnoVremeVidea() {
        return trenutnoVremeVidea;
    }

    public void setTrenutnoVremeVidea(int trenutnoVremeVidea) {
        this.trenutnoVremeVidea = trenutnoVremeVidea;
    }

    public int getJacinaZvuka() {
        return jacinaZvuka;
    }

    public void setJacinaZvuka(int jacinaZvuka) {
        this.jacinaZvuka = jacinaZvuka;
    }

    public int getKvalitetVidea() {
        return kvalitetVidea;
    }

    public void setKvalitetVidea(int kvalitetVidea) {
        this.kvalitetVidea = kvalitetVidea;
    }
    public void stampaj () {
        System.out.println("Vreme: " + this.trenutnoVremeVidea);
        System.out.println("Jacina zvuka: " +  this.jacinaZvuka);
        System.out.println("Kvalitet videa:" + this.kvalitetVidea);
    }
}
