package FactoryMethodB3.Factories;

import FactoryMethodB3.Modules.Mancare;
import FactoryMethodB3.Modules.SupaCiuperci;
import FactoryMethodB3.Modules.SupaLegume;
import FactoryMethodB3.Modules.SupaVita;

public class SupaFactory implements MancareFactory{

    private int cantitate;

    public SupaFactory(int cantitate) {
        this.cantitate = cantitate;
    }

    @Override
    public Mancare getMancare(TipMancare tipMancare, float pret, int nrCalorii) {
        switch (tipMancare) {
            case TipSupa.Ciuperci: return new SupaCiuperci(pret, nrCalorii, this.cantitate);
            case TipSupa.Legume: return new SupaLegume(pret, nrCalorii, this.cantitate);
            case TipSupa.Vita: return new SupaVita(pret, nrCalorii, this.cantitate);
            default: return null;
        }
    }
}
