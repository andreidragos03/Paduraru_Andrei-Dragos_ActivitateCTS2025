package BuilderB2.modules;

public interface IBuilder {
    Rezervare build(String nume);
    IBuilder setAsezareGeam(boolean asezareGeam);
    IBuilder setScauneErgonomice(boolean scauneErgonomice);
    IBuilder setDecorMasa(boolean decorMasa);
    IBuilder setMuzicaPersonalizata(boolean muzicaPersonalizata);
    IBuilder setGenMuzica(String genMuzica);

}
