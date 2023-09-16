package p14_09_2023;

public class TestStep {
//    ATRIBUTI
    private String opis;
    private String actualValue;
    private String expectedValue;
    private String eroorMessage;

//    KONSTRUKTORI
    public TestStep(String opis, String actualValue, String expectedValue, String eroorMessage) {
        this.opis = opis;
        this.actualValue = actualValue;
        this.expectedValue = expectedValue;
        this.eroorMessage = eroorMessage;
    }
//    GETERI

    public String getOpis() {
        return opis;
    }

    public String getActualValue() {
        return actualValue;
    }

    public String getExpectedValue() {
        return expectedValue;
    }

    public String getEroorMessage() {
        return eroorMessage;
    }
//    METODE
    public boolean validateOfValueEquals () {
        boolean validateValue = true;
        if (this.actualValue.equals(this.expectedValue)) {
            return validateValue;
        } else {
            return validateValue = false;
        }
    }
    public void print () {
        System.out.println("| Opis: " + this.opis + " |");
        if (validateOfValueEquals()) {
            System.out.println("| Status Passed |");
        } else {
            System.out.println("| Status Failed | " +  this.getEroorMessage());
        }

    }
}
