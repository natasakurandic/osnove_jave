package d08_09_2023;

public class FacebookPost {

    public String userPost;

    public String userProfile;
    public String post;

    public int numbLikes;

    public int numbShares;

    public int like () {
        return  numbLikes ++;
    }
    public int dislike () {
        return  numbLikes --;
    }
    public int share () {
        return  numbShares ++;
    }
    public void print () {
        System.out.println(userPost + " >>> " + userProfile);
        System.out.println(post);
        System.out.println("Likes " + numbLikes + " | Shares " + numbShares);
    }

}
