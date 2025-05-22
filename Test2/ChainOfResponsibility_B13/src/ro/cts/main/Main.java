package ro.cts.main;

import ro.cts.modules.Handler;
import ro.cts.modules.Libera;
import ro.cts.modules.Ocupata;
import ro.cts.modules.Rezervata;

public class Main {
    public static void main(String[] args) {
        Handler rezervata = new Rezervata();
        Handler ocupata = new Ocupata();
        Handler libera = new Libera();

        rezervata.setUrmatorul(ocupata);
        ocupata.setUrmatorul(libera);

        rezervata.gestioneazaMasa(1);
        rezervata.gestioneazaMasa(2);
        ocupata.gestioneazaMasa(2);
        libera.gestioneazaMasa(3);
    }
}
