package ro.cts.main;

import ro.cts.modules.Calator;
import ro.cts.modules.CardCalatorie;
import ro.cts.modules.IMetodaPlata;
import ro.cts.modules.PlataSMS;

public class Main {
    public static void main(String[] args) {
        IMetodaPlata metodaPlata = new CardCalatorie(5);
        Calator calator = new Calator("Andreea", metodaPlata);
        calator.platesteBilet(5);
        calator.setMetodaPlata(new PlataSMS());
        calator.platesteBilet(5);
        calator.setMetodaPlata(metodaPlata);
        calator.platesteBilet(5);
    }
}
