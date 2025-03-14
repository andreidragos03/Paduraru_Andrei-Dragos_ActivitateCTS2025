package ro.cts.pachet.seminar3;

public class AgentieImobiliaraLazy {
    private String nume;
    private int nrAnunturi;
    private String site;
    private float cifraAfaceri;
    private static AgentieImobiliaraLazy agentieImobiliara= null;

    private AgentieImobiliaraLazy(String nume, int nrAnunturi, String site, float cifraAfaceri) {
        this.nume = nume;
        this.nrAnunturi = nrAnunturi;
        this.site = site;
        this.cifraAfaceri = cifraAfaceri;
    }
    public static AgentieImobiliaraLazy getAgentieImobiliaraLazy(String nume, int nrAnunturi, String site, float cifraAfaceri) {
        if(agentieImobiliara==null){
            agentieImobiliara = new AgentieImobiliaraLazy(nume, nrAnunturi, site, cifraAfaceri);
        }
        return agentieImobiliara;
    }

    public String getSite() {
        return site;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AgentieImobiliaraLazy{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", nrAnunturi=").append(nrAnunturi);
        sb.append(", site='").append(site).append('\'');
        sb.append(", cifraAfaceri=").append(cifraAfaceri);
        sb.append('}');
        return sb.toString();
    }
}
