package PrototypeB4.modules;

public class Rezervare extends ARezervare{

    protected boolean isInterior;

    private Rezervare() {
        super();
    }


    public Rezervare(String nume, int ora, int nrPersoane, int zi, boolean isInterior) {
        super(nume, ora, nrPersoane, zi);
        this.isInterior = isInterior;
    }

    @Override
    public ARezervare clonare(int zi) {
        Rezervare r = new Rezervare();
        r.nume = this.nume;
        if(zi >= 1 && zi <= 31) {
            r.zi = zi;
        } else {
            r.zi = this.zi;
        }
        r.ora = this.ora;
        r.nrPersoane = this.nrPersoane;
        return  r;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("isInterior=").append(isInterior);
        sb.append(", nume='").append(nume).append('\'');
        sb.append(", ora=").append(ora);
        sb.append(", nrPersoane=").append(nrPersoane);
        sb.append(", zi=").append(zi);
        sb.append('}');
        return sb.toString();
    }
}
