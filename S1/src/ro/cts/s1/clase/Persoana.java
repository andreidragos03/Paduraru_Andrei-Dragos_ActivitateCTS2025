package ro.cts.s1.clase;

import ro.cts.s1.interfete.IPersoana;

public abstract class Persoana implements IPersoana {
    private String nume;
    protected int varsta;

    public Persoana() {
        nume = "N/A";
        varsta = 0;
    }

    public Persoana(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    @Override
    public String getNume() {
        return nume;
    }

    @Override
    public int getVarsta() {
        return varsta;
    }

    public abstract float calculareVenit();
}