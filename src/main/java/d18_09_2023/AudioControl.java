package d18_09_2023;

public class AudioControl extends Control {
    private boolean daLiPojacavamoZvuk;
    public AudioControl () {

    }
    public AudioControl(boolean daLiPojacavamoZvuk) {
        this.daLiPojacavamoZvuk = daLiPojacavamoZvuk;
    }

    public boolean isDaLiPojacavamoZvuk() {
        return daLiPojacavamoZvuk;
    }

    public void setDaLiPojacavamoZvuk(boolean daLiPojacavamoZvuk) {
        this.daLiPojacavamoZvuk = daLiPojacavamoZvuk;
    }

    @Override
    public void izvrsiAkciju(VideoPlayer noviVideoPlayer) {
        if (daLiPojacavamoZvuk) {
            if (noviVideoPlayer.getJacinaZvuka() < 100) {
            }
            int pojacajZvuk = noviVideoPlayer.getJacinaZvuka() + 1;
            noviVideoPlayer.setJacinaZvuka(pojacajZvuk);
        } else {
            if (noviVideoPlayer.getJacinaZvuka() > 0) {
                int smanjiZvuk = noviVideoPlayer.getJacinaZvuka() - 1;
                noviVideoPlayer.setJacinaZvuka(smanjiZvuk);
            }
        }
    }
}
