package p14_09_2023;

public class Zadatak3 {
    public static void main(String[] args) {




        FacebookPost post1 = new FacebookPost("Zdravko Ciric", "Cao");

        Reakcija reakcija1 = new Reakcija("smajli", "Pera");
        Reakcija reakcija2 = new Reakcija("like", "Zivko");
        Reakcija reakcija3 = new Reakcija("srce", "Zika");
        Reakcija reakcija4 = new Reakcija("cry", "Milan");

                post1.reaguj(reakcija1);
                post1.reaguj(reakcija2);
                post1.reaguj(reakcija3);
                post1.reaguj(reakcija4);
                post1.reaguj(reakcija4);
                post1.reaguj(reakcija3);
                post1.reaguj(reakcija1);
                post1.reaguj(reakcija1);


                post1.stampaj();
    }
}
