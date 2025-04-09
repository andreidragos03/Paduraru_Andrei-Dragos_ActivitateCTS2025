package SimpleFactorySeminar3.modules;

public abstract class Supa {
    private int cantitate;
    private float pret;
    private boolean hasArdei;
    private boolean hasSmantana;

    public Supa(int cantitate, float pret, boolean hasArdei, boolean hasSmantana) {
        this.cantitate = cantitate;
        this.pret = pret;
        this.hasArdei = hasArdei;
        this.hasSmantana = hasSmantana;
    }

    public abstract void afiseazaDescriere();
    public abstract float calculeazaPretFinal();

    public int getCantitate() {
        return cantitate;
    }

    public float getPret() {
        return pret;
    }
}
