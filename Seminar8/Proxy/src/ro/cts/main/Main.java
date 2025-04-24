package ro.cts.main;

import ro.cts.modules.IRezervare;
import ro.cts.modules.ProxyNrPersoane;
import ro.cts.modules.ProxyOra;
import ro.cts.modules.Rezervare;

public class Main {
    public static void main(String[] args) {
        IRezervare rezervare = new Rezervare();
        rezervare.rezerva("Gigel", 5, 15);

        IRezervare proxy = new ProxyNrPersoane(rezervare);
        proxy.rezerva("Gigel", 3, 15);

        IRezervare proxyOra = new ProxyOra(proxy);
        proxyOra.rezerva("Popescu", 5, 19);
    }
}
