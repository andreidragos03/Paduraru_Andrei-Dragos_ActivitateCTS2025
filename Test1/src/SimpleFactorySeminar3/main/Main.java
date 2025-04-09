package SimpleFactorySeminar3.main;

import SimpleFactorySeminar3.factories.SupaFactory;
import SimpleFactorySeminar3.factories.TipSupa;
import SimpleFactorySeminar3.modules.Supa;
import SimpleFactorySeminar3.modules.SupaVita;

public class Main {
    public static void main(String[] args) {
        SupaFactory fabrica = new SupaFactory(100, 15);
        try {
            Supa supaLegume = fabrica.getSupa(TipSupa.Legume, true, true);
            supaLegume.afiseazaDescriere();
        } catch (Exception e) {
             e.printStackTrace();
        }

        try {
            Supa supaCiuperci = fabrica.getSupa(TipSupa.Ciuperci, false, false);
            supaCiuperci.afiseazaDescriere();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            Supa supaVita = fabrica.getSupa(TipSupa.Vita, true, false);
            supaVita.afiseazaDescriere();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
