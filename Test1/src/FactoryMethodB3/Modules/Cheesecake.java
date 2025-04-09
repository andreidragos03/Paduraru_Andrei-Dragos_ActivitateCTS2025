package FactoryMethodB3.Modules;

public class Cheesecake extends Mancare{
    private String crema;

    public Cheesecake(float pret, int nrCalorii, String crema) {
        super(pret, nrCalorii);
        this.crema = crema;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cheesecake{");
        sb.append("crema='").append(crema).append('\'');
        sb.append(", pret=").append(pret);
        sb.append(", nrCalorii=").append(nrCalorii);
        sb.append('}');
        return sb.toString();
    }
}
