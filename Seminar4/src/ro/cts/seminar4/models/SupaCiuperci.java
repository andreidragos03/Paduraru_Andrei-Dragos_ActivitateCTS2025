package ro.cts.seminar4.models;

public class SupaCiuperci extends Supa{
    private static int discount;

    public SupaCiuperci(int cantitate, float pret, boolean hasArdei, boolean hasSmantana) {
        super(cantitate, pret, hasArdei, hasSmantana);
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Supa de ciuperci de " + super.getCantitate());
    }

    @Override
    public float calculeazaPretFinal() {
        return super.getPret()-super.getPret()*discount;
    }
}
