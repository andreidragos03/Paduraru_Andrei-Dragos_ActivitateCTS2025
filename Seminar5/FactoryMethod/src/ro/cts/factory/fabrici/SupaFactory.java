package ro.cts.factory.fabrici;

import ro.cts.factory.clase.FelMancare;
import ro.cts.factory.clase.SupaCiuperci;
import ro.cts.factory.clase.SupaLegume;

public class SupaFactory implements TipMancareFactory{

    private int cantitate;

    public SupaFactory(int cantitate) {
        this.cantitate = cantitate;
    }

    public void setCantitate(int cantitate) {
        this.cantitate = cantitate;
    }

    @Override
    public FelMancare preparaFelMancare(TipFelMancare tip, float pret, int nrCalorii) {
        return switch (tip){
            case Supa.SupaCiuperci -> new SupaCiuperci(pret, nrCalorii, this.cantitate);
            case Supa.SupaLegume -> new SupaLegume(pret, nrCalorii, this.cantitate);
            default -> null;
        };
    }
}
