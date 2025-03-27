package ro.cts.main;

import ro.cts.clase.IBuilder;
import ro.cts.clase.Rezervare;
import ro.cts.clase.RezervareBuilder;

public class Main {
    public static void main(String[] args){
        IBuilder rezervareBuilder = new RezervareBuilder();

        Rezervare rezervare1 = rezervareBuilder.buildRezervare("Ionescu Marius");
        Rezervare rezervare2 = rezervareBuilder.setAsezareGeam(true).
                setDecorareMasa(true).
                setGenMuzica("rock").
                buildRezervare("Tache Ionescu");

        System.out.println(rezervare1.toString());
        System.out.println(rezervare2.toString());
        System.out.println(rezervareBuilder.setAsezareGeam(true).
                setGenMuzica("jazz").
                buildRezervare("Piedone"));
    }
}
