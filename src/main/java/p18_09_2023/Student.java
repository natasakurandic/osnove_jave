package p18_09_2023;

public abstract class Student {

    protected String imeIPrezime;
    protected int indeks;
    protected int godinaStudija;

    public Student(String imeIPrezime, int indeks, int godinaStudija) {
        this.imeIPrezime = imeIPrezime;
        this.indeks = indeks;
        this.godinaStudija = godinaStudija;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public int getIndeks() {
        return indeks;
    }

    public void setIndeks(int indeks) {
        this.indeks = indeks;
    }

    public int getGodinaStudija() {
        return godinaStudija;
    }

    public void setGodinaStudija(int godinaStudija) {
        this.godinaStudija = godinaStudija;
    }
    public abstract int cenaSkolarine ();
    public abstract boolean daLiJeStudentNaBudzetu ();
    public void stampa () {
        System.out.println(this.imeIPrezime + ", " + this.indeks + ", " + this.godinaStudija);
        System.out.println("Finansiranje: " + daLiJeStudentNaBudzetu());
        System.out.println("Cena skolarine: " + cenaSkolarine());
    }

}
