package FactoryMethodB3.Factories;

import FactoryMethodB3.Modules.Cheesecake;
import FactoryMethodB3.Modules.Clatite;
import FactoryMethodB3.Modules.Mancare;
import FactoryMethodB3.Modules.Papanasi;

public class DesertFactory implements MancareFactory{
    private String crema;

    public DesertFactory(String crema) {
        this.crema = crema;
    }

    @Override
    public Mancare getMancare(TipMancare tipMancare, float pret, int nrCalorii) {
        switch (tipMancare){
            case TipDesert.Clatite : return new Clatite(pret, nrCalorii, this.crema);
            case TipDesert.Papanasi: return new Papanasi(pret, nrCalorii, this.crema);
            case TipDesert.Cheesecake: return new Cheesecake(pret, nrCalorii, this.crema);
            default: return null;
        }
    }
}
