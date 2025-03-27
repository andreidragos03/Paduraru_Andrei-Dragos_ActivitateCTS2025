package ro.cts.factory.fabrici;

import ro.cts.factory.clase.Clatite;
import ro.cts.factory.clase.FelMancare;
import ro.cts.factory.clase.Papanasi;

public class DesertFactory implements TipMancareFactory{
    private String crema;

    public DesertFactory(String crema) {
        this.crema = crema;
    }

    public void setCrema(String crema) {
        this.crema = crema;
    }

    @Override
    public FelMancare preparaFelMancare(TipFelMancare tip, float pret, int nrCalorii) {
        return switch (tip){
            case Desert.Papanasi -> new Papanasi(pret, nrCalorii, this.crema);
            case Desert.Clatite -> new Clatite(pret, nrCalorii, this.crema);
            default -> null;
        };
    }
}
