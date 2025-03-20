package ro.cts.seminar4.models;

public class SupaLegume extends Supa{

    private static int discount;
    public SupaLegume(int cantitate, float pret, boolean hasArdei, boolean hasSmantana) {
        super(cantitate, pret, hasArdei, hasSmantana);
    }
    @Override
    public void afiseazaDescriere() {
        System.out.println("Supa de legume de " + super.getCantitate());
    }

    @Override
    public float calculeazaPretFinal() {
        return super.getPret()-super.getPret()*discount;
    }
}
