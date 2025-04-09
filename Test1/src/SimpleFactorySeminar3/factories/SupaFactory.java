package SimpleFactorySeminar3.factories;

import SimpleFactorySeminar3.modules.Supa;
import SimpleFactorySeminar3.modules.SupaCiuperci;
import SimpleFactorySeminar3.modules.SupaLegume;
import SimpleFactorySeminar3.modules.SupaVita;

public class SupaFactory {
    private int cantitate;
    private float pret;

    public SupaFactory(int cantitate, float pret) {
        this.cantitate = cantitate;
        this.pret = pret;
    }

    public Supa getSupa(TipSupa tipSupa, Boolean hasArdei, Boolean hasSmantana) throws Exception{
        switch (tipSupa) {
            case Vita :return new SupaVita(cantitate, pret, hasArdei, hasSmantana);
            case Legume: return new SupaLegume(cantitate, pret, hasArdei, hasSmantana);
            case Ciuperci: return new SupaCiuperci(cantitate, pret, hasArdei, hasSmantana);
            default: throw new Exception("Tip invalid");
        }
    }
}
