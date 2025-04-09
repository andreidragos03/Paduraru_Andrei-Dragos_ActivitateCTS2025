package PrototypeB4.modules;

public abstract class ARezervare {
    protected String nume;
    protected int ora;
    protected int nrPersoane;
    protected int zi;

    protected ARezervare() {
        this.nume = "Client";
        this.ora = 10;
        this.nrPersoane = 2;
        this.zi = 1;
    }

    public ARezervare(String nume, int ora, int nrPersoane, int zi) {
        if(nume.length() < 3) {
            this.nume = "Client";
        } else {
            this.nume = nume;
        }
        if(ora < 10 || ora > 22) {
            this.ora = 10;
        } else {
            this.ora = ora;
        }
        this.nrPersoane = nrPersoane;
        if(zi < 1 || zi > 31) {
            this.zi = 1;
        } else {
            this.zi = zi;
        }
    }

    public abstract ARezervare clonare (int zi);
}
