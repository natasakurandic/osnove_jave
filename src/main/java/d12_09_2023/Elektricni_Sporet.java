package d12_09_2023;

public class Elektricni_Sporet {
    private String markaSporeta;
    private int garancija;
    private int maxBrojUkljucenihRingli;
    private Ringla goreLevo;
    private Ringla goreDesno;
    private Ringla doleLevo;
    private Ringla doleDesno;


    public Elektricni_Sporet(String markaSporeta, int garancija, int maxBrojUkljucenihRingli, Ringla goreLevo,Ringla goreDesno, Ringla doleLevo, Ringla doleDesno) {
        this.markaSporeta = markaSporeta;
        this.garancija = garancija;
        this.maxBrojUkljucenihRingli = maxBrojUkljucenihRingli;
        this.goreLevo = goreLevo;
        this.goreDesno = goreDesno;
        this.doleLevo = doleLevo;
        this.doleDesno = doleDesno;
    }
    public String getMarkaSporeta() {
        return markaSporeta;
    }
    public int getGarancija() {
        return garancija;
    }
    public int getMaxBrojUkljucenihRingli() {
        return maxBrojUkljucenihRingli;
    }

    public Ringla getGoreLevo() {
        return goreLevo;
    }

    public Ringla getGoreDesno() {
        return goreDesno;
    }

    public Ringla getDoleLevo() {
        return doleLevo;
    }

    public Ringla getDoleDesno() {
        return doleDesno;
    }
        int brojUkljucenihRingli = 0;
    public void pojacaj (int pozicija) {
        if (pozicija == 1) {
            this.goreLevo.pojacajRinglu();
            brojUkljucenihRingli ++;
            if (maxBrojUkljucenihRingli < brojUkljucenihRingli) {
                iskljuci(2);
                iskljuci(3);
                iskljuci(4);
            }
        }
        if (pozicija == 2) {
            this.goreDesno.pojacajRinglu();
            brojUkljucenihRingli ++;
            if (maxBrojUkljucenihRingli < brojUkljucenihRingli) {
                iskljuci(1);
                iskljuci(3);
                iskljuci(4);
            }
        }
        if (pozicija == 3) {
            this.doleLevo.pojacajRinglu();
            brojUkljucenihRingli ++;
            if (maxBrojUkljucenihRingli < brojUkljucenihRingli) {
                iskljuci(1);
                iskljuci(2);
                iskljuci(4);
            }
        }
        if (pozicija == 4) {
            this.doleDesno.pojacajRinglu();
            brojUkljucenihRingli ++;
            if (maxBrojUkljucenihRingli < brojUkljucenihRingli) {
                iskljuci(1);
                iskljuci(2);
                iskljuci(3);
            }
        }
    }
    public void iskljuci (int pozicija) {
        if (pozicija == 1) {
            this.goreLevo.iskljuciRinglu();
            this.goreLevo.daLiJeRinglaUkljucena();
        }
        if (pozicija == 2) {
            this.goreDesno.iskljuciRinglu();
            this.goreDesno.daLiJeRinglaUkljucena();
        }
        if (pozicija == 3) {
            this.doleLevo.iskljuciRinglu();
            this.doleLevo.daLiJeRinglaUkljucena();
        }  if (pozicija == 4) {
            this.doleDesno.iskljuciRinglu();
            this.doleDesno.daLiJeRinglaUkljucena();
        }

    }
    public double ukupnaPotrosnjaSporeta (int vreme) {
      return  this.goreLevo.potrosnjaElektricneEnergije(vreme) + this.goreDesno.potrosnjaElektricneEnergije(vreme) +
                this.doleLevo.potrosnjaElektricneEnergije(vreme) + this.doleDesno.potrosnjaElektricneEnergije(vreme);
    }
    public void stampaj () {
        System.out.println(this.markaSporeta + " - " + this.garancija);
        System.out.println("Ringle: ");
        System.out.println("Gore levo:");
        this.goreLevo.stampa();
        System.out.println("Gore desno:");
        this.goreDesno.stampa();
        System.out.println("Dole levo:");
        this.doleLevo.stampa();
        System.out.println("Dole desno");
        this.doleDesno.stampa();

    }
    }

