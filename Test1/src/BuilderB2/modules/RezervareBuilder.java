package BuilderB2.modules;

import java.util.concurrent.locks.ReadWriteLock;

public class RezervareBuilder implements IBuilder{
    private String nume;
    private boolean asezareGeam;
    private boolean scauneErgonomice;
    private boolean decorMasa;
    private boolean muzicaPersonalizata;
    private String genMuzica;

    public RezervareBuilder() {
        this.asezareGeam = false;
        this.scauneErgonomice = false;
        this.decorMasa = false;
        this.muzicaPersonalizata = false;
        this.genMuzica = "N/A";
    }


    @Override
    public Rezervare build(String nume) {
        return new Rezervare(nume, this.asezareGeam, this.scauneErgonomice, this.decorMasa, this.muzicaPersonalizata, this.genMuzica);
    }

    @Override
    public IBuilder setAsezareGeam(boolean asezareGeam) {
        this.asezareGeam = asezareGeam;
        return this;
    }

    @Override
    public IBuilder setScauneErgonomice(boolean scauneErgonomice) {
        this.scauneErgonomice = scauneErgonomice;
        return this;
    }

    @Override
    public IBuilder setDecorMasa(boolean decorMasa) {
        this.decorMasa = decorMasa;
        return this;
    }

    @Override
    public IBuilder setMuzicaPersonalizata(boolean muzicaPersonalizata) {
        this.muzicaPersonalizata = muzicaPersonalizata;
        return this;
    }

    @Override
    public IBuilder setGenMuzica(String genMuzica) {
        this.genMuzica = genMuzica;
        return this;
    }
}
