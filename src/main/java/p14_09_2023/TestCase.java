package p14_09_2023;

import java.util.ArrayList;

public class TestCase {
//    ATRIBUTI
    private String iD;
    private String naziv;
    private ArrayList<TestStep> testSteps;
//    KONTRUKTORI

    public TestCase(String iD, String naziv) {
        this.iD = iD;
        this.naziv = naziv;
        this.testSteps = new ArrayList<>();
    }

//    GETERI

    public String getiD() {
        return iD;
    }

    public String getNaziv() {
        return naziv;
    }

    public ArrayList<TestStep> getTestSteps() {
        return testSteps;
    }
//    SETERI

    public void setiD(String iD) {
        this.iD = iD;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

//    public void setTestSteps(ArrayList<TestStep> testSteps) {
//        this.testSteps = testSteps;
//    }
//    METODE
    public void addTestStep (TestStep newTestStep) {
            this.testSteps.add(newTestStep);
    }
    public int numberFaildTest () {
        int counter = 0;
        for (int i = 0; i < this.testSteps.size(); i++) {
            if (!this.testSteps.get(i).validateOfValueEquals()) {
                counter ++;

            }
        }
        return counter;
    }
    public boolean stanjeTestCase () {
        boolean stanje = true;
        if (numberFaildTest() == 0) {
            stanje = true;
            System.out.println("Stanje test case je: " + stanje);
        } else {
            stanje = false;
            System.out.println("Stanje test case je: " + stanje);

        }
        return stanje;
    }
    public void stampajStatusTasteCase () {
        System.out.println(this.iD + " - " + this.naziv);
        for (int i = 0; i < testSteps.size(); i++) {
                this.testSteps.get(i).print();
        }
    }

}
