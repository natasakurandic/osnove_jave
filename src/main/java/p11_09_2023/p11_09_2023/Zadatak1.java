package p11_09_2023;

public class Zadatak1 {
    public static void main(String[] args) {

        Student studentJedan = new Student();
            studentJedan.setPrezime("Peric");
            studentJedan.setBrojIndeksa(28);
            studentJedan.setIme("Perica");
            studentJedan.setDaLiJeNaBudzetu(true);

            studentJedan.getIme();
            studentJedan.getPrezime();
            studentJedan.getBrojIndeksa();
            studentJedan.getDaLiJeNaBudzetu();

            Student studentDva = new Student();
            studentDva.setPrezime("Ana");
            studentDva.setBrojIndeksa(35);
            studentDva.setIme("Andjelkovic");
            studentDva.setDaLiJeNaBudzetu(false);

            studentDva.getIme();
            studentDva.getPrezime();
            studentDva.getBrojIndeksa();
            studentDva.getDaLiJeNaBudzetu();



        studentJedan.stampaj();
        studentDva.stampaj();


    }
}
