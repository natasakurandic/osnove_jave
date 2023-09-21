package d19_09_2023;

public class VezbanjePlaninskiDom {
    public static void main(String[] args) {


        PlaninskiDom planinskiDomRtanj = new PlaninskiDom("Rtanjski dom", 2000);
        Planina StaraPlanina = new Planina("Stara Planina", "Srbija", 1500);

        RekreativniPlaninar rekreativac1 = new RekreativniPlaninar(234, "Petar Peric", 20, "Svrljig", 2000);
        RekreativniPlaninar rekreativac2 = new RekreativniPlaninar(299, "Mitar Miric", 25, "Paracin", 1800);
        RekreativniPlaninar rekreativac3 = new RekreativniPlaninar(204, "Vuk Vukic", 15, "Nis", 2500);

        Alpinista alpinista1 = new Alpinista(10, "Nenad Nenadic", 8);
        Alpinista alpinista2 = new Alpinista(11, "Alisa Anic", 10);
        Alpinista alpinista3 = new Alpinista(13, "Mira Zikic", 3);

        planinskiDomRtanj.uclaniPlaninara(rekreativac1);
        planinskiDomRtanj.uclaniPlaninara(rekreativac2);
        planinskiDomRtanj.uclaniPlaninara(rekreativac3);
        planinskiDomRtanj.uclaniPlaninara(alpinista1);
        planinskiDomRtanj.uclaniPlaninara(alpinista2);
        planinskiDomRtanj.uclaniPlaninara(alpinista3);

        System.out.println(planinskiDomRtanj.mesecniPrihodDoma());
        System.out.println(planinskiDomRtanj.planinariKojiCeSeUspesnoPopeti(StaraPlanina));
        planinskiDomRtanj.izbaciPlaninara(299);
        planinskiDomRtanj.stampajPlaninskiDom();
        System.out.println();
        System.out.println(planinskiDomRtanj.mesecniPrihodDoma());

    }
}
