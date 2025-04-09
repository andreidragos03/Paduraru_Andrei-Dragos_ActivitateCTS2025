package FactoryMethodB3.Modules;

public class SupaVita extends Mancare{

    private int cantitate;

    public SupaVita(float pret, int nrCalorii, int cantitate) {
        super(pret, nrCalorii);
        this.cantitate = cantitate;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SupaVita{");
        sb.append("cantitate=").append(cantitate);
        sb.append(", pret=").append(pret);
        sb.append(", nrCalorii=").append(nrCalorii);
        sb.append('}');
        return sb.toString();
    }
}
