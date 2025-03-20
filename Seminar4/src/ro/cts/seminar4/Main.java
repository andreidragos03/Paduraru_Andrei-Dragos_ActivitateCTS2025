package ro.cts.seminar4;

import ro.cts.seminar4.bucatarie.Bucatarie;
import ro.cts.seminar4.bucatarie.TipSupa;
import ro.cts.seminar4.models.Supa;
import ro.cts.seminar4.rezervare.ARezervare;
import ro.cts.seminar4.rezervare.Rezervare;

public class Main {

    public static void main(String[] args){
        Bucatarie bucatarie = new Bucatarie(250, 25.5f);
        Supa supaLegume = bucatarie.getSupa(TipSupa.LEGUME, true, false);
        Supa supaVita = bucatarie.getSupa(TipSupa.VITA, false, true);

        supaLegume.afiseazaDescriere();
        supaVita.afiseazaDescriere();

        Bucatarie cantina = new Bucatarie(500, 10.5f);

        ARezervare r1 = new Rezervare("Andrei", 13, 2, 12, Boolean.TRUE);
        ARezervare r2 = r1.clonare(20);
        System.out.println(r2.toString());
    }
}
