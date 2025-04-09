package BuilderB2.modules;

public class Rezervare {
    private String nume;
    private boolean asezareGeam;
    private boolean scauneErgonomice;
    private boolean decorMasa;
    private boolean muzicaPersonalizata;
    private String genMuzica;

    protected Rezervare(String nume, boolean asezareGeam, boolean scauneErgonomice, boolean decorMasa, boolean muzicaPersonalizata, String genMuzica) {
        this.nume = nume;
        this.asezareGeam = asezareGeam;
        this.scauneErgonomice = scauneErgonomice;
        this.decorMasa = decorMasa;
        this.muzicaPersonalizata = muzicaPersonalizata;
        this.genMuzica = genMuzica;
    }

    protected void setNume(String nume) {
        this.nume = nume;
    }

    protected void setAsezareGeam(boolean asezareGeam) {
        this.asezareGeam = asezareGeam;
    }

    protected void setScauneErgonomice(boolean scauneErgonomice) {
        this.scauneErgonomice = scauneErgonomice;
    }

    protected void setDecorMasa(boolean decorMasa) {
        this.decorMasa = decorMasa;
    }

    protected void setMuzicaPersonalizata(boolean muzicaPersonalizata) {
        this.muzicaPersonalizata = muzicaPersonalizata;
    }

    protected void setGenMuzica(String genMuzica) {
        this.genMuzica = genMuzica;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", asezareGeam=").append(asezareGeam);
        sb.append(", scauneErgonomice=").append(scauneErgonomice);
        sb.append(", decorMasa=").append(decorMasa);
        sb.append(", muzicaPersonalizata=").append(muzicaPersonalizata);
        sb.append(", genMuzica='").append(genMuzica).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
