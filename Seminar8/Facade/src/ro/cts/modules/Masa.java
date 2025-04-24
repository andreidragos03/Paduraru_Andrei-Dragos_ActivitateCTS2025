package ro.cts.modules;

public class Masa {
    private boolean esteLibera;
    private int nrMasa;
    private int nrPersoane;

    public Masa(boolean esteLibera, int nrMasa, int nrPersoane) {
        this.esteLibera = esteLibera;
        this.nrMasa = nrMasa;
        this.nrPersoane = nrPersoane;
    }

    public boolean isEsteLibera() {
        return esteLibera;
    }

    public int getNrMasa() {
        return nrMasa;
    }

    public int getNrPersoane() {
        return nrPersoane;
    }
}
