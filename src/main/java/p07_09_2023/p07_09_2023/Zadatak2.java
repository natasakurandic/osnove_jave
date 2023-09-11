package p07_09_2023;

public class Zadatak2 {
    public static void main(String[] args) {

        SlackMessage prvaPoruka = new SlackMessage();
        prvaPoruka.tekstPoruke = "Cao!";
        prvaPoruka.imeIPrezime = "Ana Anic";
        prvaPoruka.datumIVreme = "26.08.2021 18:55";

        SlackMessage drugaPoruka = new SlackMessage();
        drugaPoruka.tekstPoruke = "Hello!";
        drugaPoruka.imeIPrezime = "Ina Inic";
        drugaPoruka.datumIVreme = "28.08.2021 19:55";

        System.out.println("[" + prvaPoruka.imeIPrezime + "] - [" + prvaPoruka.datumIVreme + "]");
        System.out.println("[" + prvaPoruka.tekstPoruke + "]");

        System.out.println("[" + drugaPoruka.imeIPrezime + "] - [" + drugaPoruka.datumIVreme + "]");
        System.out.println("[" + drugaPoruka.tekstPoruke + "]");

        prvaPoruka.stampajPoruku();
        prvaPoruka.azuriranje("Novi tekst",  "26.08.2021 18:45");
        System.out.println("*****");
        prvaPoruka.stampajPoruku();
        drugaPoruka.stampajPoruku();
        drugaPoruka.azuriranje("Novi tekst",  "28.08.2021 19:45");
    }

    }

