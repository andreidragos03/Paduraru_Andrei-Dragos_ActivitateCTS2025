package SimpleFactorySeminar3.modules;

public class SupaCiuperci extends Supa{
    private static int discount;

    public SupaCiuperci(int cantitate, float pret, boolean hasArdei, boolean hasSmantana) {
        super(cantitate, pret, hasArdei, hasSmantana);
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Supa de ciuperci");
    }

    @Override
    public float calculeazaPretFinal() {
        return super.getPret()-discount*super.getPret();
    }
}
