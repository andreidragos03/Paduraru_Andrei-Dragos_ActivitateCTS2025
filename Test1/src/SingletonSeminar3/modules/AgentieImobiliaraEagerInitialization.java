package SingletonSeminar3.modules;

public class AgentieImobiliaraEagerInitialization {
    private String nume;
    private int nrAnunturi;
    private String site;
    private float cifraAfaceri;
    private static final AgentieImobiliaraEagerInitialization agentieImobiliaraEagerInitialization = new AgentieImobiliaraEagerInitialization("Agentie1", 10, "Siteweb", 120000);

    private AgentieImobiliaraEagerInitialization(String nume, int nrAnunturi, String site, float cifraAfaceri) {
        this.nume = nume;
        this.nrAnunturi = nrAnunturi;
        this.site = site;
        this.cifraAfaceri = cifraAfaceri;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getNrAnunturi() {
        return nrAnunturi;
    }

    public void setNrAnunturi(int nrAnunturi) {
        this.nrAnunturi = nrAnunturi;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public float getCifraAfaceri() {
        return cifraAfaceri;
    }

    public void setCifraAfaceri(float cifraAfaceri) {
        this.cifraAfaceri = cifraAfaceri;
    }

    public void posteazaAnunt(String anunt) {
        this.nrAnunturi++;
    }

    public static AgentieImobiliaraEagerInitialization getInstance(){
        return agentieImobiliaraEagerInitialization;
    }
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AgentieImobiliaraEagerInitialization{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", nrAnunturi=").append(nrAnunturi);
        sb.append(", site='").append(site).append('\'');
        sb.append(", cifraAfaceri=").append(cifraAfaceri);
        sb.append('}');
        return sb.toString();
    }
}
