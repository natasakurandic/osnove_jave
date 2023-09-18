package p18_09_2023;

public class StudentOsnovnih extends Student {
    public StudentOsnovnih(String imeIPrezime, int indeks, int godinaStudija) {
        super(imeIPrezime, indeks, godinaStudija);
    }

    @Override
    public int cenaSkolarine() {
        return 90000;
    }

    @Override
    public boolean daLiJeStudentNaBudzetu() {
        if (getGodinaStudija() < 5) {
            return true;
        } else  {
            return false;
        }
    }
}
