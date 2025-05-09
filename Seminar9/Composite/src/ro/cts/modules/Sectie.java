package ro.cts.modules;


public class Sectie extends StructuraAbs{
    public Sectie(String nume, int numarAngajati) {
        super(nume, numarAngajati);
    }

    @Override
    public void adaugaNod(StructuraAbs structuraAbs) {
        System.out.println("Nu se poate");
    }

    @Override
    public void stergeNod(StructuraAbs structuraAbs) {
        System.out.println("Nu se poate");
    }

    @Override
    public StructuraAbs getNodCopil(int indexCopil) {
        return this;
    }

    @Override
    public void afiseazaDescriere(String tab) {
        System.out.println( tab + "Sectia " + this.getNume());
    }

    @Override
    public int calculeazaNrAngajati() {
        return this.getNumarAngajati();
    }
}
