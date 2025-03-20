package ro.cts.seminar4.models;

public class SupaVita extends Supa{
    private static int discount;
    public SupaVita(int cantitate, float pret, boolean hasArdei, boolean hasSmantana) {
        super(cantitate, pret, hasArdei, hasSmantana);
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Supa de vita de " + super.getCantitate());
    }

    @Override
    public float calculeazaPretFinal() {
        return super.getPret()-super.getPret()*discount;
    }
}
