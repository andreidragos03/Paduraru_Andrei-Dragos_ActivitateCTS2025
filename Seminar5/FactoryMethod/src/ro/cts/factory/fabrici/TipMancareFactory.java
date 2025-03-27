package ro.cts.factory.fabrici;

import ro.cts.factory.clase.FelMancare;

public interface TipMancareFactory {
    FelMancare preparaFelMancare(TipFelMancare tip, float pret, int nrCalorii);
}
