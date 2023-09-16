package p15_09_2023;

public class Student  extends Osoba{
    private int brojIndeksa;
    private int dugSkolarina;
    public Student (int brojIndeksa, int dugSkolarina, String imeIPrezime, String jmbg) {
        super(imeIPrezime, jmbg);
            this.brojIndeksa = brojIndeksa;
            this.dugSkolarina = dugSkolarina;
    }

    public Student() {
        super();
    }

    public int getBrojIndeksa() {
        return brojIndeksa;
    }

    public double getDugSkolarina() {
        return dugSkolarina;
    }

    public void uplataSkolarine (int iznosUplate) {
        dugSkolarina -=  iznosUplate;
    }
    @Override
    public void stampaj () {
        System.out.println(this.imeIPrezime + ", " + this.jmbg);
        System.out.println(this.brojIndeksa + "; " + this.dugSkolarina + " rsd");

    }
}
