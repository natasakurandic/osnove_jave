package p08_09_2023;

import p07_09_2023.SlackMessage;

public class Zadatak2 {
    public static void main(String[] args) {

        p07_09_2023.SlackMessage prvaPoruka = new p07_09_2023.SlackMessage();
        prvaPoruka.tekstPoruke = "Cao!";
        prvaPoruka.imeIPrezime = "Ana Anic";
        prvaPoruka.datumIVreme = "26.08.2021 18:55";

        p07_09_2023.SlackMessage drugaPoruka = new SlackMessage();
        drugaPoruka.tekstPoruke = "Hello!";
        drugaPoruka.imeIPrezime = "Ina Inic";
        drugaPoruka.datumIVreme = "28.08.2021 19:55";

        System.out.println("[" + prvaPoruka.imeIPrezime + "] - [" + prvaPoruka.datumIVreme + "]");
        System.out.println("[" + prvaPoruka.tekstPoruke + "]");

        System.out.println("[" + drugaPoruka.imeIPrezime + "] - [" + drugaPoruka.datumIVreme + "]");
        System.out.println("[" + drugaPoruka.tekstPoruke + "]");


    }

    }

