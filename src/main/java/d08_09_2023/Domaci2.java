package d08_09_2023;

public class Domaci2 {

    public static void main(String[] args) {

        FacebookPost profilJedan = new FacebookPost();
            profilJedan.userPost = "Petar Peric";
            profilJedan.userProfile = "Ana Anic";
            profilJedan.post = "Cao ja sam Petar";
            profilJedan.numbLikes = 5;
            profilJedan.numbShares = 1;

        FacebookPost profilDva = new FacebookPost();
            profilDva.userProfile = "Jovan Jovic";
            profilDva.userPost = "Koja Kojic";
            profilDva.post = "Cao ja sam Jovan. Kako si?";
            profilDva.numbLikes = 3;
            profilDva.numbShares = 1;

        System.out.println(profilJedan.like());
        System.out.println(profilDva.like());

        System.out.println(profilJedan.like());
        System.out.println(profilDva.like());

        System.out.println(profilJedan.like());
        System.out.println(profilDva.like());

        System.out.println(profilJedan.dislike());
        System.out.println(profilDva.dislike());

        System.out.println(profilJedan.share());
        System.out.println(profilDva.share());

        profilJedan.print();
        profilDva.print();

    }
}
