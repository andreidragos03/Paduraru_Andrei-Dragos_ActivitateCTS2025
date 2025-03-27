package ro.cts.clase;

public class Rezervare {
    private String numeClient;
    private boolean asezareGeam;
    private boolean scauneErgonomice;
    private boolean decorareMasa;
    private String genMuzica;

    public Rezervare(String numeClient, boolean asezareGeam, boolean scauneErgonomice, boolean decorareMasa, String genMuzica) {
        this.numeClient = numeClient;
        this.asezareGeam = asezareGeam;
        this.scauneErgonomice = scauneErgonomice;
        this.decorareMasa = decorareMasa;
        this.genMuzica = genMuzica;
    }

    public void setNumeClient(String numeClient) {
        this.numeClient = numeClient;
    }

    public void setAsezareGeam(boolean asezareGeam) {
        this.asezareGeam = asezareGeam;
    }

    public void setScauneErgonomice(boolean scauneErgonomice) {
        this.scauneErgonomice = scauneErgonomice;
    }

    public void setDecorareMasa(boolean decorareMasa) {
        this.decorareMasa = decorareMasa;
    }

    public void setGenMuzica(String genMuzica) {
        this.genMuzica = genMuzica;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("numeClient='").append(numeClient).append('\'');
        sb.append(", asezareGeam=").append(asezareGeam);
        sb.append(", scauneErgonomice=").append(scauneErgonomice);
        sb.append(", decorareMasa=").append(decorareMasa);
        sb.append(", genMuzica='").append(genMuzica).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
