package ro.cts.factory.main;

import ro.cts.factory.clase.FelMancare;
import ro.cts.factory.fabrici.Supa;
import ro.cts.factory.fabrici.SupaFactory;
import ro.cts.factory.fabrici.TipMancareFactory;

public class Main {
    public static void main(String[] args){
        TipMancareFactory fabricaDeSupe = new SupaFactory(450);
        FelMancare supa1 = fabricaDeSupe.preparaFelMancare(Supa.SupaCiuperci, 30, 400);

        FelMancare supa2 = fabricaDeSupe.preparaFelMancare(Supa.SupaLegume, 20, 300);

        System.out.println(supa1.toString());
        System.out.println(supa2.toString());
    }
}
