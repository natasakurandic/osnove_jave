package p11_09_2023;

public class Reziser {

    private String imeIPrezime;

    private int starost;


    public Reziser () {

    }
    public Reziser (String imeIPrezime, int starost) {
        this.imeIPrezime = imeIPrezime;
        this.starost = starost;
    }
    public String getImeIPrezime () {
        return imeIPrezime;
    }
    public int getStarost () {
        return starost;
    }
    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }
    public void setStarost(int starost) {
        this.starost = starost;
    }
    public void stampaj () {
        System.out.println(imeIPrezime + " " + starost);
    }


}
