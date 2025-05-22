package ro.cts.main;

import ro.cts.modules.IRezervare;
import ro.cts.modules.Rezervare;
import ro.cts.modules.RezervareProxy;

public class Main {
    public static void main(String[] args) {
        IRezervare rezervare = new Rezervare();
        IRezervare rezeervareProxy = new RezervareProxy(rezervare);
        rezeervareProxy.efectueazaRezervare("Andreea", 5);
        rezeervareProxy.efectueazaRezervare("Dragos", 5);
        rezeervareProxy.efectueazaRezervare("Cineva", 2);
    }
}
