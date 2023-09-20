package d18_09_2023;

public class QualityOptimizerControl extends  Control{
    private double brzinaInterneta;

    public QualityOptimizerControl() {
    }

    public QualityOptimizerControl(double brzinaInterneta) {
        this.brzinaInterneta = brzinaInterneta;
    }

    public double getBrzinaInterneta() {
        return brzinaInterneta;
    }

    public void setBrzinaInterneta(double brzinaInterneta) {
        this.brzinaInterneta = brzinaInterneta;
    }

    @Override
    public void izvrsiAkciju(VideoPlayer noviVideoPlayer) {
        double kvalitetVidea = this.brzinaInterneta * 10.1;
        if (kvalitetVidea < 144) {
            noviVideoPlayer.setKvalitetVidea(144);
        } else if (kvalitetVidea < 240) {
            noviVideoPlayer.setKvalitetVidea(240);
        } else if (kvalitetVidea < 360) {
            noviVideoPlayer.setKvalitetVidea(360);
        } else if (kvalitetVidea < 480) {
            noviVideoPlayer.setKvalitetVidea(480);
        } else if (kvalitetVidea < 720) {
            noviVideoPlayer.setKvalitetVidea(720);
        } else if (kvalitetVidea < 1080) {
            noviVideoPlayer.setKvalitetVidea(1080);
        }
    }
}
