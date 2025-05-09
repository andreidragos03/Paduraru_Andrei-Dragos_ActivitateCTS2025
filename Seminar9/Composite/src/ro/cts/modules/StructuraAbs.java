package ro.cts.modules;

public abstract class StructuraAbs {
    private String nume;
    private int numarAngajati;

    public StructuraAbs(String nume, int numarAngajati) {
        this.nume = nume;
        this.numarAngajati = numarAngajati;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getNumarAngajati() {
        return numarAngajati;
    }

    public void setNumarAngajati(int numarAngajati) {
        this.numarAngajati = numarAngajati;
    }

    public abstract void adaugaNod(StructuraAbs structuraAbs);
    public abstract void stergeNod(StructuraAbs structuraAbs);
    public abstract StructuraAbs getNodCopil(int indexCopil);
    public abstract void afiseazaDescriere(String tab);
    public abstract int calculeazaNrAngajati();
}
