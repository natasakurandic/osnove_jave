package d11_09_2023;

public class User {

    private String name;
    private String lastName;

    public User () {

    }
    public User (String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void print () {
        System.out.println("(" + this.name + ")(" + this.lastName + ")");
    }
}
