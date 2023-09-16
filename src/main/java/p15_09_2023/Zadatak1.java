package p15_09_2023;

public class Zadatak1 {
    public static void main(String[] args) {
        Student student1 = new Student(345, 10000, "Pera Peric", "9863549667");

        Student student2 = new Student(355, 5000, "Ana Anic", "346945859");

            Profesor profesor1 = new Profesor("Matematika", 60000, "Mihajlo Mikic", "123456675");


        Profesor profesor2 = new Profesor("Srpski", 70000, "Milan Zikic","345678987");



            student1.uplataSkolarine(6000);
            student1.stampaj();
            System.out.println();

            profesor1.povecajPlatu(10);
            profesor1.stampaj();

    }
}
