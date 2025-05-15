package ro.cts.main;

import ro.cts.models.Tramvai;
import ro.cts.models.TramvaiAbs;
import ro.cts.models.TramvaiTemporar;

public class Main {
    public static void main(String[] args) {
        TramvaiAbs tramvai = new Tramvai(3);
        TramvaiAbs tramvaiTemporar = new TramvaiTemporar();

        tramvai.parcurgeTur();
        tramvai.parcurgeRetur();
        System.out.println();
        tramvaiTemporar.parcurgeTur();
        tramvaiTemporar.parcurgeRetur();


    }
}
