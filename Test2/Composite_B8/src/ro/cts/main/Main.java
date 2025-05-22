package ro.cts.main;

import ro.cts.modules.Sectiune;
import ro.cts.modules.Structura;
import ro.cts.modules.Subsectiune;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        Structura sectiune1 = new Sectiune("Bauturi");
        Structura sectiune2 = new Sectiune("Fel Principal");
        Structura sectiune3 = new Sectiune("Peste");
        Structura sectiune4 = new Sectiune("Paste");
        Structura sectiune5 = new Sectiune("Carne");

        Structura subsectiune1 = new Subsectiune("Pastrav", 80);
        Structura subsectiune2 = new Subsectiune("Penne Siciliene", 60);
        Structura subsectiune3 = new Subsectiune("Tagliatelle al Tartufo", 90);
        Structura subsectiune4 = new Subsectiune("Muschi de vita", 180);
        Structura subsectiune5 = new Subsectiune("Limonada", 18);

        sectiune1.adaugaNod(subsectiune5);
        sectiune3.adaugaNod(subsectiune1);
        sectiune4.adaugaNod(subsectiune2);
        sectiune4.adaugaNod(subsectiune3);
        sectiune5.adaugaNod(subsectiune4);
        sectiune2.adaugaNod(sectiune3);
        sectiune2.adaugaNod(sectiune4);
        sectiune2.adaugaNod(sectiune5);

        List<Structura> listaStructuri = new ArrayList<Structura>();
        listaStructuri.add(sectiune1);
        listaStructuri.add(sectiune2);
        for(Structura structura:listaStructuri) {
            structura.descriereStructura();
        }
    }
}
