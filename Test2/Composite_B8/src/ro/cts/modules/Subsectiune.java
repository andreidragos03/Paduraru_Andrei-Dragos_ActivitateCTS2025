package ro.cts.modules;

public class Subsectiune implements Structura{
    private String nume;
    private float pret;

    public Subsectiune(String nume, float pret) {
        this.nume = nume;
        this.pret = pret;
    }

    @Override
    public void adaugaNod(Structura structura) throws Exception {
        throw new Exception("Nu se poate");
    }

    @Override
    public void stergeNod(Structura structura) throws Exception {
        throw new Exception("Nu se poate");
    }

    @Override
    public Structura getNodCopil(int index) throws Exception {
        throw new Exception("Nu se poate");
    }

    @Override
    public void descriereStructura() {
        System.out.println("Subsectiunea " + nume + " are pretul " + pret);
    }
}
