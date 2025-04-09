package SingletonRegistrySeminar3.modules;

public abstract class Anunt {
    private String adresa;
    private int nrAnunt;
    private float pret;

    protected Anunt() {
        this.adresa = "Adresa basic";
        this.nrAnunt = 1;
        this.pret = 100;
    }

    protected Anunt(String adresa, int nrAnunt, float pret) throws Exception {
        this.adresa = adresa;
        this.nrAnunt = nrAnunt;
        if(pret>0) {
            this.pret = pret;
        } else {
            throw new Exception("Pret invalid");
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Anunt{");
        sb.append("adresa='").append(adresa).append('\'');
        sb.append(", nrAnunt=").append(nrAnunt);
        sb.append(", pret=").append(pret);
        sb.append('}');
        return sb.toString();
    }

    public abstract void descriere();
}
