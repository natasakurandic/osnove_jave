package d19_09_2023;

public class Planina {
    private String imePlanine;
    private String drzavaUKojojSeNalaziPlanina;
    private int visinaPlanine;
    public Planina () {

    }
    public Planina(String imePlanine, String drzavaUKojojSeNalaziPlanina, int visinaPlanine) {
        this.imePlanine = imePlanine;
        this.drzavaUKojojSeNalaziPlanina = drzavaUKojojSeNalaziPlanina;
        this.visinaPlanine = visinaPlanine;
    }

    public String getImePlanine() {
        return imePlanine;
    }

    public void setImePlanine(String imePlanine) {
        this.imePlanine = imePlanine;
    }

    public String getDrzavaUKojojSeNalaziPlanina() {
        return drzavaUKojojSeNalaziPlanina;
    }

    public void setDrzavaUKojojSeNalaziPlanina(String drzavaUKojojSeNalaziPlanina) {
        this.drzavaUKojojSeNalaziPlanina = drzavaUKojojSeNalaziPlanina;
    }

    public int getVisinaPlanine() {
        return visinaPlanine;
    }

    public void setVisinaPlanine(int visinaPlanine) {
        this.visinaPlanine = visinaPlanine;
    }
}
