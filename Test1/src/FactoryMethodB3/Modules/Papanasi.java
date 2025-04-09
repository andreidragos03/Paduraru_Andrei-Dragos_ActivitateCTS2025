package FactoryMethodB3.Modules;

public class Papanasi extends Mancare{

    private String crema;

    public Papanasi(float pret, int nrCalorii, String crema) {
        super(pret, nrCalorii);
        this.crema = crema;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Papanasi{");
        sb.append("crema='").append(crema).append('\'');
        sb.append(", pret=").append(pret);
        sb.append(", nrCalorii=").append(nrCalorii);
        sb.append('}');
        return sb.toString();
    }
}
