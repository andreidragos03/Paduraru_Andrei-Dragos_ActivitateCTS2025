package ro.cts.main;

import ro.cts.clase.IBuilder;
import ro.cts.clase.Rezervare;
import ro.cts.clase.RezervareBuilder;

public class Main {
    public static void main(String[] args){
        IBuilder rezervareBuilder = new RezervareBuilder("Ionescu Nicolae");
        Rezervare rezervare;
        Rezervare rezervare1;

        IBuilder rezervareBuilder1 = new RezervareBuilder("Tache Ionescu");
        rezervare = rezervareBuilder.buildRezervare();
        rezervare1 = rezervareBuilder1.setGenMuzica("rock").buildRezervare();

        System.out.println(rezervare.toString());
        System.out.println(rezervare1.toString());
    }
}
