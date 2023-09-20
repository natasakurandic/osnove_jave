package d18_09_2023;

public class Domaci1 {
    public static void main(String[] args) {

        VideoPlayer videoPlayer1 = new VideoPlayer(180, 50, 45, 144);
        videoPlayer1.stampaj();

        System.out.println();
        TimeControl time1 = new TimeControl(true);
            time1.izvrsiAkciju(videoPlayer1);
            time1.izvrsiAkciju(videoPlayer1);
            time1.izvrsiAkciju(videoPlayer1);


        AudioControl audio1 = new AudioControl(false);
            audio1.izvrsiAkciju(videoPlayer1);
            audio1.izvrsiAkciju(videoPlayer1);
            audio1.izvrsiAkciju(videoPlayer1);
            audio1.izvrsiAkciju(videoPlayer1);

            QualityOptimizerControl quality1 = new QualityOptimizerControl(50);
                quality1.izvrsiAkciju(videoPlayer1);

        videoPlayer1.stampaj();

    }
}
