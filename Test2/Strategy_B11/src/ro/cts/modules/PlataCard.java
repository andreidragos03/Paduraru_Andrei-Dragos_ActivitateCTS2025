package ro.cts.modules;

public class PlataCard implements IMetodaPlata{
    private float sold;

    public PlataCard(float sold) {
        this.sold = sold;
    }

    @Override
    public void plateste(float total) {
        if(sold >= total) {
            sold -= total;
            System.out.println("Ati platit cu succes cu cardul suma de " + total + " RON");
        } else {
            System.out.println("Sold insuficient");
        }
    }
}
