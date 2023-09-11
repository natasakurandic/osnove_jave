package p11_09_2023;

import java.util.Random;

public class Users {

    private int id;
    private String ime;

    private String email;

    private int starost;

//    public Users() {
//        Random random = new Random();
//        this.id = random.nextInt(1000);
//    }
    public Users(String ime, String email,int starost) {
        this.ime = "Milan";
        this.email = "milan@gmail.com";
        this.starost = 28;
    }


    public String getIme() {
        return this.ime;

    }
    public void setIme(String ime) {
        this.ime = ime;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public void setStarost(int starost) {
        this.starost = starost;
    }

}
