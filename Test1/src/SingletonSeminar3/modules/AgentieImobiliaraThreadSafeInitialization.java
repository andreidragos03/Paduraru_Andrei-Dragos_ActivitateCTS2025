package SingletonSeminar3.modules;

public class AgentieImobiliaraThreadSafeInitialization {
    private String denumire;
    private int nrAnunturi;
    private String site;
    private float cifraAfaceri;
    private static AgentieImobiliaraThreadSafeInitialization agentieImobiliaraThreadSafeInitialization = null;

    private AgentieImobiliaraThreadSafeInitialization(String denumire, int nrAnunturi, String site, float cifraAfaceri) {
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

    public static AgentieImobiliaraThreadSafeInitialization getAgentieImobiliaraThreadSafeInitialization() {
        return agentieImobiliaraThreadSafeInitialization;
    }

    public static void setAgentieImobiliaraThreadSafeInitialization(AgentieImobiliaraThreadSafeInitialization agentieImobiliaraThreadSafeInitialization) {
        AgentieImobiliaraThreadSafeInitialization.agentieImobiliaraThreadSafeInitialization = agentieImobiliaraThreadSafeInitialization;
    }

    public void posteazaAnunturi (String anunt) {
        this.nrAnunturi++;
    }

    public static synchronized AgentieImobiliaraThreadSafeInitialization getInstance(String denumire, int nrAnunturi, String site, float cifraAfaceri) {
        if(agentieImobiliaraThreadSafeInitialization == null) {
            agentieImobiliaraThreadSafeInitialization = new AgentieImobiliaraThreadSafeInitialization(denumire, nrAnunturi, site, cifraAfaceri);
        }
        return agentieImobiliaraThreadSafeInitialization;
    }
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AgentieImobiliaraThreadSafeInitialization{");
        sb.append("denumire='").append(denumire).append('\'');
        sb.append(", nrAnunturi=").append(nrAnunturi);
        sb.append(", site='").append(site).append('\'');
        sb.append(", cifraAfaceri=").append(cifraAfaceri);
        sb.append('}');
        return sb.toString();
    }

}
