package d12_09_2023;

public class Physical_person {
    private String nameAndLastName;
    private String idNumber;
    private String jmbg;
    private boolean previouslyPurshased;

    public Physical_person () {

    }
    public Physical_person (String nameAndLastName, String idNumber, String jmbg, boolean previouslyPurshased) {
        this.nameAndLastName = nameAndLastName;
        this.idNumber = idNumber;
        this.jmbg = jmbg;
        this.previouslyPurshased = true;
    }
    public String getNameAndLastName() {
        return nameAndLastName;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public String getJmbg() {
        return jmbg;
    }

    public boolean isPreviouslyPurshased() {
        return previouslyPurshased;
    }

    public void setNameAndLastName(String nameAndLastName) {
        this.nameAndLastName = nameAndLastName;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public void setPreviouslyPurshased(boolean previouslyPurshased) {
        this.previouslyPurshased = previouslyPurshased;
    }
    public void print () {
        System.out.println(this.nameAndLastName + ", " + this.idNumber);
    }
}
