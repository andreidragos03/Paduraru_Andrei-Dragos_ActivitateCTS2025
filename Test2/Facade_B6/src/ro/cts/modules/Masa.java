package ro.cts.modules;

public class Masa {
    private int nrMasa;
    private boolean esteLibera;

    public Masa(int nrMasa, boolean esteLibera) {
        this.nrMasa = nrMasa;
        this.esteLibera = esteLibera;
    }

    public int getNrMasa() {
        return nrMasa;
    }

    public void setNrMasa(int nrMasa) {
        this.nrMasa = nrMasa;
    }

    public boolean isEsteLibera() {
        return esteLibera;
    }

    public void setEsteLibera(boolean esteLibera) {
        this.esteLibera = esteLibera;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Masa{");
        sb.append("nrMasa=").append(nrMasa);
        sb.append(", esteLibera=").append(esteLibera);
        sb.append('}');
        return sb.toString();
    }
}
