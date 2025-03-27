package ro.cts.clase;

public class RezervareBuilder implements IBuilder{
    private String numeClient;
    private boolean asezareGeam;
    private boolean scauneErgonomice;
    private boolean decorareMasa;
    private String genMuzica;

    public RezervareBuilder() {
        this.asezareGeam = false;
        this.scauneErgonomice = false;
        this.decorareMasa = false;
        this.genMuzica="fara muzica";
    }

    @Override
    public Rezervare buildRezervare(String numeClient) {
        return new Rezervare(numeClient,
                this.asezareGeam,
                this.scauneErgonomice,
                this.decorareMasa,
                this.genMuzica);
    }

    @Override
    public IBuilder setAsezareGeam(Boolean asezareGeam) {
       this.asezareGeam = asezareGeam;
       return this;
    }

    @Override
    public IBuilder setScauneErgonomice(Boolean scauneErgonomice) {
        this.scauneErgonomice = scauneErgonomice;
        return this;
    }

    @Override
    public IBuilder setDecorareMasa(Boolean decorareMasa) {
        this.decorareMasa = decorareMasa;
        return this;
    }

    @Override
    public IBuilder setGenMuzica(String genMuzica) {
        this.genMuzica = genMuzica;
        return this;
    }
}
