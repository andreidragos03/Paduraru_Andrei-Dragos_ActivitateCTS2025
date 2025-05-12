package ro.cts.main;

import ro.cts.modules.Autobuz;
import ro.cts.modules.Calator;
import ro.cts.modules.MijlocTransport;
import ro.cts.modules.Observer;

public class Main {
    public static void main(String[] args) {
        Observer calator1 = new Calator("calator 1");
        Observer calator2 = new Calator("calator 2");
        Observer calator3 = new Calator("calator 3");

        MijlocTransport autobuz = new Autobuz(100);
        autobuz.adaugaObserver(calator1);
        autobuz.adaugaObserver(calator2);
        autobuz.adaugaObserver(calator3);
        autobuz.stergeObserver(calator2);
    }
}
