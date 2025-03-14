package ro.cts.pachet.seminar3.anunturi;

public class Anunt {
    private String adresa;
    private String proprietar;
    private int nrCamere;
    private int nrAnunt;

    protected Anunt(String adresa, String proprietar, int nrCamere, int nrAnunt) {
        this.adresa = adresa;
        this.proprietar = proprietar;
        this.nrCamere = nrCamere;
        this.nrAnunt = nrAnunt;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Anunt{");
        sb.append("adresa='").append(adresa).append('\'');
        sb.append(", proprietar='").append(proprietar).append('\'');
        sb.append(", nrCamere=").append(nrCamere);
        sb.append(", nrAnunt=").append(nrAnunt);
        sb.append('}');
        return sb.toString();
    }
}
