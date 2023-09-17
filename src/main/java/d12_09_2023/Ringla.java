package d12_09_2023;

public class Ringla {
//    Kreirati klasu Ringla koja ima:
//    tip ringle (obicna ili ekspres)
//    jacinu
//    za obicnu ringu jacina je u opsegu od 0 do 3
//    za ekspres ringlu jacina je u opsegu od 0 do 12
//    jacinu grejaca u kW (npr: 0.8, 1, 1.5, …)
//    konstruktor sa parametrima, postavljaju ce tip ringle i jacina grejaca (jacina atribut je po defaultu 0)
//    getter za jacinu
//    setteri ne postoje!!
//    privatnu metodu koja vraca maksimalan broj pojacavanja
//    za obicnu je 3, za ekspres je 12
//    metodu pojacaj ringlu - metoda povecava jacinu za 1 (pazite na opseg)
//    metodu iskljuci ringlu - metoda postavlja jacinu na 0
//    metodu koja vraca informaciju da li je ringla ukljucena ili iskljucena
//    metodu koja vraca potrosnju elektricne energije prema formuli
//100 / maksimalan broj pojacavanja * jacina * jacina grejaca * vremenski period koliko vec ringla radi
//    metoda prima broj sati kao parametar tj. vremenski period koliko ringla vec radi
//    metodu koja stampa podatke u formatu:

    private String tip;
    private int jacina;
    private double jacinaGrejaca;
    public Ringla(String tip, int jacina, double jacinaGrejaca) {
        this.tip = tip;
        this.jacina = 0;
        this.jacinaGrejaca = jacinaGrejaca;

    }
    public int getJacina() {
        return jacina;
    }
    private Integer maxBrojJacineRingle () {
        if (this.tip.equals("Obicna")) {
            return 3;
        } else if (this.tip.equals("Ekspres")) {
            return 12;
        }
        return 0;
    }
    public void pojacajRinglu () {
        if (this.jacina < maxBrojJacineRingle())
            this.jacina ++;
    }
    public void iskljuciRinglu () {
        this.jacina = 0;
    }
    public boolean daLiJeRinglaUkljucena () {
        if (this.jacina > 0) {
            return true;
        } else {
            return false;
        }
    }
    public double potrosnjaElektricneEnergije (int brojSati) {
        double potrosnjaElektricneEnergije = 0.0;
        potrosnjaElektricneEnergije = 100 / this.maxBrojJacineRingle() * this.jacina * this.jacinaGrejaca * brojSati;
        return potrosnjaElektricneEnergije;
    }
    public void stampa () {
        System.out.println("Da li je ringla ukljucena: " + daLiJeRinglaUkljucena());
        System.out.println("Tip ringle:" + this.tip);
        System.out.println("Jacina: " + this.jacina);
        System.out.println("Grejac: " + this.jacinaGrejaca + " kW");
    }
}
