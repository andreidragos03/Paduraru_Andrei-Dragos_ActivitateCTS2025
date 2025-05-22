package ro.cts.modules;

public abstract class AMasa {
    protected int nrMasa;

    public AMasa(int nrMasa) {
        this.nrMasa = nrMasa;
    }

    protected abstract void curataMasa();
    protected abstract void asazaServetele();
    protected abstract void asazaTacamuri();
    protected abstract void invitaPersoane();

    public final void pregatesteMasa() {
        curataMasa();
        asazaServetele();
        asazaTacamuri();
        invitaPersoane();
    }
}
