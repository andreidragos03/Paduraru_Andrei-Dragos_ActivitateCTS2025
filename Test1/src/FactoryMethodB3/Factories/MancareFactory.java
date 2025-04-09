package FactoryMethodB3.Factories;

import FactoryMethodB3.Modules.Mancare;

public interface MancareFactory {
    Mancare getMancare(TipMancare tipMancare, float pret, int nrCalorii);
}
