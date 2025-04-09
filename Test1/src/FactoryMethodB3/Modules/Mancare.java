package FactoryMethodB3.Modules;

public abstract class Mancare {
    protected float pret;
    protected int nrCalorii;

    public Mancare(float pret, int nrCalorii) {
        this.pret = pret;
        this.nrCalorii = nrCalorii;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SupaVita{");
        sb.append("pret=").append(pret);
        sb.append(", nrCalorii=").append(nrCalorii);
        sb.append('}');
        return sb.toString();
    }
}
