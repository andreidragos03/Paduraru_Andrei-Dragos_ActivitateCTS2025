package ro.cts.clase;

public class RezervareBuilder implements IBuilder{
    Rezervare rezervare;

    public RezervareBuilder(String numeClient) {
        rezervare = new Rezervare(numeClient, false, false, false, "fara muzica");
    }

    @Override
    public Rezervare buildRezervare() {
        return this.rezervare;
    }

    @Override
    public IBuilder setAsezareGeam(Boolean asezareGeam) {
        rezervare.setAsezareGeam(asezareGeam);
        return this;
    }

    @Override
    public IBuilder setScauneErgonomice(Boolean scauneErgonomice) {
        rezervare.setScauneErgonomice(scauneErgonomice);
        return this;
    }

    @Override
    public IBuilder setDecorareMasa(Boolean decorareMasa) {
        rezervare.setDecorareMasa(decorareMasa);
        return this;
    }

    @Override
    public IBuilder setGenMuzica(String genMuzica) {
        rezervare.setGenMuzica(genMuzica);
        return this;
    }

    @Override
    public IBuilder setNumeClient(String numeClient) {
        rezervare.setNumeClient(numeClient);
        return this;
    }
}
