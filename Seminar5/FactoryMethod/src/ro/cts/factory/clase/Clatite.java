package ro.cts.factory.clase;

public class Clatite extends FelMancare{
    private String crema;

    public Clatite(float pret, int nrCalorii, String crema) {
        super(pret, nrCalorii);
        this.crema = crema;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Clatite{");
        sb.append("crema='").append(crema).append('\'');
        sb.append(", pret=").append(pret);
        sb.append(", nrCalorii=").append(nrCalorii);
        sb.append('}');
        return sb.toString();
    }
}
