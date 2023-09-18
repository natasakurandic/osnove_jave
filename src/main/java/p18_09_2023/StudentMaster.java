package p18_09_2023;

public class StudentMaster extends Student {
    public StudentMaster(String imeIPrezime, int indeks, int godinaStudija) {
        super(imeIPrezime, indeks, godinaStudija);
    }

    @Override
    public int cenaSkolarine() {
        return 100000;
    }

    @Override
    public boolean daLiJeStudentNaBudzetu() {
        if (getGodinaStudija() < 2) {
            return true;
        } else  {
            return false;
        }
    }
}
