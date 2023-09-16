package p14_09_2023;

import java.util.ArrayList;

public class FacebookPost {
//    Atributi
    private String imeIPrezimeKorisnikaPosta;
    private String tekstObjave;
    private ArrayList<Reakcija> reakcije;
//Kontruktori

//    public  FacebookPost () {
//
//    }
    public FacebookPost (String imeIPrezimeKorisnikaPosta, String tekstObjave) {
        this.imeIPrezimeKorisnikaPosta = imeIPrezimeKorisnikaPosta;
        this.tekstObjave = tekstObjave;
        this.reakcije = new ArrayList<>();
    }
//Geteri

    public String getImeIPrezimeKorisnikaPosta() {
        return imeIPrezimeKorisnikaPosta;
    }

    public String getTekstObjave() {
        return tekstObjave;
    }

    public ArrayList<Reakcija> getReakcije() {
        return reakcije;
    }
// METODE
    public void reaguj (Reakcija novaReakcija) {
        this.reakcije.add(novaReakcija);
    }
    public int brojReakcija (String tipReakcije) {
        int counterReakcija = 0;
        for (int i = 0; i < this.reakcije.size(); i++) {
                    if (this.reakcije.get(i).getTipReakcije().equals(tipReakcije)) {
                        counterReakcija++;
                    }
        }
        return counterReakcija;
    }
    public void stampaj () {
        System.out.println("Ime i prezime: " + this.imeIPrezimeKorisnikaPosta);
        System.out.println("Tekst objave: " + this.tekstObjave);
        System.out.println(" Smajli " + this.brojReakcija("smajli")+  " |" +
                " Srce " + this.brojReakcija("srce") + " |" +
                " Like " + this.brojReakcija("like") + " |" +
                " Cry " + this.brojReakcija("cry"));
    }
}
