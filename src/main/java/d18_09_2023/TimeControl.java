package d18_09_2023;

public class TimeControl extends Control {
private boolean pomeranjeTrenutnogVremenaVidea;


    public TimeControl() {
    }
    public TimeControl (boolean pomeranjeTrenutnogVremenaVidea) {
        this.pomeranjeTrenutnogVremenaVidea = pomeranjeTrenutnogVremenaVidea;
    }

    @Override
    public void izvrsiAkciju(VideoPlayer noviVideoPlayer) {
        if (pomeranjeTrenutnogVremenaVidea) {
           if (noviVideoPlayer.getTrenutnoVremeVidea() < noviVideoPlayer.getDuzinaVidea()); {
             int akcijaUnapred = noviVideoPlayer.getTrenutnoVremeVidea() + 15;
             noviVideoPlayer.setTrenutnoVremeVidea(akcijaUnapred);
            }
        } else {
            if (noviVideoPlayer.getTrenutnoVremeVidea() > 0) {
                int akcijaUnazad = noviVideoPlayer.getTrenutnoVremeVidea() - 15;
                noviVideoPlayer.setTrenutnoVremeVidea(akcijaUnazad);
            }
        }
    }
}
