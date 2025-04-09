package SingletonSeminar3.modules;

public class AgentieImobiliaraLazyInitialization {
    private String denumire;
    private int nrAnunturi;
    private String site;
    private float cifraAfaceri;
    private static AgentieImobiliaraLazyInitialization agentieImobiliaraLazyInitialization = null;

    private AgentieImobiliaraLazyInitialization(String denumire, int nrAnunturi, String site, float cifraAfaceri) {
        this.denumire = denumire;
        this.nrAnunturi = nrAnunturi;
        this.site = site;
        this.cifraAfaceri = cifraAfaceri;
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
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

    public static AgentieImobiliaraLazyInitialization getInstance(String denumire, int nrAnunturi, String site, float cifraAfaceri) {
        if(agentieImobiliaraLazyInitialization == null) {
            agentieImobiliaraLazyInitialization = new AgentieImobiliaraLazyInitialization(denumire, nrAnunturi, site, cifraAfaceri);
        }
        return agentieImobiliaraLazyInitialization;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AgentieImobiliaraLazyInitialization{");
        sb.append("denumire='").append(denumire).append('\'');
        sb.append(", nrAnunturi=").append(nrAnunturi);
        sb.append(", site='").append(site).append('\'');
        sb.append(", cifraAfaceri=").append(cifraAfaceri);
        sb.append('}');
        return sb.toString();
    }
}
