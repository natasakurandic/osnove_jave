package d11_09_2023;

public class FacebookPost {

    private String description;
    private User user;

    public FacebookPost () {

    }
    public FacebookPost (String description, User user) {
        this.description = description;
        this.user = user;
    }
    public void print () {
        System.out.println("(" + this.user.getName() + ")(" + this.user.getLastName() + ")");
        System.out.println(this.description);
    }
}
