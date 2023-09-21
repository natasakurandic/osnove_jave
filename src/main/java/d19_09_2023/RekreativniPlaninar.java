package d19_09_2023;

public class RekreativniPlaninar extends Planinar{

    private int tezinaOpreme;
    private String okrugRekreativnogPlaninara;
    private int maksimalanUsponPlaninaraBezOpreme;

    public RekreativniPlaninar(int idPlaninara, String punoIme, int tezinaOpreme, String okrugRekreativnogPlaninara, int maksimalanUsponPlaninaraBezOpreme) {
        super(idPlaninara, punoIme);
        this.tezinaOpreme = tezinaOpreme;
        this.okrugRekreativnogPlaninara = okrugRekreativnogPlaninara;
        this.maksimalanUsponPlaninaraBezOpreme = maksimalanUsponPlaninaraBezOpreme;
    }
    public int getTezinaOpreme() {
        return tezinaOpreme;
    }
    public String getOkrugRekreativnogPlaninara() {
        return okrugRekreativnogPlaninara;
    }
    public int getMaksimalanUsponPlaninaraBezOpreme() {
        return maksimalanUsponPlaninaraBezOpreme;
    }
    @Override
    public void stampaj() {
        System.out.println("Rekreativac, id: (" + this.idPlaninara + ")" );
        System.out.println("Ime i prezime: (" + this.punoIme + ")");
        System.out.println("Okrug: (" + this.okrugRekreativnogPlaninara + ")");
    }
    @Override
    public double clanarinaPlaninara() {
        int clanarinaRekreativca = 1000;
        return  clanarinaRekreativca;
    }
    @Override
    public boolean uspesanUspon(Planina novaPlanina) {
        double najveciUsponManjiodVisinePlanine = 0;
        if (this.maksimalanUsponPlaninaraBezOpreme - this.tezinaOpreme * 50 > novaPlanina.getVisinaPlanine()) {
            return true;
        } else {
            return false;
        }
    }
}

