package ro.cts.clase;

public interface IBuilder {
    Rezervare buildRezervare();

    IBuilder setAsezareGeam(Boolean asezareGeam);
    IBuilder setScauneErgonomice(Boolean scauneErgonomice);
    IBuilder setDecorareMasa(Boolean decorareMasa);
    IBuilder setGenMuzica(String genMuzica);
    IBuilder setNumeClient(String numeClient);
}
